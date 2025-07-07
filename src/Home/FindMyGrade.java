package Home;

import java.util.Scanner;

public class FindMyGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int per;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your percentage");
		per=sc.nextInt();
		
		if(per>0 && per<35) 
		{
			System.out.println("You are Fail");
		}
		else if(per >=35 && per<60) {
			System.out.println("You are pass with second class");
		}
		else if(per >=60 && per<75) {
			System.out.println("You are pass with first class");
		}
		else if(per >=75 && per<=100) {
			System.out.println("Pass with distincation");
		}
		else {
			System.out.println("please enter correct pecentage");
		}
	}

}
