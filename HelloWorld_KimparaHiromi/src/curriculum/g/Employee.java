package curriculum.g;

public class Employee {

	/*-------------------------------------------------------------------------
	[概要] 「オブジェクト指向」の課題「カプセル化」において使用される「フィールド変数」
	-------------------------------------------------------------------------*/
	
	private String employeeId;
	private String name;
	
	/*-------------------------------------------------------------------------
	[概要] 「オブジェクト指向」の課題「カプセル化」において使用される「setter」
	-------------------------------------------------------------------------*/
	
	public void setEmployeeId( String employeeId ) {
	 this.employeeId = employeeId;
	}
	
	public void setName( String name ) {
     this.name = name;
	}
	
	/*-------------------------------------------------------------------------
	[概要] 「オブジェクト指向」の課題「カプセル化」において使用される「getter」
	-------------------------------------------------------------------------*/
	
	public String getEmployeeId() {
	 return this.employeeId;
	}
	
	public String getName() {
	 return this.name;
	}
	
}
