package automationbacis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserInvocation {

    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();
         driver.get("https://login.salesforce.com/?locale=in");
     //    driver.findElement(By.id("username")).sendKeys("LearnMore");
         driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Hello");
     //    driver.findElement(By.name("pw")).sendKeys("123");
         driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("123");
         driver.findElement(By.id("Jaya")).click();


    }


}
