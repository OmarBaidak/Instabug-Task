package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Assertions;

public class ProductPage  {
    By productFoundTitle = By.xpath("//*[@class=\"-phs -gy5\"]");
    By laptopTitle = By.xpath("//span[contains(text(), 'laptop')]");
    By firstProductCurrencyValue = By.xpath("(//*[@class=\"prc\"])[1]");


    public ProductPage(WebDriver driver) {
        super();
    }


    public void assertWithProductFoundTitle(){
        Assertions.assertElementExists(productFoundTitle);
        Assertions.assertElementExists(laptopTitle);
    }
    public void assertByProductCurrency(){
        Assertions.assertElementText("EGP",firstProductCurrencyValue);
    }
}
