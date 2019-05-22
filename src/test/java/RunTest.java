import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="D:\\kavitatesting\\homeworkcucumber\\src\\main\\resources\\Features",
        format ={"pretty", "html:target/cucumber-reports"})


public class RunTest {
}
