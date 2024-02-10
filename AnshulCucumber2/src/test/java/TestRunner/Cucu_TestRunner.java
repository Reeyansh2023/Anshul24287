package TestRunner;
						
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features/a.feature"},
glue= {"StepDefination"},
plugin= {"pretty", "html:target/Anshul.html"})
		

		


public class Cucu_TestRunner extends AbstractTestNGCucumberTests{

}


