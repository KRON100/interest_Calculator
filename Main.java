package interest_Calculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your full name");
		String Customer_Name = in.next();
		
		System.out.println("Enter amount to be deposited");
		Integer D_Amoount = in.nextInt();
		
		System.out.println("Enter the duration of deposit in years");
		Integer Duration = in.nextInt();
		
		System.out.println("Enter your gender [F or M]");
		String Gender = in.next();
		
		System.out.println("Enter  Year "
				                    + " Month " + " Day" );
	
			
		LocalDate dob = LocalDate.of(in.nextInt(), in.nextInt(), in.nextInt());
		
		// Calculating Age
		
		LocalDate today = LocalDate.now();
		Period p = Period.between(dob, today);
		Integer age=(p.getYears());
		
		
		
		
		Double interest = 0.00;
		double principal = 0;
		
		
		
		if ( age > 60 ) {
		
		if (Duration <=3 && Duration >= 1) {
			interest = (D_Amoount * 1.75) / 100 ;
			principal = interest/Duration.doubleValue();
		}
		if (Duration >3 && Duration <= 5) {
			interest = (D_Amoount * 2.5) / 100;
			principal = interest/Duration.doubleValue();
		}
		if (Duration > 5 ) {
			interest = (D_Amoount * 3.0) / 100;
			principal = interest/Duration.doubleValue();
		}
		System.out.println("INTEREST : = " + interest);
		System.out.println("PRINCIPLE : = " + principal);
	
	}
		
		if ( age < 18 && Gender == "F") {
			
			if (Duration <=3 && Duration >= 1) {
				interest = (D_Amoount * 2.25) / 100 ;
				principal = interest/Duration.doubleValue();
			}
			if (Duration >3 && Duration <= 5) {
				interest = (D_Amoount * 3.0) / 100;
				principal = interest/Duration.doubleValue();
			}
			if (Duration > 5 ) {
				interest = (D_Amoount * 3.5) / 100;
				principal = interest/Duration.doubleValue();
			}
			System.out.println("INTEREST : = " + interest);
			System.out.println("PRINCIPLE : = " + principal);

}
		else  {
			
			if (Duration <=3 && Duration >= 1) {
				interest = (D_Amoount * 0.75) / 100 ;
				principal = interest/Duration.doubleValue();
			}
			if (Duration >3 && Duration <= 5) {
				interest = (D_Amoount * 1.5) / 100;
				principal = interest/Duration.doubleValue();
			}
			if (Duration > 5 ) {
				interest = (D_Amoount * 2.0) / 100;
				principal = interest/Duration.doubleValue();
			}
			System.out.println("INTEREST : = " + interest);
			System.out.println("PRINCIPLE : = " + principal);
	}
}
}
