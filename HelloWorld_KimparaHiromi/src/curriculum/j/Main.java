package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	 List<Billable> employees = new ArrayList<>();
	 
	 employees.add( new FullTimeEmployee( "E001", "田中" ) );
     employees.add( new ContractEmployee( "E002", "佐藤" ) ); 
	 
     int hours = 8; // 仮に８時間設定
     
     for ( Billable e : employees ) {
      int cost = e.costForDay( hours );
         System.out.println( "日給: " + cost + "円" );
     }

	}

}
