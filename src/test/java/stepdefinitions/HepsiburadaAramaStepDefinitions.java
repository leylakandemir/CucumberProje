package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.HepsiburadaPage;

public class HepsiburadaAramaStepDefinitions {

HepsiburadaPage hepsiburadaPage= new HepsiburadaPage();

    @Given("kullanici {string} kelimesini sayfada arar")
    public void kullanici_kelimesini_sayfada_arar(String string) {
    hepsiburadaPage.aramaKutusu.sendKeys(string+ Keys.ENTER);
    }

    @Then("sonuc sayisini ekrana yazar")
    public void sonuc_sayisini_ekrana_yazar() {
        System.out.println(hepsiburadaPage.sonucSayisi.getText());


    }
}
