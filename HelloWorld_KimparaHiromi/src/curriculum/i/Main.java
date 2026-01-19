package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
        List<Employee> employees = new ArrayList<>();
        
        employees.add( new FullTimeEmployee( "E001", "佐藤太郎" ) );
        employees.add( new ContractEmployee( "E002", "田中花子" ) );

        
        int hours = 8; // 時間数（仮に８時間）
        
        for ( Employee e : employees ) {

            int wage = e.calculateDailyWage( hours );
            System.out.println( "ID: " + e.id + " 名前: " + e.name + " 日給: " + wage + "円" );
        }
    }
}