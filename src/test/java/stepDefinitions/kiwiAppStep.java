package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.KiwiPage;
import utils.Driver;
import utils.ReusableMethods;

public class kiwiAppStep {
    KiwiPage page = new KiwiPage();
    AndroidDriver driver = Driver.getAndroidDriver();
    Actions actions=new Actions(driver);


    @Given("KiwiApp uygulamasinin yuklendigi dogrulanir")
    public void kiwi_app_uygulamasinin_yuklendigi_dogrulanir() {
        Driver.getAndroidDriver().isAppInstalled("com.skypicker.main");

    }

    @Given("uygulamanin basariyla acildigi dogrulanir")
    public void uygulamanin_basariyla_acildigi_dogrulanir() {
        Assert.assertTrue(page.continueasGuestButtonElementi.isDisplayed());

    }

    @Given("misafir olarak devam et e tiklanir")
    public void misafir_olarak_devam_et_e_tiklanir() {
        page.continueasGuestButtonElementi.click();

    }

    @Given("ardinda gelecek olan {int} adimada yesil butona basilarak devam edilir {double}")
    public void ardinda_gelecek_olan_adimada_yesil_butona_basilarak_devam_edilir(Integer int1, Double double1) {
        page.continuButtonElementi.click();
        ReusableMethods.wait(2);

        page.continuButtonElementi.click();
        ReusableMethods.wait(2);

        page.exploreButtonElementi.click();
        ReusableMethods.wait(6);
    }

    @Given("Trip type,one way olarak secilir")
    public void trip_type_one_way_olarak_secilir() {
        page.returnButtonElementi.click();
        page.onewayButtonElementi.click();

    }

    @Given("kalkis ulkesi secenegine tiklanir ve default olan ulke kaldirilir")
    public void kalkis_ulkesi_secenegine_tiklanir_ve_default_olan_ulke_kaldirilir() {
        page.fromButtonElementi.click();
        page.xremoveButtonElementi.click();
        ReusableMethods.wait(2);

    }

    @Given("kalkis yapilacak ulke sehir girilir ve sec e tiklanir")
    public void kalkis_yapilacak_ulke_sehir_girilir_ve_sec_e_tiklanir() {
        page.departureBoxWeblementi.click();
        ReusableMethods.wait(1);
        driver.pressKey(new KeyEvent(AndroidKey.I));
        driver.pressKey(new KeyEvent(AndroidKey.S));
        driver.pressKey(new KeyEvent(AndroidKey.T));

        ReusableMethods.wait(2);

        page.departureistButtonElementi.click();
        page.departureChooseButtonElementi.click();
    }

    @Given("varis ulkesi secenegine tiklanir ve gidilecek ulke girilir")
    public void varis_ulkesi_secenegine_tiklanir_ve_gidilecek_ulke_girilir() {
        page.arrivalToButtonElementi.click();
        ReusableMethods.wait(1);
        ReusableMethods.phonekeyboardenterTextLeo("ankara");
        ReusableMethods.wait(2);
        page.ankaraButtonElementi.click();
        page.arrivalChooseButtonElementi.click();



    }

    @Given("gidis tarihi aralik ayinin {int} i olarak secilir ve set date e tiklanir")
    public void gidis_tarihi_agustos_ayinin_i_olarak_secilir_ve_set_date_e_tiklanir(Integer int1) throws InterruptedException {
       page.depatureButtonElementi.click();
       ReusableMethods.wait(2);
       ReusableMethods.kaydirmaYapLeo(500,1200,500,500,500,3);
       ReusableMethods.wait(1);
       ReusableMethods.kaydirmasonarasiKordinatsecLeo(406,806);
       page.setDateButtonElementi.click();
    }

    @Given("search butonuna tiklanir")
    public void search_butonuna_tiklanir() {
        page.searchButton.click();

    }

    @Given("en  ucuz ve aktarmasiz filtrelemeleri yapilir")
    public void en_ucuz_ve_aktarmasiz_filtrelemeleri_yapilir() {
        page.bestButton.click();
        page.cheapestButton.click();
        page.stopsButton.click();
        page.notstopButton.click();

    }

    @Given("gelen bilet fiyati kaydedilir ve kullanicin telefonuna sms olarak gonderilir")
    public void gelen_bilet_fiyati_kaydedilir_ve_kullanicin_telefonuna_sms_olarak_gonderilir() {
        String fiyat=page.fiyatbutonu.getText();

//        driver.sendSMS("2222333444","En ucuz ucus fiyati:"+fiyat);


    }

}
