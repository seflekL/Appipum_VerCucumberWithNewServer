package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class AllCurrencyPage {

    public AllCurrencyPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()), this);
    }

    @FindBy(xpath = "//*[@text='CURRENCY CONVERTER']")
    public WebElement logotextElementi;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[4]")
    public WebElement usdparabirimbuttonElementi;


    @FindBy(xpath = "(//*[@resource-id='com.smartwho.SmartAllCurrencyConverter:id/textCode'])[2]")
    public WebElement eurparabirimbuttonElementi;

    @FindBy (id = "com.smartwho.SmartAllCurrencyConverter:id/EditTextCurrencyB")
    public WebElement sonucalani;

}
