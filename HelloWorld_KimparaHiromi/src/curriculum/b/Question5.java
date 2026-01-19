package curriculum.b;

/**********************************************************************************
* [概要] Question 5 の課題処理
* [詳細] Question 5_1 ～ Question 5_5 までの課題内容およびそれに基づく解答結果を出力する。
**********************************************************************************/

public class Question5 {
	
	/*-------------------------------------------------------------------------
	[概要] Question 5_1 ～ Question 5_5 の解答
	-------------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		
		/*-------------------------------------------------------------------------
		[概要] Question 5_1 : メソッドを作成し、文字列を出力
		-------------------------------------------------------------------------*/
		
		helloWorld();
		
		/*-------------------------------------------------------------------------
		[概要] Question 5_2 : メソッドを作成し、引数に基づいた戻り値（int型）を出力
		-------------------------------------------------------------------------*/
		
		int q2Num = 10;
		int q2Result = doubleValue( q2Num );
		System.out.println( q2Num + " を 2 倍すると " + q2Result + " です。" );
		
		/*-------------------------------------------------------------------------
		[概要] Question 5_3 : メソッドを作成し、引数に基づいた戻り値（boolean型）を出力
		-------------------------------------------------------------------------*/
		
		int num1 = 7;
		int num2 = 10;
		
		if ( isEven( num2 ) ) {
		 System.out.println( num2 + "は偶数です。" );
		} else {
		 System.out.println( num2 + "は奇数です。" );
		}
		
		if ( isEven( num1 ) ) {
		 System.out.println( num1 + "は偶数です。" );
		} else {
		 System.out.println( num1 + "は奇数です。" );
		}
		
		
		/*-------------------------------------------------------------------------
		[概要] Question 5_4 : クラスを作成し、それをインポートして呼び出した結果を出力
		-------------------------------------------------------------------------*/
		
		Greeting sH = new Greeting();
		sH.sayHello();
		
		/* メモ : 呼び出し方の違い
		 * ① sayHello(); ← 同じクラス内に書いてあるものを呼び出すとき（ static あり）
		 * ② Greeting.sayHello(); ← 別のクラスから呼び出すとき（ static あり ）
		 * ③ （事前に new したうえで）sH（←変数名）.sayHello(); ← （ static なし ）
		 */
		
		/*-------------------------------------------------------------------------
		[概要] Question 5_5 : クラスを作成し、それをインポートし、入力した結果に基づいた値を出力
		-------------------------------------------------------------------------*/
		
		Animal lion = new Animal();
		
		lion.setName( "ライオン" );
		lion.setLength( 2.1 );
		lion.setSpeed( 80 );
		
		System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
		
	}
	
	
	
	/*-------------------------------------------------------------------------
	[概要] Question 5_1 ～ Question 5_3 における使用メソッドの定義
	-------------------------------------------------------------------------*/
	
	 // [概要] Question 5_1 の使用メソッド「helloWorld」
	public static void helloWorld() {
	 System.out.println("Hello,World!");
	}
	
	 // [概要] Question 5_2 の使用メソッド「doubleValue」
	public static int doubleValue(int num) {
	 return num * 2;
	}
	
	 // [概要] Question 5_3 の使用メソッド「isEven」
	public static boolean isEven(int num) {
	 boolean result;
	 if (num % 2 == 0) {
	  result = true;
	 } else {
	  result = false;
	 }
	 return result;
	}
	

}
