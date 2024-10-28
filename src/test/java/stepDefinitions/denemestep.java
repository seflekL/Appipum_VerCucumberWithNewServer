package stepDefinitions;

import io.cucumber.java.en.Given;
import utils.Driver;

public class denemestep {

    @Given("kullanici uygulamayi acar")
    public void kullanici_uygulamayi_acar() {
        Driver.getAndroidDriver();
    }

}
