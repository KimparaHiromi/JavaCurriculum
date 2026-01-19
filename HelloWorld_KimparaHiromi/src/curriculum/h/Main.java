package curriculum.h;

public class Main {

	public static void main(String[] args) {
     Employee fullTEmployee = new FullTimeEmployee("F001", "正社員");
     Employee partTEmployee = new PartTimeEmployee("P001", "パート社員");
     int hours = 9;
     System.out.println("正社員の給与: " + fullTEmployee.calculateDailyWage( hours ) + " 円");
     System.out.println("パート社員の給与: " + partTEmployee.calculateDailyWage( hours ) + " 円");
     
	}

}
