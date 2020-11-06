package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.KoalaPalacePage;
import utilities.Driver;

import java.util.List;

public class KoalaPalaceStepDef {
    KoalaPalacePage page = new KoalaPalacePage();

    @Given("kullanici koalapalace admin sayfasina gider")
    public void kullanici_koalapalace_admin_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/Account/LogOn?ReturnUrl=%2FAdmin%2FUserAdmin");
    }

    @Given("kullanici kullaniciadi ve sifresini girer")
    public void kullanici_kullaniciadi_ve_sifresini_girer() {
       page.userName.sendKeys("manager2");
       page.passworKutusu.sendKeys("Man1ager2!");
    }

    @Then("kullanici giris islemini gerceklestirir")
    public void kullanici_giris_islemini_gerceklestirir() {
        page.girisButonu.click();
    }



    @Given("kullanici hotelcreate sayfasina gider")
    public void kullanici_hotelcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin/Create");

    }

    @Given("kullanici hotelcreate code bolumune {string} girer")
    public void kullanici_hotelcreate_code_bolumune_girer(String string) {
    page.hotelCreateCodeKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate name bolumune {string} girer")
    public void kullanici_hotelcreate_name_bolumune_girer(String string) {
        page.hotelCreateNameKutusu.sendKeys(string);

    }

    @Given("kullanici hotelcreate adress bolumune {string} girer")
    public void kullanici_hotelcreate_adress_bolumune_girer(String string) {
    page.hotelCreateAddressKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate phone bolumune {string} girer")
    public void kullanici_hotelcreate_phone_bolumune_girer(String string) {
    page.hotelCreatePhoneKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate email bolumune {string} girer")
    public void kullanici_hotelcreate_email_bolumune_girer(String string) {
    page.hotelCreateEmailKutusu.sendKeys(string);
    }

    @Given("kullanici hotelcreate idgroup bolumune {string} secer")
    public void kullanici_hotelcreate_idgroup_bolumune_secer(String string) {
        Select select=new Select(page.hotelCreateIDGroupKutusu);
        select.selectByVisibleText(string);
    }

    @Given("kullanici hotelcreate save butonuna tiklar")
    public void kullanici_hotelcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelCreateSaveButonu.click();
    }

    @Then("kullanici hotelcreate kayit islemini assert eder")
    public void kullanici_hotelcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelCreateBasariliYazisi.getText());
    }
//////////////////////////////////////////////////////////////////

    @Given("kullanici hotelroomcreate sayfasina gider")
    public void kullanici_hotelroomcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelroomAdmin/Create");

    }
    @Given("kullanici hotelroomcreate idhotel bolumunde {string} secer")
    public void kullanici_hotelroomcreate_idhotel_bolumunde_secer(String string) {
        Select select=new Select(page.hotelRoomCreateIDHotelDropdown);
        select.selectByVisibleText(string);

}
    @Given("kullanici hotelroomcreate code bolumune {string} girer")
    public void kullanici_hotelroomcreate_code_bolumune_girer(String string) {
        page.hotelRoomCreateCodeKutusu.sendKeys(string);

    }
    @Given("kullanici hotelroomcreate name bolumune {string} girer")
    public void kullanici_hotelroomcreate_name_bolumune_girer(String string) {
        page.hotelRoomCreateNameKutusu.sendKeys(string);

    }
    @Given("kullanici hotelroomcreate location bolumune {string} girer")
    public void kullanici_hotelroomcreate_location_bolumune_girer(String string) {
        page.hotelRoomCreateLocationKutusu.sendKeys(string);

    }
    @Given("kullanici hotelroomcreate description bolumune {string} girer")
    public void kullanici_hotelroomcreate_description_bolumune_girer(String string) {
        page.hotelRoomCreateDescriptionKutusu.sendKeys(string);

    }
    @Given("kullanici hotelroomcreate price bolumunde {string} secer ve surukler")
    public void kullanici_hotelroomcreate_price_bolumunde_secer_ve_surukler(String string) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Actions actions= new Actions(Driver.getDriver());
        actions.dragAndDrop(page.hotelRoomCreatePrice,page.hotelRoomCreatePriceKutusu).perform();

    }
    @Given("kullanici hotelroomcreate roomType bolumunde {string} secer")
    public void kullanici_hotelroomcreate_roomType_bolumunde_secer(String string) {
    Select select=new Select(page.hotelRoomCreateIDGroupRoomKutusu);
    select.selectByVisibleText(string);
    }
    @Given("kullanici hotelroomcreate maxAdultCount bolumunde {string} yazar")
    public void kullanici_hotelroomcreate_maxAdultCount_bolumunde_yazar(String string) {
        page.hotelRoomCreateMaxAdultCountKutusu.sendKeys(string);

    }
    @Given("kullanici hotelroomcreate maxChildrenCount bolumunde {string} yazar")
    public void kullanici_hotelroomcreate_maxChildrenCount_bolumunde_yazar(String string) {
        page.hotelRoomCreateMaxChildCountKutusu.sendKeys(string);
    }

    @Given("kullanici hotelroomcreate save bolumunde butona tiklar")
    public void kullanici_hotelroomcreate_save_bolumunde_butona_tiklar() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelRoomCreateSaveButonu.click();
    }
    @Then("kullanici hotelroomcreate kayit islemini assert eder")
    public void kullanici_hotelroomcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(page.hotelRoomCreateBasariliYazisi.getText());
    }

//////////////////////////////////////////////////////////////////////////////////////////
    @Given("kullanici hotelreservationcreate sayfasina gider")
    public void kullanici_hotelreservationcreate_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin/Create");

    }

    @Given("kullanici hotelreservationcreate IDUser bolumunde {string} secer")
    public void kullanici_hotelreservationcreate_IDUser_bolumunde_secer(String string) {
        Select select= new Select(page.hotelroomReservationCreateIDUserDropdownKutusu);
        select.selectByVisibleText(string);

    }
    @Given("kullanici hotelreservationcreate IDUserHotelRoom bolumunde {string} secer")
    public void kullanici_hotelreservationcreate_IDUserHotelRoom_bolumunde_secer(String string) {
        Select select=new Select(page.hotelroomReservationCreateIDHotelRoomDropdownKutusu);
        select.selectByVisibleText(string);

    }
    @Given("kullanici hotelreservationcreate Price bolumunde {string} girer")
    public void kullanici_hotelreservationcreate_Price_bolumunde_girer(String string) {
        page.hotelroomReservationCreatePriceKutusu.sendKeys(string);

    }
    @Given("kullanici hotelreservationcreate DateStart bolumunde {string} secer")
    public void kullanici_hotelreservationcreate_DateStart_bolumunde_secer(String string) {
        page.hotelroomReservationCreateDateStartKutusu.sendKeys(string);

    }
    @Given("kullanici hotelreservationcreate DateEnd bolumunde {string} secer")
    public void kullanici_hotelreservationcreate_DateEnd_bolumunde_secer(String string) {
    page.hotelroomReservationCreateDateEndKutusu.sendKeys(string);
    }
    @Given("kullanici hotelreservationcreate AdultAmount bolumunde {string} girer")
    public void kullanici_hotelreservationcreate_AdultAmount_bolumunde_girer(String string) {
    page.hotelroomReservationCreateAdultAmountKutusu.sendKeys(string);
    }
    @Given("kullanici hotelreservationcreate ChildrenAmount bolumunde {string} secer")
    public void kullanici_hotelreservationcreate_ChildrenAmount_bolumunde_secer(String string) {
    page.hotelroomReservationCreateChildrenAmountKutusu.sendKeys(string);
    }
    @Given("kullanici hotelreservationcreate ContactNameSurname bolumunde {string} secer")
    public void kullanici_hotelreservationcreate_ContactNameSurname_bolumunde_secer(String string) {
    page.hotelroomReservationCreateContactNameSurnameKutusu.sendKeys(string);
    }
    @Given("kullanici hotelreservationcreate ContactPhone bolumunde {string} girer")
    public void kullanici_hotelreservationcreate_ContactPhone_bolumunde_girer(String string) {
    page.hotelroomReservationCreateContactPhoneKutusu.sendKeys(string);
    }
    @Given("kullanici hotelreservationcreate ContactEmail bolumunde {string} secer")
    public void kullanici_hotelreservationcreate_ContactEmail_bolumunde_secer(String string) {
    page.hotelroomReservationCreateContactEmailKutusu.sendKeys(string);
    }
    @Given("kullanici hotelreservationcreate Notes bolumunde {string} girer")
    public void kullanici_hotelreservationcreate_Notes_bolumunde_girer(String string) {
    page.hotelroomReservationCreateNotesKutusu.sendKeys(string);
    }
    @Given("kullanici hotelreservationcreate save butonuna tiklar")
    public void kullanici_hotelreservationcreate_save_butonuna_tiklar() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page.hotelroomReservationCreateSaveButonu.click();
    }
    @Then("kullanici hotelreservationcreate kayit islemini assert eder")
    public void kullanici_hotelreservationcreate_kayit_islemini_assert_eder() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(page.hotelroomReservationCreateBasariliYazisi.getText());
        }

    }

    @Then("kullanici hotelreservation kayit isleminin basarisiz oldugunu assert eder")
    public void kullanici_hotelreservation_kayit_isleminin_basarisiz_oldugunu_assert_eder() {
        System.out.println(page.hatamesaji.getText());
        Assert.assertTrue(page.hatamesaji.isDisplayed());
    }


    @Given("kullanici hotellist sayfasina gider")
    public void kullanici_hotellist_sayfasina_gider() {
    Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelAdmin");
    }

    @Given("kullanici hotellist code bolumune {string} girer")
    public void kullanici_hotellist_code_bolumune_girer(String string) {
        page.hotellistCodeKutusu.sendKeys(string);

    }

    @Given("kullanici hotellist search butonuna tiklar")
    public void kullanici_hotellist_search_butonuna_tiklar() {
        page.hotellistSearchButonu.click();

    }

    @Then("kullanici hotellist bolumundeki kayitlari inceler")
    public void kullanici_hotellist_bolumundeki_kayitlari_inceler() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String sonucSayisi= page.hotellistToplamSonucSayisi.getText();
        System.out.println(sonucSayisi);
        String ilkSatir= page.hotellistIlkSatir.getText();
        String ilksatirCodeSutunu = page.hotellistIlksatirCodeSutunu.getText();
        System.out.println(ilksatirCodeSutunu);

    }

    @Given("kullanici hotelroomlist sayfasina gider")
    public void kullanici_hotelroomlist_sayfasina_gider() {
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/HotelRoomAdmin");
    }

    @Given("kullanici hotelroomlist idhotel bolumunde {string} secer")
    public void kullanici_hotelroomlist_idhotel_bolumunde_secer(String string) {
        Select select = new Select(page.hotelRoomListIDHotelDropDown);
        select.selectByVisibleText(string);

    }
    @Given("kullanici hotelroomlist code bolumune {string} girer")
    public void kullanici_hotelroomlist_code_bolumune_girer(String string) {
        page.hotelRoomListCodeKutusu.sendKeys(string);

    }
    @Given("kullanici hotelroomlist name bolumune {string} girer")
    public void kullanici_hotelroomlist_name_bolumune_girer(String string) {
    page.hotelRoomListNameKutusu.sendKeys(string);
    }
    @Given("kullanici hotelroomlist location bolumune {string} girer")
    public void kullanici_hotelroomlist_location_bolumune_girer(String string) {
        page.hotelRoomListLocationKutusu.sendKeys(string);
    }
    @Given("kullanici hotelroomcreate search butonuna tiklar")
    public void kullanici_hotelroomcreate_search_butonuna_tiklar() {
    page.hotelRoomListAramaKutusu.click();
    }
    @Then("kullanici hotelroomlist bolumundeki kayitlari inceler")
    public void kullanici_hotelroomlist_bolumundeki_kayitlari_inceler() {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String ilksatir= page.hotellistIlkSatir.getText();
        System.out.println(ilksatir);
        String sonucSayisi= page.hotelRoomListSonucSayisi.getText();
        System.out.println(sonucSayisi);
    }
    @Then("kullanici hotellist bolumunde kayit bulunamadi yazisini gorur")
    public void kullanici_hotellist_bolumunde_kayit_bulunamadi_yazisini_gorur() {
   Assert.assertTrue(page.hotelCreateKayitBulunamdiYazisi.isDisplayed());
    }
    @Given("kullanici hotelroomreservationlist sayfasina gider")
    public void kullanici_hotelroomreservationlist_sayfasina_gider() {
     Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/admin/RoomReservationAdmin");
    }

    @Given("kullanici hotelroomreservationlist hotelroomid bolumunde {string} secer")
    public void kullanici_hotelroomreservationlist_hotelroomid_bolumunde_secer(String string) {
        Select select=new Select(page.HRLHRDD);
        select.selectByVisibleText(string);

    }

    @Given("kullanici hotelroomreservationlist arama kutusuna tiklar")
    public void kullanici_hotelroomreservationlist_arama_kutusuna_tiklar() {
        page.HRLSB.click();

    }

    @Then("kullanici hotelroomreservationlist kayitlarini inceler")
    public void kullanici_hotelroomreservationlist_kayitlarini_inceler() {
        for (WebElement w :page.HRLTKAYITLAR) {
            System.out.println(w.getText());
        }

    }






}
