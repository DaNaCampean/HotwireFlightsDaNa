package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePageDriverInitialization {

    public static WebDriver driver;

    // constructor

    public BasePageDriverInitialization() {

        if (driver == null) {  // daca nu pun this null, the browser opens de 2 ori: odata for home page si o data for FLIGHTS PAGE din baseTest create objects

            ChromeOptions options = new ChromeOptions();

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get("https://www.hotwire.com");

        }

  }

    public static void setupMac(){
        //this is for Home Mac
       // System.setProperty("webdriver.chrome.driver", "/Users/dana/Desktop/JAVA_automation/3apra25/chromedriver-mac-x64/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/Users/dana/IdeaProjects/AutomationFiles/chromedriver-mac-arm64/chromedriver");

    }

    public static void driverSetupWindows(){
        //Job primary windows
        System.setProperty("webdriver.chrome.driver", "D:\\Backup Softvision\\AUTOMATION STUFF\\selenium\\chromedriver-win64\\chromedriver.exe");

        // job team windows
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\dcampean\\Desktop\\java-automation\\chromedriver-win64\\chromedriver.exe");

    }
    public static void driverQuit(){
      driver.quit();
    }


}




