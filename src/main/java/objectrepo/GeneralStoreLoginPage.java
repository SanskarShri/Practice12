package objectrepo;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralStoreLoginPage
{
    @FindBy(id="com.androidsample.generalstore:id/nameField")
    private WebElement textField;

    @FindBy(id="com.androidsample.generalstore:id/radioMale")
    private WebElement maleRadioButton;

    @FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
    private WebElement shopButton;

    public GeneralStoreLoginPage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void generalStoreLogin(String name)
    {
        textField.sendKeys(name);
        maleRadioButton.click();
        shopButton.click();
    }

}
