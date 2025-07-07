package lahu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Child2
{
	public void validateAge(int age) throws InvalidAgeException {
		
		if(age>=18) {
			System.out.println("you are eligible for voting");
		}
		else {
			throw new InvalidAgeException(" you are not eligible");
		}
		
	}
	
	
	public static void main(String[] args)  {
		
		Child2 ch=new Child2();
		try {
			ch.validateAge(15);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
