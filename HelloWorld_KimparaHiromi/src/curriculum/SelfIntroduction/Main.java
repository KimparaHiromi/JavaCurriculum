package curriculum.SelfIntroduction;

/**********************************************************************************
* [概要] 課題 7.23 「自己紹介プログラム」の課題にて使用する「Mainクラス」
* [詳細] 
* ① 「Person」のインスタンスを用意する
* ② 「Person」のインスタンスに「自己紹介」を出力をさせる
* ③ 「Person」クラスから「紹介人数（int count）」を持ってきて出力する
**********************************************************************************/

public class Main {
	
	  public static void main(String[] args) {
	   Person person1 = new Person("鈴木太郎", 20, 1.7, 60); // ①
	   person1.print(); // ②
	   System.out.println("合計" + Person.count + "人です"); // ③
	  }
}


/* 保存 : 課題開始当初から提示されていたコード

public class Main {
	
	  public static void main(String[] args) {
	   Person person1 = new Person("鈴木太郎", 20, 1.7);
	   
	   System.out.println(person1.name);
	   System.out.println(person1.age);
	   System.out.println(person1.height);
	   
	  }
}

 */

