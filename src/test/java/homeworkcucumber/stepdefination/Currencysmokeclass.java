package homeworkcucumber.stepdefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Currencysmokeclass extends nopcommerce2.Currencynopcom {
    nopcommerce2.Currencynopcom curr=new nopcommerce2.Currencynopcom();
    @Given("^user is on homepage$")
    public void user_is_on_homepage() {

    }



    @When("^user click on dropdown box$")
    public void user_click_on_dropdown_box()  {


    }

    @When("^select option$")
    public void select_option()   {
        curr.Currencynopcomm();
    }

    @Then("^user should be able to  change currency$")
    public void user_should_be_able_to_change_currency()  {

    }

    @Then("^user should able to see prices of product in selected currency$")
    public void user_should_able_to_see_prices_of_product_in_selected_currency()  {
        curr.DisplayCurrencyfromFirstPrice();



}}
