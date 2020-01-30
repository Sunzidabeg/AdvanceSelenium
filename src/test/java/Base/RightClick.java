package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
    @Test(groups = { "a" })
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

    @Test(groups = { "b" })
    public void test2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\IdeaProjects\\ProjectJan27\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement a= driver.findElement(By.xpath("//*[contains(@class,'1context-menu-one btn btn-neutral')]"));


        Actions action = new Actions(driver);
        action.contextClick( a).build().perform();
        Thread.sleep(3000);


    }

    @Test(groups = { "a" })
    public void test3() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\IdeaProjects\\ProjectJan27\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement a= driver.findElement(By.xpath("//*[contains(@class,'context-menu-one btn btn-neutral')]"));


        Actions action = new Actions(driver);
        action.contextClick( a).build().perform();
        Thread.sleep(3000);


    }
    @Test(groups = { "b" })
    public void test4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\IdeaProjects\\ProjectJan27\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().window().maximize();
        WebElement a= driver.findElement(By.xpath("//*[contains(@class,'context-menu-one btn btn-neutral12')]"));


        Actions action = new Actions(driver);
        action.contextClick( a).build().perform();
        Thread.sleep(3000);


    }
}
