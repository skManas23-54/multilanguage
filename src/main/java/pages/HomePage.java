package pages;

import Util.ElementUtil;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private ElementUtil elementUtil;
    public HomePage(WebDriver driver){
        this.driver=driver;
        elementUtil=new ElementUtil(driver);
    }
    public void getElementHeader(String headerValue){
        String headerXpathValue="site-slogan";
        driver.navigate().to("https://www.com");
    }
}
