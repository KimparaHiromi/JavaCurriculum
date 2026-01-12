package curriculum.b;

/**********************************************************************************
* [概要] Question 2 の課題処理
* [詳細] Question 2_1 ～ Question 2_10 までの課題内容およびそれに基づく解答結果を出力する。
* （ Question 2_1 ～ 2_8 は if 、Question 2_9 と 2_10 は switch ）
**********************************************************************************/

import java.util.Scanner; // 2_5 以降で使うためインポート

public class Question2 {

	/*-------------------------------------------------------------------------
	[概要] Question 2_1 ～ Question 2_8 の解答
	-------------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_1 : int型の変数によって内容を変えて出力
		-------------------------------------------------------------------------*/
		
		int score = 75;
		if ( score >= 60 ) { System.out.println( "合格です！" );}
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_2 : int型の変数によって内容を変えて出力、当てはまらなければ別の内容を出力
		-------------------------------------------------------------------------*/
		
		int age = 25;
		if ( age >= 20 && age <= 30 ) {
		 System.out.println( "適正年齢です" );
		} else {
		 System.out.println( "対象外です" );
		}
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_3 : int型の変数によって内容を変えて出力、当てはまらなければ別の内容を出力し、
		それでも該当しなければまた別内容を出力
		-------------------------------------------------------------------------*/
		
		age = 18;
		if ( age >= 20 ) {
		 System.out.println( "成人です" );
		} else if ( age <= 19 && age >= 13 ){ 
		 System.out.println( "ティーンエイジャーです" );
		} else { 
		 System.out.println( "子供です" ); }
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_4 : int型の変数の中で一番大きい値を判定して出力
		-------------------------------------------------------------------------*/
		
		int x = 30;
		int y = 15;
		int z = 50;
		if ( x > y && x > z ) { System.out.println( x ); }
		else if ( y > x && y > z ){ System.out.println( y );}
		else { System.out.println( z ); }
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_5 : int型の変数に入力された値を受け取り、それを判定して内容を変えて出力
		-------------------------------------------------------------------------*/
		
		Scanner scanner = new Scanner(System.in); // scanner 開始
		
		System.out.print("いずれかの値を入力してください ( num ) : "); // 受付可能状態がわかるように設置
		int num = scanner.nextInt();
		if ( num > 0 ) { System.out.println( "正の数です" ); }
		else if ( num == 0 ){ System.out.println( "0 です" );}
		else { System.out.println( "負の数です" ); }
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_6 : int型の変数に入力された値が奇数か偶数かによって内容を変えて出力
		-------------------------------------------------------------------------*/
		
		System.out.print("いずれかの値を入力してください ( value ) : "); // 受付可能状態がわかるように設置
		int value = scanner.nextInt();
		if ( ( value % 2 ) == 0 ) { System.out.println( "偶数です" ); }
		else { System.out.println( "奇数です" ); }
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_7 : int型の変数に入力された値（ 0 ～ 100 ）によって内容を変えて出力 ※ 0 を下回る ＆ 100 を上回る場合の指定無し
		-------------------------------------------------------------------------*/
		
		System.out.print("いずれかの値を入力してください ( score ) : "); // 受付可能状態がわかるように設置
		score = scanner.nextInt(); // 先の設問で使用した変数の再利用
		if ( score <= 100 && score >= 90 ) { System.out.println( "優" ); }
		else if ( score < 90 && score >= 70 ){ System.out.println( "良" );}
		else if ( score < 70 && score >= 50 ){ System.out.println( "可" );}
		else if ( score < 50 && score >= 0 ){ System.out.println( "不可" );}
		else { System.out.println( "測定不能" ); } // 念のため用意
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_8 : コンソール入力が「null」または「空文字（""）」のときにその旨を通知する文を出力
		-------------------------------------------------------------------------*/
		
		scanner.nextLine(); // スキャナーの中身を空にする
		
		System.out.print("何も入力しないで Enter を押してください ( valid ) : "); // 受付可能状態がわかるように設置（設問上、ここでは何も入れない）
		String valid = scanner.nextLine();
		if ( valid == null || valid.isEmpty() ) { 
		 System.out.println("入力が無効です");
		} else  { 
		 System.out.println("入力されています"); // もし入力されてしまった場合の処置
		}
		
		
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_9 : int型変数へのコンソールによる数値入力に応じて曜日を告知する文を出力
		-------------------------------------------------------------------------*/
		
		scanner.nextLine(); // スキャナーの中身を空にする
		
		System.out.print("いずれかの値を入力してください ( day ) : "); // 受付可能状態がわかるように設置
		int day = scanner.nextInt();
		switch ( day ) {
		 case 1:
		  System.out.println( "月曜日" );
		  break;
		 case 2:
		  System.out.println( "火曜日" );
		  break;
		 case 3:
		  System.out.println( "水曜日" );
		  break;
		 case 4:
		  System.out.println( "木曜日" );
		  break;
		 case 5:
		  System.out.println( "金曜日" );
		  break;
		 case 6:
		  System.out.println( "土曜日" );
		  break;
		 case 7:
		  System.out.println( "日曜日" );
		  break;
		 default:
		  System.out.println( "無効な入力です" );
		}
		
		/*-------------------------------------------------------------------------
		[概要] Question 2_10 : int型変数へのコンソールによる数値入力に応じて曜日を告知する文を出力
		-------------------------------------------------------------------------*/
		
		scanner.nextLine(); // スキャナーの中身を空にする
		
		System.out.print("いずれかの値を入力してください ( month ) : "); // 受付可能状態がわかるように設置
		int month = scanner.nextInt();
		switch ( month ) {
		 case 12: case 1: case 2: 
		  System.out.println( "冬" );
		  break;
		 case 3: case 4: case 5: 
		  System.out.println( "春" );
		  break;
		 case 6: case 7: case 8: 
		  System.out.println( "夏" );
		  break;
		 case 9: case 10: case 11: 
		  System.out.println( "秋" );
		  break;
		 default:
		  System.out.println( "無効な月です" );
		}
		
		
		
		/*-------------------------------------------------------------------------
		[概要] scanner 閉鎖
		-------------------------------------------------------------------------*/
		scanner.close();
		
	}

}
