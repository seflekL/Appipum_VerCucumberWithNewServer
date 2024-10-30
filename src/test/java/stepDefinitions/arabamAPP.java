package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ArabamPage;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class arabamAPP {
    ArabamPage page = new ArabamPage();
    AndroidDriver driver = Driver.getAndroidDriver();



    @Given("arabam uygulamasanin basarili  sekilde yuklendigi dogrulanir")
    public void arabam_uygulamasanin_basarili_sekilde_yuklendigi_dogrulanir() {
        Driver.getAndroidDriver().isAppInstalled("com.dogan.arabam");
    }
    @Given("arabam uygulaminin basarili bir sekilde acildigi dogrulanir")
    public void arabam_uygulaminin_basarili_bir_sekilde_acildigi_dogrulanir() {
        Assert.assertTrue(page.arabamApkLogoElementi.isDisplayed());
    }
    @Given("alt menuden ilan ara butonuna tiklanir")
    public void alt_menuden_ilan_ara_butonuna_tiklanir() throws InterruptedException {
            ReusableMethods.wait(2);
            page.ilanaraButtonElementi.click();

          }
    @Given("kategori olarak otomobil secilir")
    public void kategori_olarak_otomobil_secilir() throws InterruptedException {


        page.otomobilbuttonElementi.click();

    }
    @Given("arac olarak Volkswagen secilir")
    public void arac_olarak_volkswagen_secilir() {
        ReusableMethods.wait(2);
      ReusableMethods.scrollWithUiScrollableAndClickLeo("Volkswagen");

    }
    @Given("arac markasi olarak passat secilir")
    public void arac_markasi_olarak_passat_secilir() {
        page.passatButtonElementi.click();

    }
    @Given("{double} TSI BlueMotion secilir")
    public void tsi_blue_motion_secilir(Double double1) {
        page.tsiBluemotionButtonElementi.click();


     }
    @Given("Paket secimi yapilir")
    public void paket_secimi_yapilir() {
        page.comfortlineAracPaketElementi.click();

    }
    @Given("Ucuzdan pahaliya siralama yaparak filtreleme yapilir")
    public void ucuzdan_pahaliya_siralama_yaparak_filtreleme_yapilir() {
        page.siralamaButtonElementi.click();
        ReusableMethods.wait(1);
        page.ucuzdanpahaliButtonElementi.click();
     }

}
