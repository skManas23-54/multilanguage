package Util;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

    private WebDriver driver;
    public ElementUtil(WebDriver driver){
    this.driver=driver;
    }
    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public WebElement getElement(String locatorType,String locatorValue) {
        return driver.findElement(getBy( locatorType, locatorValue));
    }

    public By getBy(String locatorType,String locatorValue){
      By locator=null;
      switch(locatorType.toLowerCase()){
          case "id":
              locator=By.id(locatorValue);
          case "name":
              locator=By.name(locatorValue);
          case "xpath":
              locator=By.xpath(locatorValue);
          case "linkText":
              locator=By.linkText(locatorValue);
          case "cssSelector":
              locator=By.cssSelector(locatorValue);
      }
      return locator;
    }
}
