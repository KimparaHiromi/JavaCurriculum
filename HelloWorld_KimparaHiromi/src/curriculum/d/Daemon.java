package curriculum.d;

/**********************************************************************************
* [概要] 課題 7.25 「プログラム作成２」の課題にて使用する「『デーモン』クラス」
* （「Player」との共通の親である「Character」の子となるクラス。テキストファイルからステータスを読み込むCPU敵役。）
* [詳細] 
* ① 必要な機能（IOException、Files、Paths、List、Random）をインポート
* ② コンストラクタ「A」：「コンストラクタ『B』」のための準備
* ③ コンストラクタ補助メソッド：コンストラクタを成立させるためにテキストファイルからステータスデータを持ってくる。
* ④ コンストラクタ「B」：実質的なメインとなるコンストラクタ「名前/name」、「体力/hp」、「攻撃力/at」、「素早さ/sp」を初期設定する。
* 
**********************************************************************************/

/*-------------------------------------------------------------------------
[概要]① 必要な機能（IOException、Files、Paths、List、Random）をインポート
-------------------------------------------------------------------------*/

import java.io.IOException; // ファイル操作で起きたエラー（例外）の処理を行う機能をインポート
import java.nio.file.Files; // ファイルの読み込みを行う機能をインポート
import java.nio.file.Paths; // ファイルの場所を指定する機能をインポート
import java.util.List; // リスト機能をインポート
import java.util.Random; // ランダムなステータスを生成するための機能をインポート

public class Daemon extends Character { 
	
	/*-------------------------------------------------------------------------
	[概要]② コンストラクタ「A」※：「テキストから取り込んだ名前と数値」を持つように指示して、別のコンストラクタ「B」へ向かわせる。
	→ ※ そのままでは「super()の前に何も書いてはいけない」ルールの関係で書けなかったので、先に補助メソッドを挟む。
	-------------------------------------------------------------------------*/
	public Daemon() { 
	 this(loadDaemonData("daemon_status.txt")); 
	} 
	
	/*-------------------------------------------------------------------------
	[概要]③ コンストラクタ補助メソッド：コンストラクタを成立させるために、「コンストラクタ『A』」からの呼び出しで
	        「コンストラクタ『B』」のためにテキストファイルからステータスデータを持ってくる。（できない場合は代替の数値を持っていく）
	-------------------------------------------------------------------------*/
	private static Object[] loadDaemonData(String fileName) {
	 String name = "Lesser Daemon";
	 int hp = 60;
	 int at = 10; 
	 int sp = 5;
	 try { 
      List<String> lines = Files.readAllLines(Paths.get(fileName)); 
      if (!lines.isEmpty()) { // ファイルチェック開始（「空」でないか？） 
       name = lines.get(0).trim(); // １行目の文字列が「名前/name」へ入るか？ 
      } 
      
      for (int lineNum = 1; lineNum < lines.size(); lineNum++) { // ファイルチェックのループ（２行目以降の「ステータス」部分） 
       String line = lines.get(lineNum); 
       if (!line.contains(":")) continue; // 切れ目の ":（半角）" がない行は飛ばす 
       
       String[] parts = line.split(":"); 
       String key = parts[0].trim(); // 「trim()」 ← これがあると「前後の余白をカットしてくれる」とのこと。 
       int value = Integer.parseInt(parts[1].trim());  // part[0]：前半の部分「項目名」（鍵：key） / part[1]：後半の部分「ステータスの値」（値：value） 
       
       if (key.equals("HP")) hp = value; // 「項目名」が一致するかチェック 
       else if (key.equals("AT")) at = value; 
       else if (key.equals("SP")) sp = value; 
      } 
     } catch (IOException e) { 
      System.err.println("警告：ファイル '" + fileName + "' が見つかりませんでした。"); 
      System.err.println("ランダムなステータスの敵キャラクターを出現させます。"); 
      Random rand = new Random(); // 「Random」クラスのインスタンス生成（※読み込めなかった時の非常用。ランダムな値の敵にも転用可能。） 
      hp = rand.nextInt(41) + 40; // 40～80 
      at = rand.nextInt(11) + 5; // 5～10 
      sp = rand.nextInt(10) + 1; // 1～10 
      
     } catch (Exception e) {
      System.err.println("警告：ステータスファイルの形式が正しくありません。");
      System.err.println("「基本値」の敵キャラクターを出現させます。");
     }
     return new Object[] { name, hp, at, sp };
	}
	
	/*-------------------------------------------------------------------------
	[概要]④ コンストラクタ「B」※：「名前/name」、「体力/hp」、「攻撃力/at」、「素早さ/sp」を初期設定
	→ ※ そのままでは「super()の前に何も書いてはいけない」ルールの関係で書けなかったので、先に補助メソッドを挟む。
	      ここでは、引数として持ってきた「名前」と「テキストから持ってきたデータ」（もしくは「ランダムな数値」か「初期値」）を使って初期設定をする。
	-------------------------------------------------------------------------*/
    private Daemon(Object[] data) { 
     super((String)data[0], (int)data[1], (int)data[2],(int)data[3]); // 名前、HP、AT、SP の順
     
     System.out.println("敵キャラクター " + name + " が出現しました。");
    } 
	
    
    
	/* メモ : 「Key-Value Pair（キー・バリュー・ペア）」
	 * データの名前：Key（鍵）
	 * データの数値：Value（値）
	 */
	
	
}
