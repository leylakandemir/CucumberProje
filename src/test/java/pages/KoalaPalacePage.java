package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class KoalaPalacePage {
    public KoalaPalacePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "UserName")
    public WebElement userName;
    @FindBy(id = "Password")
    public WebElement passworKutusu;
    @FindBy(xpath = "//button[@type='submit']")//(xpath="//button[.='Log in']"
    public WebElement girisButonu;
    @FindBy(id = "Code")
    public WebElement hotelCreateCodeKutusu;
    @FindBy(id = "Name")
    public WebElement hotelCreateNameKutusu;
    @FindBy(id = "Address")
    public WebElement hotelCreateAddressKutusu;
    @FindBy(id = "Phone")
    public WebElement hotelCreatePhoneKutusu;
    @FindBy(id = "Email")
    public WebElement hotelCreateEmailKutusu;
    @FindBy(id = "IDGroup")
    public WebElement hotelCreateIDGroupKutusu;
    @FindBy(id = "btnSubmit")
    public WebElement hotelCreateSaveButonu;
    @FindBy(className = "bootbox-body")
    public WebElement hotelCreateBasariliYazisi;

    @FindBy(id = "IDHotel")
    public WebElement hotelRoomCreateIDHotelDropdown;
    @FindBy(id = "Code")
    public WebElement hotelRoomCreateCodeKutusu;
    @FindBy(id = "Name")
    public WebElement hotelRoomCreateNameKutusu;
    @FindBy(id = "Location")
    public WebElement hotelRoomCreateLocationKutusu;
    @FindBy(xpath = "//textarea[@role='textbox']")
    public WebElement hotelRoomCreateDescriptionKutusu;
    @FindBy(xpath = "//li[@data-id='500']")
    public WebElement hotelRoomCreatePrice;
    @FindBy(id = "Price")
    public WebElement hotelRoomCreatePriceKutusu;
    @FindBy(id = "IDGroupRoomType")
    public WebElement hotelRoomCreateIDGroupRoomKutusu;
    @FindBy(id = "MaxAdultCount")
    public WebElement hotelRoomCreateMaxAdultCountKutusu;
    @FindBy(id = "MaxChildCount")
    public WebElement hotelRoomCreateMaxChildCountKutusu;
    @FindBy(id = "btnSubmit")
    public WebElement hotelRoomCreateSaveButonu;
    @FindBy(className = "bootbox-body")
    public WebElement hotelRoomCreateBasariliYazisi;

    @FindBy(id = "IDUser")
    public WebElement hotelroomReservationCreateIDUserDropdownKutusu;
    @FindBy(id = "IDHotelRoom")
    public WebElement hotelroomReservationCreateIDHotelRoomDropdownKutusu;
    @FindBy(id = "Price")
    public WebElement hotelroomReservationCreatePriceKutusu;
    @FindBy(id = "DateStart")
    public WebElement hotelroomReservationCreateDateStartKutusu;
    @FindBy(id = "DateEnd")
    public WebElement hotelroomReservationCreateDateEndKutusu;
    @FindBy(id = "AdultAmount")
    public WebElement hotelroomReservationCreateAdultAmountKutusu;
    @FindBy(id = "ChildrenAmount")
    public WebElement hotelroomReservationCreateChildrenAmountKutusu;
    @FindBy(id = "ContactNameSurname")
    public WebElement hotelroomReservationCreateContactNameSurnameKutusu;
    @FindBy(id = "ContactPhone")
    public WebElement hotelroomReservationCreateContactPhoneKutusu;
    @FindBy(id = "ContactEmail")
    public WebElement hotelroomReservationCreateContactEmailKutusu;
    @FindBy(id = "Notes")
    public WebElement hotelroomReservationCreateNotesKutusu;
    @FindBy(id = "btnSubmit")
    public WebElement hotelroomReservationCreateSaveButonu;
    @FindBy(className = "bootbox-body")
    public WebElement hotelroomReservationCreateBasariliYazisi;

    //Eger bu webelementi goruyorsak herhangi bir kutuda hata vardir ve kayit islemi gerceklesmemistir.
    @FindBy (xpath = "//label[@class='error']")
    public WebElement hatamesaji;

    @FindBy(name = "Code")
    public WebElement hotellistCodeKutusu;
    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotellistSearchButonu;
    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement hotellistIlkSatir;
    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement hotellistIlksatirCodeSutunu;
    @FindBy (className = "dataTables_info")
    public WebElement hotellistToplamSonucSayisi;

    @FindBy(id = "lkpHotels")
    public WebElement hotelRoomListIDHotelDropDown;

    @FindBy(name = "Code")
    public WebElement hotelRoomListCodeKutusu;

    @FindBy (name = "Name")
    public WebElement hotelRoomListNameKutusu;

    @FindBy(name = "Location")
    public WebElement hotelRoomListLocationKutusu;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement hotelRoomListAramaKutusu;

    @FindBy(className = "dataTables_info")
    public WebElement hotelRoomListSonucSayisi;

    @FindBy(xpath = "//tbody/tr[1]")
    public WebElement hotelRoomListIlkSatir;

    @FindBy(className = "dataTables_empty")
    public WebElement hotelCreateKayitBulunamdiYazisi;

    @FindBy(id = "lkpHotelRooms")
    public WebElement HRLHRDD;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement HRLSB;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> HRLTKAYITLAR;













}
