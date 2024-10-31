package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AllCurrencyPage;
import utils.Driver;
import utils.ReusableMethods;

public class allcurrencysteps {
    AllCurrencyPage page= new AllCurrencyPage();
    AndroidDriver driver = Driver.getAndroidDriver();

    @Given("allcurrencyApp uygulamasinin yuklendigi dogulanir")
    public void allcurrency_app_uygulamasinin_yuklendigi_dogulanir() {
        Driver.getAndroidDriver().isAppInstalled("com.smartwho.SmartAllCurrencyConverter");
    }
    @Given("uygulamanin acildigi dogrulanir")
    public void uygulamanin_acildigi_dogrulanir() {
        Assert.assertTrue(page.logotextElementi.isDisplayed());
    }
    @Given("cevirmek istedigimiz para birimi japon yen'i olarak secilir")
    public void cevirmek_istedigimiz_para_birimi_japon_yen_i_olarak_secilir() {

         page.usdparabirimbuttonElementi.click();
        ReusableMethods.scrollWithUiScrollableAndClickLeo("JPY");


    }
    @Given("cevirelecek olan para birimi Tl olarak secilir")
    public void cevirelecek_olan_para_birimi_tl_olarak_secilir() {

        page.eurparabirimbuttonElementi.click();
        ReusableMethods.scrollWithUiScrollableAndClickLeo("Turkish Lira");
        ReusableMethods.scrollWithUiScrollableAndClickLeo("2");
        ReusableMethods.scrollWithUiScrollableAndClickLeo("000");
        ReusableMethods.scrollWithUiScrollableAndClickLeo("=");
    }
    @Given("cevrilen tutar screenShot olarak kaydedilir")
    public void cevrilen_tutar_screen_shot_olarak_kaydedilir() {
        ReusableMethods.getFullScreenshot(driver);

    }
    @Given("Ardindan japon yeni nin tl karsiligi olan tl degeri kaydedilir")
    public void ardindan_japon_yeni_nin_tl_karsiligi_olan_tl_degeri_kaydedilir() {

    }
    @Given("kullaniciya sms olarak bildirilir")
    public void kullaniciya_sms_olarak_bildirilir() {
        String cevrilenpara=page.sonucalani.getText();
        driver.sendSMS("11111111111","Paranizin cevrilmis tutari: " +cevrilenpara);


    }

}
