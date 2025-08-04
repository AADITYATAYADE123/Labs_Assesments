package Pack1;

import java.util.Scanner;

public class Lab8mains {
	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			Lab8 p1 = new Lab8();
			p1.setFisrtName("Aditya");
			p1.setLastName("Tayade");
			Lab8.Gender g = Lab8.Gender.M;
			p1.setGender(g);
			
			System.out.println("Person Details");
			System.out.println("-----------------");
			System.out.println("FirstName: " + p1.getFisrtName());
			System.out.println("LastName: " + p1.getLastName());
			System.out.println("Gender: " + p1.getGender());

			System.out.println("Enter mobile number:");
			String acceptedNumber = sc.next();
			System.out.println("Mobile Number: " + acceptedNumber);

			sc.close();
		}
	}


