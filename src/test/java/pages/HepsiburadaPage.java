package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HepsiburadaPage {

    public HepsiburadaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@class='desktopOldAutosuggestTheme-input']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//span[@class='totalCount']")
    public WebElement sonucSayisi;


}
