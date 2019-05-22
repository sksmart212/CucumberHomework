package homeworkcucumber.stepdefination;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nopcommerce2.Registernopcom;
import org.openqa.selenium.By;


public class smoketest extends nopcommerce2.Registernopcom
{
    private By _registerButton;
    Registernopcom register =new Registernopcom();
    @Given("^User is on homepage$")
    public void user_is_on_homepage() {

    }


    @When("^user clicks on register$")
    public void user_clicks_on_register()  {

        _registerButton= By.xpath("//a[@class='ico-register']");
    }

    @Then("^user navigate to registration form$")
    public void user_navigate_to_registration_form() {

        register.UserRegister();
    }

}
