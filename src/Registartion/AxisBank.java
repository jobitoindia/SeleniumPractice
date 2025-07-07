package Registartion;

public class AxisBank extends Rbibank{
	
	public double decideInterestRate(){
		System.out.println("Axis intereste rate is 8.70%");
		return 8.70;
	}
	
	public static void main(String[] args) {
		
		
		Rbibank rb;   // refernce
		
		rb=new AxisBank();
		rb.decideInterestRate();
		
		rb=new SbiBank();
		rb.decideInterestRate();
		
		rb=new HdfcBank();
		rb.decideInterestRate();
		
		
	}

}
