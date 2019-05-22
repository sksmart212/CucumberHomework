package nopcommerce2;

import org.openqa.selenium.By;

public class Sortby extends Utils{
    private By _Computers = By.xpath("//a[@href='/computers'][1]");
    private By _Notebooks = By.xpath("//a[@href='/notebooks'][1]");
    public  void sort_by_Price_high_to_low() {

        selectTextByValue(By.id("products-orderby"), ("Price: High to Low"));
    }
    public void navigateToNotebooks()
    {
        scroll_To_view_Element_Using_Action_class(_Computers);
        scroll_To_view_Element_And_Click(_Notebooks);
    }
}
