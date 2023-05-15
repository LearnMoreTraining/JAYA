package resuable;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserCall {

    static WebDriver driver;
    public static WebDriver broswerCall() throws IOException {

       String projectpath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(new File(projectpath+"/src/main/resources/configurations/config.properties"));
        Properties prob = new Properties();
        prob.load(fis);

        switch (prob.getProperty("browser").toLowerCase()){
            
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                throw new InvalidArgumentException("Invalid Browser");
        }

        driver.navigate().to(prob.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;

    }

}
