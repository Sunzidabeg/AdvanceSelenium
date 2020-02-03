package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframe {

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\IdeaProjects\\ProjectJan27\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();


        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);

    }
    }
