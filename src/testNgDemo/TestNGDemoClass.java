package testNgDemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemoClass {
	
	@BeforeSuite
	public void a() {
		System.out.println("before suite");
	}

	@BeforeTest
	public void b() {
		System.out.println("before test");

	}
	
	@BeforeClass
	public void c() {
		System.out.println("before class");

	}
	
	@BeforeMethod
	public void d() {
		System.out.println("before method");

	}
	
	@Test
	public void e() {
		System.out.println("TC");

	}

	@Test
	public void f() {
		System.out.println("tc");

	}
	
	@Test
	public void ff() {
		System.out.println("tc");

	}
	
	@Test(dataProvider = "userDetails", dataProviderClass = TestNGDemoClass.class)
    public void loginTest(String username, String password) {
        System.out.println("Username: " + username + " Password: " + password);
    }
	
	@AfterMethod
	public void g() {
		System.out.println("after method");

	}
	
	@AfterClass
	public void h() {
		System.out.println("after class");

	}
	
	@AfterTest
	public void i() {
		System.out.println("after test");

		}
	
	@AfterSuite
	public void j() {
		System.out.println("after suite");
	}
	
	@DataProvider(name = "userDetails")
	public Object[][] dpMethod() {
	    return new Object[][] 
	 {
	        {"user1", "adnin@123"},
	        {"user2", "user@123"},
	        {"user3", "user@123"},
	        {"user4", "user@123"},
	        {"user5", "user@123"},
	    };
	}
	
	
}
