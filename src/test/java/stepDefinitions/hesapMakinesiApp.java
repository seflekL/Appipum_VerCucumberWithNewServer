package stepDefinitions;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HesapMakPage;
import utils.Driver;

public class hesapMakinesiApp {
    HesapMakPage page = new HesapMakPage();
    AndroidDriver driver = Driver.getAndroidDriver();

    @Given("Hesapmakinesi uygulamasi baslatilir")
    public void hesapmakinesi_uygulamasi_baslatilir() {
        Driver.getAndroidDriver();
    }

    @Given("Uygulamianin yuklnedigini dogrular")
    public void uygulamianin_yuklnedigini_dogrular() {

        Assert.assertTrue(Driver.getAndroidDriver().isAppInstalled("com.google.android.calculator"));
    }

    @Given("Uygulamnanin acildigini dogrular")
    public void uygulamnanin_acildigini_dogrular() {
        Assert.assertTrue(page.acbutonElementi.isDisplayed());

    }

    @Given("{int} un {int}  sayisini carpar")
    public void un_sayisini_carpar(Integer int1, Integer int2) {
        driver.findElement(MobileBy.accessibilityId("4")).click();
        driver.findElement(MobileBy.accessibilityId("0")).click();
        driver.findElement(MobileBy.accessibilityId("0")).click();
        driver.findElement(MobileBy.accessibilityId("multiply")).click();
        driver.findElement(MobileBy.accessibilityId("3")).click();
    }

    @Given("Sonuc {int} oldugunu dogrular")
    public void sonuc_oldugunu_dogrular(Integer int1) {

        int actualResult=Integer.parseInt(page.sonucElementi.getText());
        int expectedResult=int1;

        Assert.assertEquals(actualResult,expectedResult);
    }
}