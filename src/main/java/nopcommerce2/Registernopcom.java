package nopcommerce2;

import org.openqa.selenium.By;

public class Registernopcom  extends Utils
{
    LoadProp prop=new LoadProp();
    public void UserRegister()
    {
        clickElement(By.xpath("//a[@href='/register']"));
        enterText(By.id("FirstName"),prop.getProperty("FirstName"));
        enterText(By.id("LastName"),prop.getProperty("LastName"));
        clearAndThenEnterText(By.id("Email"),prop.getProperty("Email"));
        clearAndThenEnterText(By.id("Password"),prop.getProperty("Password"));
        enterText(By.id("ConfirmPassword"),prop.getProperty("Password"));
        clickElement(By.id("register-button"));

    }
}
