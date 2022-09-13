
package stepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class) 
@CucumberOptions(features = {"D:\\Users\\Temp\\eclipse-workspace\\CucumberJunit\\src\\test\\resources\\features\\orange_login.feature",
		"D:\\Users\\Temp\\eclipse-workspace\\CucumberJunit\\src\\test\\resources\\features\\DataDrivenLogin.feature"},
                		 plugin= {"html:target/cucumber-html-report",
                							"json:target/cucumber.json",
                							"pretty:target/cucumber-pretty.txt"},
                				 dryRun=false,
                		glue={"stepDefination"},
                  monochrome = true) 

public class RunTest { }