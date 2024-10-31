package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class KiwiPage {
    public KiwiPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }

     @FindBy (xpath = "//*[@text='Continue as a guest']")
     public WebElement continueasGuestButtonElementi;

    @FindBy (xpath = "//*[@text='Continue']")
    public WebElement continuButtonElementi;

    @FindBy (xpath = "//*[@text='Explore the app']")
    public WebElement exploreButtonElementi;

    @FindBy(xpath = "//*[@text='Return']")
    public WebElement returnButtonElementi;

    @FindBy(xpath = "//*[@text='One way']")
    public WebElement onewayButtonElementi;

    @FindBy(xpath = "//*[@text='From:']")
    public WebElement fromButtonElementi;

    @FindBy(xpath = "//*[@content-desc='Clear All']")
    public WebElement xremoveButtonElementi;

    @FindBy (xpath = "(//*[@class='android.view.View'])[4]" )
    public WebElement departureBoxWeblementi;

    @FindBy (xpath = "//*[@text='Istanbul, Turkey']")
    public WebElement  departureistButtonElementi;

    @FindBy (xpath = "//*[@text='Choose']")
    public WebElement  departureChooseButtonElementi;

    @FindBy (xpath = "//*[@text='Ankara, Turkey']")
    public WebElement  ankaraButtonElementi;
    @FindBy (xpath = "//*[@text='Choose']")
    public WebElement  arrivalChooseButtonElementi;

    @FindBy (xpath = "//*[@text='To:']")
    public WebElement  arrivalToButtonElementi;

    @FindBy (xpath = "(//*[@class='android.view.View'])[4]")
    public WebElement arrivalDestinatonBoxElementi;

    @FindBy (xpath = "//*[@text='Departure:']")
    public WebElement depatureButtonElementi;

    @FindBy (xpath = "//*[@text='Set date']")
    public WebElement setDateButtonElementi;

    @FindBy(xpath = "(//*[@text='Search'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@text='Best']")
    public WebElement bestButton;

    @FindBy(xpath = "//*[@text='Cheapest']")
    public WebElement cheapestButton;

    @FindBy(xpath = "//*[@text='Stops']")
    public WebElement stopsButton;

    @FindBy(xpath = "//*[@text='Nonstop']")
    public WebElement notstopButton;


    @FindBy(xpath="(//*[@class='android.widget.TextView'])[12]")
    public WebElement fiyatbutonu;

























}
