package Home;

public class Demo 
{
	private int number1=1000;
	int number2=2000;
	String firstname="";
	
	
	public int addtionOftwoNumbers(int num1,int num2) 
	{
		int addiions=num1+num2;
		return addiions;
	}
	
	public int addition() 
	{
		int add=number1+number2;
		return add;
	}
	
	public int multiplication() 
	{
		int mul=number1*number2;
		System.out.println("the addtion first two number:"+addtionOftwoNumbers(1000,2000));
		return mul;
	}
	
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		System.out.println("the addtion first two number:"+d.addtionOftwoNumbers(10,20));
		System.out.println("jobito");
		System.out.println("the addtion first two number:"+d.addtionOftwoNumbers(100,200));
		System.out.println("the addtion first two number:"+d.addtionOftwoNumbers(1000,2000));
		System.out.println("the mutlitplication first two number:"+d.multiplication());
	}
}
