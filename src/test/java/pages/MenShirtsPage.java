package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static wrappers.SeleniumWrapper.*;

public class MenShirtsPage {

    WebDriver driver;

    public MenShirtsPage(WebDriver driver) {
        this.driver = driver;
    }

    //____________________LOCATORS____________________//
    private By shirtsPageTitle = By.xpath("//div[@class=\"page-title category-title\"]");

    //____________________PRIVATE METHODS____________________//

    //____________________PUBLIC METHODS____________________//
    public String getShirtsPageTitle() {
        return getText(shirtsPageTitle);
    }

}
