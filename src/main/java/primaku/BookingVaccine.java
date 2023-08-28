package primaku;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BookingVaccine {
    public WebDriver driver;
    public void setDriver(){
        //setting the driver executable
        System.setProperty("web-driver.chrome.driver", "/Users/olvilora/Documents/Automation/chromedriver/chromedriver_mac_arm64/chromedriver");
    }

    public void initiateChrome(){
        //Initiating your chromedriver
        //driver=new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("test-type");
        options.addArguments("enable-strict-powerful-feature-restrictions");
        options.addArguments("disable-geolocation");
        driver = new ChromeDriver(options);
    }

    public void openHomePrimaku(){
        //Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximize window
        driver.manage().window().maximize();

        //open browser with desried URL
        driver.get("https://www.primaku.com/");
        removePopUpWindowIfExist();
    }

    public void clickButtonBookVaccine(){
        WebElement btnBookingVaksin = driver.findElement(By.xpath("//*[@id=\"app-layout\"]/section[1]/div[2]/div/div[4]/button"));
        btnBookingVaksin.click();
    }

    public void closeBrowser(){
        //driver.close();
        driver.quit();
    }

    public void removePopUpWindowIfExist(){
        //check the pop up exist or not
        WebElement windowPopUp = driver.findElement(By.id("desktopBannerWrapped"));
        WebElement BtnDontAllow = driver.findElement(By.id("moe-dontallow_button"));
        if (windowPopUp.isDisplayed()){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            BtnDontAllow.click();
        }
    }

    public void checkSection(String section){
        // validate element in Booking Vaccine page
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement TextBookVaccine = driver.findElement(By.xpath(selectSection(section)));
        TextBookVaccine.isDisplayed();
    }

    public String selectSection(String section){
        switch (section) {
            case "text_book_vaccine":
                section = "//*[@id='app-layout']/section[3]/div[1]/div/p";
                break;
            case "text_book_vaccine2":
                section = "//*[@id=\"app-layout1\"]/section[3]/div[1]/div/p']";
                break;
            case "text_book_vaccine3":
                section = "//*[@id=\"app-layout2\"]/section[3]/div[1]/div/p']";
                break;
            case "text_book_vaccine4":
                section = "//*[@id=\"app-layout3\"]/section[3]/div[1]/div/p']";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + section);
        }
        return section;
    }
}
