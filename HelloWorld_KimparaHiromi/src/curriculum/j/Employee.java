package curriculum.j;

public abstract class Employee implements Billable {
 
	protected String id;
	protected String name;
	public Employee(String id, String name) {
	 this.id = id;
	 this.name = name;
	}
}
