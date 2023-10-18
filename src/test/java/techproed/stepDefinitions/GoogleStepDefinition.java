package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class GoogleStepDefinition {

    GooglePage googlePage=new GooglePage();

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        googlePage.aramaKutusu.sendKeys(str, Keys.ENTER);
    }

    @When("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        try {
            Thread.sleep(1000*saniye);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Given("kullanici parametreli method ile propertiesden {string} sayfasina gider")
    public void kullaniciParametreliMethodIlePropertiesdenSayfasinaGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("arama kutusunda propertiesden {string} aratir")
    public void aramaKutusundaPropertiesdenAratir(String str) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(str),Keys.ENTER);
    }

    @When("sayfa basliginin propertiesden {string} icerdigini test eder")
    public void sayfaBasligininPropertiesdenIcerdiginiTestEder(String str) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(str)));
    }

    @Then("arama kutusunda belirtilen {string} aratir")
    public void aramaKutusundaBelirtilenAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(arac,Keys.ENTER);
    }

    @When("kullanici sayfa basliginin {string} icerdigini test eder")
    public void kullaniciSayfaBasligininIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }

    @Then("arama kutusunda propertiesden belirtilen {string} aratir")
    public void aramaKutusundaPropertiesdenBelirtilenAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(arac),Keys.ENTER);
    }

    @When("kullanici sayfa basliginin propertiesden {string} icerdigini test eder")
    public void kullaniciSayfaBasligininPropertiesdenIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(arac)));
    }

    @Then("kullanici verilen bilgiler ile arama yapar")
    public void kullaniciVerilenBilgilerIleAramaYapar(DataTable data) {
        System.out.println(data.asList());//[Araclar, volvo, audi, bmw]

        for (int i = 1; i <data.asList().size() ; i++) {
            googlePage.aramaKutusu.sendKeys(data.asList().get(i),Keys.ENTER);
            ReusableMethods.bekle(2);

            Assert.assertTrue(Driver.getDriver().getTitle().contains(data.asList().get(i)));

            googlePage.aramaKutusu.clear();//bunu yapmamaızın sebebi yan yana yazdırmasın arama kutusu sürekli temizlenip yenisi yazsın diye


            
        }
        
    }
}
