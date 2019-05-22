package nopcommerce2;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Homepagenopcom extends Utils{
    LoadProp loadProperties = new LoadProp();
    private By _CurrencyDollar = By.id("customerCurrency");
    private By _registerButton = By.xpath("//a[@class='ico-register']");
    private By _login = By.xpath("//a[@href=\"/login\"]");
    private By  _Apparel = By.xpath("//a[@href=\"/apparel\"]");
    private By _Clothing = By.xpath("//a[@href=\"/clothing\"]");
    private By _Shoes = By.xpath("//a[@href=\"/shoes\"]");
    private By _Computers = By.xpath("//a[@href='/computers'][1]");
    private By _Notebooks = By.xpath("//a[@href='/notebooks'][1]");
    private By _FirstItemPriceOnHomePage = By.xpath("//*[contains(text(),\"Ð‚1032.00\")]");
    private By _SecondItemPriceOnHomePage = By.xpath("//*[contains(text(),\"Ð‚1548.00\")]");
    private By _ThirdItemPriceOnHomePage = By.xpath("//*[contains(text(),\"Ð‚210.70\")]");
    private By _FourthItemPriceOnHomePage = By.xpath("//*[contains(text(),\"Ð‚21.50\")]");
    String expectedEuroCurrencySign = "Ð‚";
    String firstItemPriceOnHomePage;
    String actualEuroCurrencySign;
    String secondItemPriceOnHomePage;
    String thirdItemPriceOnHomePage;
    String fourthItemPriceOnHomePage;

    //Assert HomePage
    public void assert_HomePage()
    {
        assertCurrentURL("https://demo.nopcommerce.com/");
    }

    // Method for Click on register button
    public  void clickOnRegisterButton()
    {
        clickElement(_registerButton);
    }

    public void clickOnLogin()
    {
        clickElement(_login);
    }


    // Method for Click
    public void selectCurrencyFromDropDown() {
        selectFromVisibleNumber(_CurrencyDollar,"Euro");
    }

    public void getCurrencySignFromItemPrice() {
        firstItemPriceOnHomePage = getTextFromElement(_FirstItemPriceOnHomePage);
        actualEuroCurrencySign = firstItemPriceOnHomePage.substring(0,1);
//        secondItemPriceOnHomePage = getTextFromElement(_SecondItemPriceOnHomePage);
//        actualEuroCurrencySign = secondItemPriceOnHomePage.substring(0,1);

    }
    public void euroPrice()
    {
        Assert.assertEquals(expectedEuroCurrencySign,actualEuroCurrencySign);
    }


    public void selectApparelCategory() //hover over Apparel Category
    {
        scroll_To_view_Element_Using_Action_class(_Apparel);
    }

    public void clickClothingCategory() //
    {
        scroll_To_view_Element_And_Click(_Clothing);
    }

    public void clickShoesCategory() //
    {
        scroll_To_view_Element_And_Click(_Shoes);
    }

    public void navigatetoNotebooksCategory(){
        scroll_To_view_Element_Using_Action_class(_Computers);
        scroll_To_view_Element_And_Click(_Notebooks);
    }


}


