package Home;

public class FindMyCapital {
	
	public static void main(String[] args) {
		
		String stateName="Maharashtra";
		
		if(stateName.equals("Maharashtra")) 
		{
			System.out.println("capital is Mumbai");
		}
		else if(stateName.equals("Karnatake"))
		{
			System.out.println("capital is banglore");
		}
		else if(stateName.equals("Tamilnadu"))
		{
			System.out.println("capital is chennai");
		}
		else if(stateName.equals("Andra Pradesh"))
		{
			System.out.println("capital is Amrawati");
		}
		else if(stateName.equals("Telganaa"))
		{
			System.out.println("capital is Hyderabad");
		}
		else {
			System.out.println("Please enter correct state name");
		}
		
		switch(stateName) 
		{
		case "Maharashtra":
			System.out.println("capital is Mumbai");
			break;
		case "Karnatake":
			System.out.println("capital is Banglore");
			break;
		case "Tamilnadu":
			System.out.println("capital is Chennai");
			break;
		case "Andra Pradesh":
			System.out.println("capital is Amrawati");
			break;
		case "Telganaa":
			System.out.println("capital is Hydrabad");
			break;
		default:
			System.out.println("Please enter correct state name");

		}
	}

}
