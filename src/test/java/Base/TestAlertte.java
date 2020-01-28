package Base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAlertte {
    @Test
    public void test() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\IdeaProjects\\ProjectJan27\\driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
    WebElement a= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));


    Actions action = new Actions(driver);
        action.doubleClick(a).build().perform();
        Thread.sleep(3000);
       Alert b=  driver.switchTo().alert();

    String text= b.getText();
        System.out.println(text);
        Assert.assertEquals("You double clicked me.. Thank You..",text);

        Thread.sleep(3000);
        b.accept();
        // Capturing alert message.
        //String alertMessage = driver.switchTo().alert().getText();

    }
}