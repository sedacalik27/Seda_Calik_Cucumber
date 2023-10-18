package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty->konsolda scenariolar ile ilgili ayrıntılı bilgi verir
        "html:target/default-cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml",
        "rerun:TestOutput/failed_scenario.txt"},
        //rerun daki yolu featurese yapıştırdık
        features = "@TestOutput/failed_scenario.txt",//feature de dosya yolu belirtirsem @işareti koyuyoruz başına
        glue = {"techproed/stepDefinitions"},
        dryRun = false,
        monochrome = true

        /*
    Bu class'da sadece txt dosyası içinde fail olan scenarioları çalıştıracağımız için tag parametresine
ihtiyaç yoktur. feature parametresine de fail olan scenarioların olduğu txt dosyasının yolu belirtiriz.
features parametresinde dosya yolu belirtiyorsak dosya yolundan önce @ sembolu koymamız gerekir.
 */
)

public class FailedRunner {
}
