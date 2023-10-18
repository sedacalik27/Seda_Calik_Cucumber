package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage= new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //cookie kapat
    }
    @Then("arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("iphone", Keys.ENTER);
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
    @Then("Arama kutusunda samsung aratir")
    public void arama_kutusunda_samsung_aratir() {

        amazonPage.aramaKutusu.sendKeys("samsung", Keys.ENTER);
    }

    @Given("kullanici parametreli method ile {string} sayfasina gider")
    public void kullaniciParametreliMethodIleSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }

    @Then("kullanici parametreli method ile {string} aratir")
    public void kullaniciparametreliMethodIleAratir(String str) {
        amazonPage.aramaKutusu.sendKeys(str,Keys.ENTER);
    }
}
