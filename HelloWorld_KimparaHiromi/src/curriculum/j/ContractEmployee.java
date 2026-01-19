package curriculum.j;

public class ContractEmployee extends Employee {
 public ContractEmployee(String id, String name) {
 super(id, name);
}
	@Override
	 public int costForDay(int hoursWorked) {
	 int hourlyRate = 1000;
	 return hoursWorked * hourlyRate;
	}

}