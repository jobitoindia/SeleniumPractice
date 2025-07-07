package Login;

public class StringComparrion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cityName="pune";
		String favcity="pune";
		String lovedCity="pune";
		
		String pouplatCity="mumbai";
		String capitalCity="mumbai";
		
		String countryName=new String("india");
		String favcountryName=new String("india");
		String lovingcountry=new String("india");
		
		String myaddress=new String("pune");
		
		String city=new String("pune");
		
		System.out.println(cityName==countryName);
		System.out.println(favcity==capitalCity);
		System.out.println(pouplatCity==capitalCity);
		
		System.out.println(cityName==myaddress);
		System.out.println(myaddress==city);
		
		System.out.println(cityName.equals(myaddress));
		System.out.println(countryName.equals(pouplatCity));
		System.out.println(cityName.equals(lovedCity));
		
		
		
		
		
		
	}

}
