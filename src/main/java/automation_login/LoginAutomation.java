package automation_login;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAutomation {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
    boolean isSuccess = false;

    //setting the driver executable
        System.setProperty("web-driver.chrome.driver", "/Users/olvilora/Documents/Automation/chromedriver/chromedriver_mac_arm64/chromedriver");

    //Initiating your chromedriver
        WebDriver driver=new ChromeDriver();

    //Applied wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //maximize window
        driver.manage().window().maximize();

    //open browser with desried URL
        driver.get("http://the-internet.herokuapp.com/login");

    // find element username and input value
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

    // find element password and input value
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("SuperSecretPassword!");

    // find element login button and click the button
        WebElement loginBtn = driver.findElement(By.className("radius"));
        loginBtn.click();

    // find and wait element flashSuccess, welcome text and logout button
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.className("success")));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.className("subheader")));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.className("secondary")));

        String textSuccess = driver.findElement(By.className("success")).getText();
        textSuccess = textSuccess.replace("\n", "").replace("×", "");

        if(textSuccess.equalsIgnoreCase("You logged into a secure area!")){
            System.out.println("Login is Success");
        }else{
            System.out.println("Login is Failed");
        }

    //closing the browser
        driver.close();
    }
}
