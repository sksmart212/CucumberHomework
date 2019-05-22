package homeworkcucumber.stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sortby extends nopcommerce2.Sortby {
    nopcommerce2.Sortby _Sort=new nopcommerce2.Sortby();
    @When("^user select notebook in Computers$")
    public void user_select_notebook_in_Computers()  {
        _Sort.navigateToNotebooks();
    }

    @When("^click on sort by price:high to low$")
    public void click_on_sort_by_price_high_to_low()  {
    _Sort.sort_by_Price_high_to_low();
    }

    @Then("^user should  see  product price from high to low$")
    public void user_should_see_product_price_from_high_to_low()  {

    }



}
