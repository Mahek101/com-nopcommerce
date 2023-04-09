package browserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        // Setup Chrome Browser
        WebDriver driver = new ChromeDriver();

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2" ;

        // Open URL in browser by using get method
        driver.get(baseUrl);

        // Maximise window by maximise method
        driver.manage().window().maximize();

        // We give Implicit wait to driver by implicit method
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));

        // Print the title of the page
        System.out.println("The Title of the page is : " + driver.getTitle());

        // Print the current URL
        System.out.println("The current URL is : " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("The page source is : " + driver.getPageSource());

        // Find the email field element and type the email
        driver.findElement(By.id("Email")).sendKeys("megha123@gmail.com");

        // Find the password field element and type the password
        driver.findElement(By.id("Password")).sendKeys("12345");

        // Close the browser
        driver.close();


    }
}
