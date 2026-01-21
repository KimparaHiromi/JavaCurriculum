package curriculum.d;

/**********************************************************************************
* [概要] 課題 7.25 「プログラム作成２」の課題にて使用する（実質的な）「『メイン』クラス」
* [詳細] 
* ① ユーザーからの入力を受け付けるために「Scanner」をインポート
* ② インターフェース「Participant」の適用
* ③ プライベート変数「手（int hand）」を所持
* ④ 入力された「手」のインスタンス化および定数化
* ⑤ 入力された値が正しいかチェックして、「手」を決定する
* ⑥ 決定した「手」の「判定用の数値」を返す
* ⑦ 決定した「手」の名前を文字列として返す
* 
* import java.util.Scanner; // ①
* 
**********************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) { 
     Scanner scanner = new Scanner(System.in); // Scanner の開始 
     
     System.out.println(" ◆「Player vs Daemon」バトルプログラム ◆ "); 
     System.out.print("プレイヤーの名前を入力してください: "); 
     String playerName = scanner.nextLine(); 
     
     Player player = new Player(playerName); 
     Daemon daemon = new Daemon(); 
     
     List<Character> participants = new ArrayList<>(); 
     participants.add(player); 
     participants.add(daemon); 
     
     BattleManager manager = new BattleManager(); 
     
     try { 
      manager.startBattle(participants); 
     } catch (Exception e) { 
      System.err.println("予期せぬエラーが発生しました: " + e.getMessage()); // 「Exception」を使うと「getMessage()」を呼ぶことで原因を表示できる、とのこと 
      e.printStackTrace(); // 「何行目でエラーが発生したか？」の表示 
     } finally { 
      scanner.close(); // Scannerを閉鎖 
     } 
    } 

} 
