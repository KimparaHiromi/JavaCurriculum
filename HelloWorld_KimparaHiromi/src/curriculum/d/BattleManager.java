package curriculum.d;

/**********************************************************************************
* [概要] 課題 7.25 「プログラム作成２」の課題にて使用する「『バトルマネージャー』クラス」
* （「Player」インスタンスと「Daemon」インスタンスを戦わせる機能を持つクラス）
* [詳細] 
* ① 必要な機能（IOException、Files、Paths、StandardOpenOption、List）をインポート
* ② メソッド「startBattle」：「キャラクター/Character」のリスト「参加者/participants」の中のキャラクターを最後の１つになるまで「戦わせる」。（および結果を記録する）
* ③ メソッド「addLog」：「画面への出力」と「記録」を同時に行う。
* ④ メソッド「saveLog」：ファイルへの書き出しをする。
* ⑤ メソッド「countAlive」：キャラクターのリストの中で「isAlive」がtrueである者の数を数える。
* ⑥ メソッド「findTarget」：キャラクターのリストの中から自分である「攻撃者/attacker」以外の「攻撃対象」を探す。
* ⑦ メソッド「showResult」：キャラクターのリストの中から最後の生き残りである勝者の名前を表示する。
* 
**********************************************************************************/

/*-------------------------------------------------------------------------
[概要]① 必要な機能（IOException、Files、Paths、StandardOpenOption、List）をインポート
-------------------------------------------------------------------------*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class BattleManager {
	
	/*-------------------------------------------------------------------------
	[概要]② メソッド「startBattle」：「キャラクター/Character」のリスト「参加者/participants」の中のキャラクターを最後の１つになるまで「戦わせる」。
	         （および結果を記録する）
	-------------------------------------------------------------------------*/
	public void startBattle(List<Character> participants) { // 一応念のため、「後にデーモン以外のキャラクターも参戦可能」な拡張性の確保
	 StringBuilder log = new StringBuilder(); // 「記録/log」インスタンスの生成（※ こうすることで、「 + 」で文字列を繋げなくとも機能する、とのこと）
	 addLog(log, " ◆ バトル開始 ◆ "); // 記録開始
	 
	 for (Character c : participants) {
      addLog(log, c.getName() + " (HP:" + c.getHp() + " AT:" + c.getAt() + " SP:" + c.getSp() + ")");
     }
	 
     participants.sort((c1, c2) -> c2.getSp() - c1.getSp()); // 「素早さ/SP」順に並び変える
     
     addLog(log, System.lineSeparator() + "【 行動順 】"); // 「行動順」の出力と記録
     for (Character c : participants) { 
      addLog(log, " ↓ " + c.getName()); 
     } 
     
     int turn = 1; // ターン数
     while (countAlive(participants) > 1) { // 「生存確認」がtrueであるキャラクターが１人になるまで繰り返すバトルロワイヤル形式
      addLog(log, System.lineSeparator() + "[第 " + turn + " ターン]");
      for (Character attacker : participants) { // 「攻撃側」に回るキャラクター全員に繰り返す
       if (!attacker.isAlive()) continue; // 「攻撃側」の「生存確認」チェック
       
       Character target = findTarget(attacker, participants);
       if (target != null) { // 攻撃対象の存在チェック
        String battleResult = attacker.attack(target);
        addLog(log, battleResult);
        
        if (!target.isAlive()) {
         addLog(log, target.getName() + " は倒れた！");
        }
       } 
       if (countAlive(participants) <= 1) break;  // 決着の確認
      }
      turn++;
     } 

     showResult(participants, log); 

     saveLog(log.toString(), "battle_log.txt"); // 結果の記録を保存
	}

	/*-------------------------------------------------------------------------
	[概要]③ メソッド「addLog」：「画面への出力」と「記録」を同時に行う。
	-------------------------------------------------------------------------*/
	private void addLog(StringBuilder log, String message) { 
     System.out.println(message); 
     log.append(message).append(System.lineSeparator()); 
 	}

	/*-------------------------------------------------------------------------
	[概要]④ メソッド「saveLog」：ファイルへの書き出しをする。
	-------------------------------------------------------------------------*/
	private void saveLog(String content, String fileName) { 
     try { 
      Files.write(Paths.get(fileName), content.getBytes(),StandardOpenOption.CREATE, StandardOpenOption.APPEND); // CREATE: 無い場合に新規作成する / APPEND: すでにあれば追記する 
      System.out.println(System.lineSeparator() + "--- バトルログを " + fileName + " に保存しました ---"); 
     } catch (IOException e) { 
      System.err.println("ログの保存に失敗しました: " + e.getMessage()); // 記録保存失敗時 
     } 
	} 

	/*-------------------------------------------------------------------------
	[概要]⑤ メソッド「countAlive」：キャラクターのリストの中で「isAlive」がtrueである者の数を数える。
	-------------------------------------------------------------------------*/
    private int countAlive(List<Character> list) { 
     int count = 0; 
     for (Character c : list) { 
      if (c.isAlive()) count++; 
     } 
     return count; 
    } 

    /*-------------------------------------------------------------------------
	[概要]⑥ メソッド「findTarget」：キャラクターのリストの中から自分である「攻撃者/attacker」以外の「攻撃対象」を探す。
	-------------------------------------------------------------------------*/
    private Character findTarget(Character attacker, List<Character> list) { 
     for (Character c : list) { 
      if (c != attacker && c.isAlive()) { 
       return c; // 最初に見つかった自分以外の生存者の値を返す 
      } 
     } 
     return null; // 自分以外の生存者なし 
    }

    /*-------------------------------------------------------------------------
	[概要]⑦ メソッド「showResult」：キャラクターのリストの中から最後の生き残りである勝者の名前を表示する。
	-------------------------------------------------------------------------*/
    private void showResult(List<Character> list, StringBuilder log) { 
     addLog(log, System.lineSeparator() + " ◆ 結果発表 ◆ ");
     for (Character c : list) { 
      if (c.isAlive()) { 
       addLog(log, "【 勝者: " + c.getName() + " 】");
       return; 
      } 
     } 
     addLog(log, "【 勝者無し（全員倒れました）】"); 
    }
    
}
