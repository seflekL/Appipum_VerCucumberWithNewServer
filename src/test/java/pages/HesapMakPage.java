package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class HesapMakPage {
    public HesapMakPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);}

    @FindBy (xpath = "(//*[@class='android.widget.ImageButton'])[6]")
    public WebElement acbutonElementi;

    @FindBy(xpath = "//*[@resource-id='com.google.android.calculator:id/result_preview']")
    public WebElement sonucElementi;
}
