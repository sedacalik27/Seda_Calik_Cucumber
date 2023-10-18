package techproed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasına sağlayan scenario çalıştırı notasyonu
@CucumberOptions(plugin = {"pretty",//pretty-->consolda scenariolar ile ilgili ayrıntılı bilgi verir
                            "html:target/default-cucumber-reports.html",
                            "json:target/json-reports/cucumber.json",
                            "junit:target/xml-report/cucumber.junit",
                            "rerun:TestOutPut/failed_scenario.txt"},

                     /*
            rerun plugin'i sayesinde fail olan scenariolarımızı yolunu belirttiğimiz .txt dosya için tutacaktır
             */
                            features = "src/test/resources/features",//-->features package'ının yolu (content root) belirtilir
                            glue = {"techproed/stepDefinitions"},//-->stepDefinitions package'ı belirtilir
                            tags = "@a3",//-->Burda belirttiğimiz tag'i hangi scenario da belirtirsek o scenariolar çalışır
                            dryRun = false, //true secersek scenariolari kontrol eder browser'i calistirmaz
                            monochrome = true//--> true kullanirsak konsoldaki cıktılari tek renk(siyah) olarak verir


)


//And kullanımında her iki şartında sağlanması gerekirken, Or kullanımında şartlardan birinin sağlanması yeterli olur.
//eger github üzerinden rapor almak isterseniz feature dosyasından  da calıstırabilirsiniz


public class Runner {
}
/*
    Runner class'ı testNG deki xml file gibi istediğimiz scenario'lari tek seferde çalıştırmamıza yardımcı olur
    @CucumberOptions() bu notasyon sayesinde hangi scenariolari çalıştıracağımızı ve hangi raporları
    alacağımızı belirtiriz
        dryRun parametresi eğer true seçilirse scenariolari çalıştırmadan feature file daki steplerin
    stepDefinition class'ındaki methodlar ile uyuşuğ uyuşmadığını kontrol eder ve browser'ı çalıştırmaz
        //true secersek scenariolari kontrol eder browser'i calistirmaz

 */
