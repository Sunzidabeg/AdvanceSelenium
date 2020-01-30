package Base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ouralertsss {

    @Test
    public void test() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunzida\\IdeaProjects\\ProjectJan27\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("file:///C:/Users/Sunzida/Desktop/alerttest.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='Login']")).click();


      /* Alert b=  driver.switchTo().alert();// switchTo alert window
        String text = b.getText();//get text
        System.out.println(text);
        //Assert.assertEquals("You double clicked me.. Thank You..", text);

       Thread.sleep(3000);
        b.accept();  //ok
        //b.dismiss();//cancel
       driver.findElement(By.xpath("//button[text()='Enter your name']")).click();
       Alert c=  driver.switchTo().alert();

       // c.sendKeys("Papia Rahman");
       // Thread.sleep(3000); */
    }
}

