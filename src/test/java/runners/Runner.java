package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                  "json:target/json-reports/cucumber.json",
                  "junit:target/xml-report/cucumber.xml"},  //rapor olusturmak icin

        features="src/test/resources/features",//features klasorunun adresi
        glue = "stepdefinitions",//testlerin icerisinde oldugu paketin ismi
        tags = "@walmart",
        dryRun = false//methodlari kopyalamak istiyorsaniz burayi true yapin kodlar calismaz
                        // ve siz de methodlari kopyalarsiniz
)
public class Runner {

}
