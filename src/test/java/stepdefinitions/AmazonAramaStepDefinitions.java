package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonAramaStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();


    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_url"));

    }


    @Given("kullanici arama kutusuna camera yazar")
    public void kullanici_arama_kutusuna_camera_yazar() {
        amazonPage.aramaKutusu.sendKeys("camera" + Keys.ENTER);

    }

    @Given("kullanici arama kutusuna headphones yazar")
    public void kullanici_arama_kutusuna_headphones_yazar() {
        amazonPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("amazon_kelime") + Keys.ENTER);

    }

    @Then("kac sayfa buldugu bilgisini alir")
    public void kac_sayfa_buldugu_bilgisini_alir() {
        System.out.println(amazonPage.sonucSayisi.getText());

    }

    @Given("kullanici aramakutusuna {string} yazar ve arar")
    public void kullanici_aramakutusuna_yazar_ve_arar(String string) {
        amazonPage.aramaKutusu.sendKeys(string + Keys.ENTER);
    }

    @Then("kullanici buldugu sonuc sayisini alir")
    public void kullanici_buldugu_sonuc_sayisini_alir() {

        System.out.println(amazonPage.sonucSayisi.getText());
    }


    @Given("kullanici dropdownda {string} secer")
    public void kullanici_dropdownda_secer(String string) {
        Select select= new Select(amazonPage.dropDown);
        select.selectByVisibleText(string);


    }

    @Then("kullanici sonuc sayisini ekrana yazdirir")
    public void kullanici_sonuc_sayisini_ekrana_yazdirir() {
        System.out.println(amazonPage.sonucSayisi.getText());

    }
}