package nopcommerce2;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Currencynopcom extends Utils {
    private By _FirstItemPriceOnHomePage =By.xpath("//*[contains(text(),\"Ђ1032.00\")]");

    String firstPriceCurrency;
    String actualEuroSign;
    public void Currencynopcomm()/*make constructor*/ {

        LoadProp prop = new LoadProp();
        selectTextByValue(By.id("customerCurrency"),"Euro");

    }
    public void getFirstPriceCurrency()
    {
        firstPriceCurrency=getTextFromElement(_FirstItemPriceOnHomePage);
        actualEuroSign=firstPriceCurrency.substring(0,1);
    }
    public void DisplayCurrencyfromFirstPrice()
    {
        getFirstPriceCurrency();
         Assert.assertEquals("Ђ", actualEuroSign);
         }
}
