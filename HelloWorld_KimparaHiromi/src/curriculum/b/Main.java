package curriculum.b;

public class Main {

	public static void main(String[] args) {
		
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

}
