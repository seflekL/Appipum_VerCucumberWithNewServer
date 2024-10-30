package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.checkerframework.common.reflection.qual.ForName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import javax.xml.xpath.XPath;

public class ArabamPage {
    public ArabamPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }


    @FindBy (xpath = "//*[@resource-id='com.dogan.arabam:id/ivArabamLogo']")
    public WebElement arabamApkLogoElementi;

    @FindBy (xpath = "//*[@text='İlan Ara']")
    public WebElement ilanaraButtonElementi;

    @FindBy (xpath = "//*[@text='Otomobil']")
    public WebElement otomobilbuttonElementi;

    @FindBy (xpath = "//*[@text='Volkswagen']")
    public WebElement woswosButtonElementi;

    @FindBy (xpath = "//*[@text='Passat']")
    public WebElement passatButtonElementi;

    @FindBy (xpath = "//*[@text='1.4 TSi BlueMotion']")
    public WebElement tsiBluemotionButtonElementi;

    @FindBy (xpath = "//*[@text='Comfortline']")
    public WebElement comfortlineAracPaketElementi;

    @FindBy (xpath = "//*[@text='Sıralama']")
    public WebElement siralamaButtonElementi;

    @FindBy (xpath = "//*[@bounds='[44,1152][1080,1211]']")
    public WebElement ucuzdanpahaliButtonElementi;









}
