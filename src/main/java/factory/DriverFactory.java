package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class DriverFactory {
    public WebDriver driver;
    public WebDriver initDriver(String browserName, Properties properties){
        System.out.println("browser name is "+browserName);
        switch(browserName.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            default:
                System.out.println("browser not found");
        }
        driver.get(properties.getProperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().window().fullscreen();
        return driver;

    }
}
