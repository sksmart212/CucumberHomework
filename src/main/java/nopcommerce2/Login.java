package nopcommerce2;

import org.openqa.selenium.By;

public class Login extends Utils
{

    LoadProp prop= new LoadProp();
    public void LoginUser()
    {
        clickElement(By.xpath("//a[@href='/login']"));
        clearAndThenEnterText(By.id("Email"),prop.getProperty("Email"));
        clearAndThenEnterText(By.id("Password"),prop.getProperty("Password"));
        clickElement(By.xpath("//input[@class='button-1 login-button' and @value='Log in']"));
    }

}
