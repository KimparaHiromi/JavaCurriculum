package curriculum.b;

import java.util.Random; // 3_12 で使うためインポート

/**********************************************************************************
* [概要] Question 3 の課題処理
* [詳細] Question 3_1 ～ Question 3_12 までの課題内容およびそれに基づく解答結果を出力する。
* （ Question 3_1 ～ 3_5 までは for、Question 3_6 ～ 3_12 は while ）
**********************************************************************************/

import java.util.Scanner; // 3_10 以降で使うためインポート

public class Question3 {

	/*-------------------------------------------------------------------------
	[概要] Question 3_1 ～ Question 3_5 の解答
	-------------------------------------------------------------------------*/
	
	public static void main(String[] args) { 
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_1 : int型の変数が指定された値になるまで列挙して出力
		-------------------------------------------------------------------------*/
		
		for ( int for1 = 1; for1 <= 10; for1++ ) { 
		 System.out.print( for1 + " " );
		} 
		System.out.println(); // 改行
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_2 : int型の変数が指定された値になるまでの中の偶数のみを列挙して出力
		-------------------------------------------------------------------------*/
		
		for ( int for2 = 2; for2 <= 20; for2++ ) { 
		 if ( ( for2 % 2 ) != 0 ) { // 2 で割った余りが 0 でないときにはスキップする
		  continue;
		 }
		 System.out.print( for2 + " " );
		} 
		System.out.println(); // 改行
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_3 : int型の変数が指定された値になるまで列挙して出力
		-------------------------------------------------------------------------*/
		
		for ( int for3 = 10; for3 >= 1; for3-- ) { 
		 System.out.print( for3 + " " );
		} 
		System.out.println(); // 改行
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_4 : int型の変数の和を出力
		-------------------------------------------------------------------------*/
		
		int for4Sum = 0;
		for ( int for4 = 1; for4 <= 100; for4++ ) { 
		 for4Sum = for4Sum + for4 ;
		} 
		System.out.println( for4Sum ); // 結果出力
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_5 : for文を使って「 * 」を出力して三角形を描写
		-------------------------------------------------------------------------*/
		
		for ( int for5 = 1; for5 <= 5; for5++ ) { 
		 for ( int for5Num = 0; for5Num < for5; for5Num++ ) { 
		 System.out.print( "*" );
		 } 
		System.out.println(); // 改行
		}
		
		
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_6 : while文を使って数字を列挙したものを出力
		-------------------------------------------------------------------------*/
		
		int while6 = 1;
		while ( while6 <= 10 ) { 
		 System.out.print( while6 + " " );
		 while6 += 1;
		}
		System.out.println(); // 改行
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_7 : while文を使って指定された値までの間にある偶数のみを列挙して出力
		-------------------------------------------------------------------------*/
		
		int while7 = 2;
		while ( while7 <= 20 ) { 
		 if ( ( while7 % 2 ) != 0 ) { // 2 で割った余りが 0 でないときにはスキップする
		  while7++;
		  continue;
		 } 
		 System.out.print( while7 + " " );
		 while7++;
		} 
		System.out.println(); // 改行
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_8 : while文を使って指定された値になるまで列挙して出力
		-------------------------------------------------------------------------*/
		
		int while8 = 10;
		while (  while8 >= 1 ) { 
		 System.out.print( while8 + " " );
		 while8--;
		} 
		System.out.println(); // 改行
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_9 : while文を使ってint型の変数の和を出力
		-------------------------------------------------------------------------*/
		
		int while9 = 1; // 実行回数カウント
		int while9Sum = 0; // 合計
		while ( while9 <= 100 ) { 
		 while9Sum += while9;
		 while9++;
		} 
		System.out.println( while9Sum ); // 結果出力
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_10 : while文を使って入力された値が 0 出ない限り入力を何度でも繰り返す処置
		-------------------------------------------------------------------------*/
		
		Scanner scanner = new Scanner(System.in); // scanner 開始
		int zeroEnd = 1;
		
		while ( zeroEnd != 0 ) {
		 System.out.print("いずれかの値を入力してください ( zeroEnd ) : "); // 受付可能状態がわかるように設置
		 String zeroEndInput = scanner.nextLine();
		 
		 if ( zeroEndInput.matches( "^[0-9]+$" ) ) { 
	      zeroEnd = Integer.parseInt( zeroEndInput );
		 } else { 
		  System.out.println("エラー：半角数字のみを入力してください。");
		 }
		}
		System.out.println( "終了しました" );
		
		
		/* 保存 : 「nextInt」ではなく「nextLine」を使用するように修正する前
		
		Scanner scanner = new Scanner(System.in); // scanner 開始
		
		int zeroEnd = 1;
		while ( zeroEnd != 0 ) {
		 System.out.print("いずれかの値を入力してください ( zeroEnd ) : "); // 受付可能状態がわかるように設置
		 zeroEnd = scanner.nextInt();
		}
		System.out.println( "終了しました" );
		
		*/
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_11 : for文を使って九九を出力
		-------------------------------------------------------------------------*/
		
		for ( int for11A = 1; for11A <= 9; for11A++ ) {
		 for ( int for11B = 1; for11B <= 9; for11B++ ) {
		  System.out.printf( "%02d * %02d = %02d" , for11A , for11B , for11A * for11B );
		  if ( for11B != 9 ) { 
		   System.out.print( " || " );
		  } 
		 }
		System.out.println();
		}
		
		/* 保存 : 「printf」使用前
		
		for ( int for11A = 1; for11A <= 9; for11A++ ) {
		 for ( int for11B = 1; for11B <= 9; for11B++ ) {
		  if ( for11A * for11B <= 9 ) { 
		   System.out.print( "0" + for11A + " * " + "0" + for11B + " = 0" + for11A * for11B );
		  } else {
		   System.out.print( "0" + for11A + " * " + "0" + for11B + " = " + for11A * for11B );
		  }
		   if ( for11B != 9 ) { 
		    System.out.print( " || " );
		   } 
		  }
		 System.out.println();
		 }
		 
		  */
		
		/*-------------------------------------------------------------------------
		[概要] Question 3_12 : 拡張for文、switch文、条件演算子を使って商品の残り台数を出力
		-------------------------------------------------------------------------*/
		
		/* 保存 : 「nextInt」ではなく「nextLine」を使用するように修正する前
		
		scanner.nextLine(); // スキャナーの中身を空にする
		
		*/
		
		System.out.print("入力してください ( product ) : "); 
		String input = scanner.nextLine();
		String[] items = input.split("、");
		Random rand = new Random(); // ランダムな台数設定準備
		int countPc = rand.nextInt(12);
		int countFr = rand.nextInt(12);
		int countFa = rand.nextInt(12);
		int countWa = rand.nextInt(12);
		int countHm = rand.nextInt(12);
		int countTv = rand.nextInt(12);
		int countDp = 11 - countTv;
		
		for( String product : items ) { 
		 int count = -1; // 「センチネル値」
		 switch ( product ) { 
		  case "パソコン": 
		   count = countPc;
		   break;
		  case "冷蔵庫": 
		   count = countFr;
		   break;
		  case "扇風機": 
		   count = countFa;
		   break;
		  case "洗濯機": 
		   count = countWa;
		   break;
		  case "加湿器": 
		   count = countHm;
		   break;
		  case "テレビ":
		   count = countTv;
		   break;
		  case "ディスプレイ":
		   count = countDp;
		   break;
		  default:
		   break;
		 }
		 String result = ( count == -1 ) ? "『 " + product + " 』は指定の商品ではありません" : product + "の残り台数は " + count + "台です" ;
		 
		 System.out.println( result );
		}
		
		
		
		/*-------------------------------------------------------------------------
		[概要] scanner 閉鎖
		-------------------------------------------------------------------------*/
		scanner.close();
		
	}

}
