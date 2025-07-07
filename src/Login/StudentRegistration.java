package Login;

public class StudentRegistration
{
	String fullName, adress;
	int rollNo;
	
		
	public static void main(String[] args) 
	{
		StudentRegistration stud1=new StudentRegistration();
		stud1.rollNo=1;
		stud1.fullName="subodh";
		stud1.adress="mumbai";
		
		System.out.println("the rollNo of first studnet is:"+stud1.rollNo);
		System.out.println("the name of first studnet is:"+stud1.fullName);
		System.out.println("the address of first studnet is:"+stud1.adress);
		
		StudentRegistration stud2=new StudentRegistration();
		stud2.rollNo=2;
		stud2.fullName="shubham";
		stud2.adress="pune";
		
		System.out.println("the rollNo of second studnet is:"+stud2.rollNo);
		System.out.println("the name of second studnet is:"+stud2.fullName);
		System.out.println("the address of second studnet is:"+stud2.adress);
		
		StudentRegistration stud3=new StudentRegistration();
		stud3.rollNo=3;
		stud3.fullName="aditya";
		stud3.adress="Nanded";
		
		System.out.println("the rollNo of third studnet is:"+stud3.rollNo);
		System.out.println("the name of third studnet is:"+stud3.fullName);
		System.out.println("the address of third studnet is:"+stud3.adress);
		
	}

}
