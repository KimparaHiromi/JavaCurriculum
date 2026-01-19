package curriculum.h;

public class PartTimeEmployee extends Employee {

	/*-------------------------------------------------------------------------
	[概要] 「オブジェクト指向」の課題「継承」において使用される「定数」
	-------------------------------------------------------------------------*/
	
	private static final int HOURLY_RATE = 1000;
	
	/*-------------------------------------------------------------------------
	[概要] 「オブジェクト指向」の課題「継承」において使用される「コンストラクタ」
	-------------------------------------------------------------------------*/
	
	public PartTimeEmployee(String employeeId,String name) {
	 super(employeeId,name);
	}
	
	/*-------------------------------------------------------------------------
	[概要] 「オブジェクト指向」の課題「継承」において使用される処理（日給計算用）
	-------------------------------------------------------------------------*/
	
	public int calculateDailyWage( int hoursWorked ) {
	 int totalWage = 0;
	 totalWage = hoursWorked * HOURLY_RATE;
	 return totalWage;
	}
	
}
