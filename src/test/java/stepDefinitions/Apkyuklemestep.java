package stepDefinitions;

import io.cucumber.java.en.Given;
import utils.Driver;

public class Apkyuklemestep {

    @Given("kullanici uygulamayi acar")
    public void kullanici_uygulamayi_acar() {
        Driver.getAndroidDriver();

    }
    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
       Driver.getAndroidDriver();
    }
    @Given("uygulamayi kapatir")
    public void uygulamayi_kapatir() {
        Driver.quitAppiumDriver();

    }
}
