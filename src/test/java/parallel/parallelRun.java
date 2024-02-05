package parallel;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;




@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resource/parallel"},
		glue={"parallel"},
//		tags = "@All",
		dryRun=false,
		monochrome=true,
		plugin= {
				"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","timeline:test-output-thread/"
				}
		
		
		)

public class parallelRun extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][]scenarios(){
		
		return super.scenarios();
		
	}

}
