package curriculum.h;

public class FullTimeEmployee extends Employee {

	/*-------------------------------------------------------------------------
	[概要] 「オブジェクト指向」の課題「継承」において使用される「定数」
	-------------------------------------------------------------------------*/
	
	private static final int HOURLY_RATE = 1200;
	
	/*-------------------------------------------------------------------------
	[概要] 「オブジェクト指向」の課題「継承」において使用される「コンストラクタ」
	-------------------------------------------------------------------------*/
	
	public FullTimeEmployee(String employeeId,String name) {
	 super(employeeId,name);
	}
	
	/*-------------------------------------------------------------------------
	[概要] 「オブジェクト指向」の課題「継承」において使用される処理（日給計算用）
	-------------------------------------------------------------------------*/
	
	public int calculateDailyWage( int hoursWorked ) {
	 int totalWage =0;
	 if (hoursWorked <= 8) {
	  totalWage = hoursWorked * HOURLY_RATE;
	 } else {
	  int regularWage = 8 * HOURLY_RATE;
	  int overTime = hoursWorked - 8;
	  int overTimeWage = (int)(overTime * HOURLY_RATE * 1.25);
	  totalWage =  regularWage + overTimeWage;
	 }
	 return totalWage;
	}
	
	
	
}
