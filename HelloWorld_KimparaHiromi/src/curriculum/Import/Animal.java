package curriculum.Import;

/**********************************************************************************
* [概要] Question 5_5 で使用する変数と処理
* [詳細] Question 5_5の課題内容に基づきデータを入力および出力する。
**********************************************************************************/


public class Animal {

	/*-------------------------------------------------------------------------
	[概要] Question 5_5 の課題において使用されるフィールド変数
	-------------------------------------------------------------------------*/
	
	private String name;
	private double length;
	private int speed;
	
	/*-------------------------------------------------------------------------
	[概要] Question 5_5 の課題において使用される「setter」
	-------------------------------------------------------------------------*/
	
	public void setName( String name ) {
     this.name = name;
	}
	
	public void setLength( double length ) {
	 this.length = length;
	}
	
	public void setSpeed( int speed ) {
	 this.speed = speed;
	}
	
	/*-------------------------------------------------------------------------
	[概要] Question 5_5 の課題において使用される「getter」
	-------------------------------------------------------------------------*/
	
	public String getName() {
	 return this.name;
	}
	
	public double getLength() {
	 return this.length;
	}
	
	public int getSpeed() {
	 return this.speed;
	}
	
}
