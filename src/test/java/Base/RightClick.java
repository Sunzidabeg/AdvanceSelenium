package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\IdeaProjects\\ProjectJan27\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement a= driver.findElement(By.xpath("//*[contains(@class,'context-menu-one btn btn-neutral')]"));


        Actions action = new Actions(driver);
        action.contextClick( a).build().perform();
        Thread.sleep(3000);


    }
}
