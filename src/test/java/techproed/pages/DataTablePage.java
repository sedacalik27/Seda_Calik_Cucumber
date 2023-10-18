package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DataTablePage {
    public DataTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//button)[1]")
    public WebElement newButton;

    @FindBy(xpath = "(//input)[3]")
    public  WebElement firstName;

    @FindBy(xpath = "(//input)[2]")
    public  WebElement searchBox;

    @FindBy(xpath = "//*[text()='Create']")
    public  WebElement createButton;

    @FindBy(xpath = "//td[2]")
    public  WebElement searchVerify;


}
