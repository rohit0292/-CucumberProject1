package CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resource/AppFeatures"},
		glue={"StepDefinations","AppHooks"},
//		tags = "@accounts",
		dryRun=false,
		monochrome=false,
		plugin= {
				"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/"
				}
		
		
		)
public class RunTest {
	
	
	
	
			
			

			
	
	

}
