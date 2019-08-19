package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/feature/CreateLeadTest.feature",glue="steps",dryRun=false,monochrome=true)
public class RunCreatelead extends AbstractTestNGCucumberTests{
	
		
	

}
