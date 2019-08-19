package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.testng.annotations.BeforeMethod;

public class Hooks {
	
	@Before
	public void BeforeMethod(Scenario s) {
       
		System.out.println(s.getName());
		System.out.println(s.getId());
		System.out.println(s.getStatus());
		
		
	}
	
	@After
	public void AfterMethod(Scenario s) {
		
		System.out.println(s.getStatus());

	}

}
