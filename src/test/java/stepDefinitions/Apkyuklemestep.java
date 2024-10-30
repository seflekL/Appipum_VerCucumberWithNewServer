package stepDefinitions;

import io.cucumber.java.en.Given;
import utils.Driver;

public class Apkyuklemestep {

    @Given("kullanici uygulamayi acar")
    public void kullanici_uygulamayi_acar() {
        Driver.getAndroidDriver();
    }

}
