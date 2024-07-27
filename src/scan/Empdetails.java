package scan;

import java.util.Scanner;

public class Empdetails {
	
	public void emp() {
		System.out.println("Emp details");

	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Emp Name:??");
		String empName = s.nextLine();
		
		System.out.println("Emp Email:??");
		String empEmail = s.next();
		
		System.out.println("Emp Id:??");
		int empId = s.nextInt();
		
		System.out.println("Emp Salary:??");
		float empSal = s.nextFloat();
		
		System.out.println("Emp Phone No:??");
		long empNo = s.nextLong();
		
		System.out.println("Emp Gender:??");
		char empGender = s.next().charAt(0);
		
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter The City:??");
		String empCity = s1.nextLine();
		
		System.out.println("Emp Name:"+empName);
		System.out.println("Emp Email:"+empEmail);
		System.out.println("Emp Id:"+empId);
		System.out.println("Emp Salary:"+empSal);
		System.out.println("Emp Phone No:"+empNo);
		System.out.println("Emp Gender:"+empGender);
		System.out.println("Emp City:"+empCity);
		
		
				
	}

}
