package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import resuable.BrowserCall;
import resuable.ExcelHandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

public class LoginValidationSteps  {

    private WebDriver driver ;  //null
    private WebElement curencyElement;
    @And("User clicks the login button")
    public void clickLoginButton() {

        driver.findElement(By.id("Login")).click();
    }
    @Given("User Naviagte to Salesforce application")
    public void navigateUrl() throws IOException {

    driver=  BrowserCall.broswerCall();

    }

    @Then("User should navigate to home page")
    public void userShouldNavigateToHomePage() {

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofSeconds(5));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("popUpConverter")));
        driver.findElement(By.id("popUpConverter")).click();

       WebElement frameElement = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameElement);

        driver.switchTo().defaultContent();

    }
    @When("User enters the user name {string} and password {string}")
    public void enterCredit(String username, String password) throws FileNotFoundException {

        WebElement enterUserName= driver.findElement(By.cssSelector("input[id='username']"));
        WebElement enterpassword = driver.findElement(By.xpath("//input[@name='pw']"));
        enterUserName.sendKeys(ExcelHandling.handleExcelSheet("logindetails",0,0));
        enterpassword.sendKeys(ExcelHandling.handleExcelSheet("logindetails",0,1));


        driver.navigate().refresh();

        try {
            enterUserName.sendKeys("Aravinth");
            enterpassword.sendKeys("abc");
        }
        catch (StaleElementReferenceException e){

             enterUserName= driver.findElement(By.cssSelector("input[id='username']"));
             enterpassword = driver.findElement(By.xpath("//input[@name='pw']"));

            enterUserName.sendKeys("Aravinth");
            enterpassword.sendKeys("abc");

        }
        catch(TimeoutException h){

            h.printStackTrace();

        }




    }
    @Then("user validate the error message")
    public void userValidateTheErrorMessage() {
      String actualErrorMessage =  driver.findElement(By.id("error")).getText();
      String expectedMessage = "Check your username and password. If you still can't log in, contact your Salesforce administrator.";
      Assert.assertEquals(actualErrorMessage,expectedMessage);


    }
    @Given("User Navigates to URL")
    public void navigateToURL() throws IOException {
       driver = BrowserCall.broswerCall();
    }

    @When("User Handles the currency dropdown")
    public void handleCurrencyDropdown() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));

        curencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
       Select selectCurrency = new Select(curencyElement);
       // selectCurrency.selectByIndex(5);
       // selectCurrency.selectByVisibleText("SAR");
        selectCurrency.selectByValue("BDT");

    }

    @When("User Handles the dynamic dropdown")
    public void userHandlesTheDynamicDropdown() {

        driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();

        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();

    }

    @And("User Extracts the dropdown value")
    public void userExtractsTheDropdownValue() {
      int dropdownCount=  curencyElement.findElements(By.tagName("option")).size();

        for(int i=0;i<dropdownCount;i++){

           String value= curencyElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(value);
       }


    }

    @When("User handles the auto suggestive dropdown")
    public void userHandlesTheAutoSuggestiveDropdown() throws InterruptedException {

        driver.findElement(By.name("flying_from_N")).click();
        WebElement fromDropdown =  driver.findElement(By.id("flying_from"));
        fromDropdown.sendKeys("che");
        Thread.sleep(2000);
        int i=0;
        while(i<4){

            fromDropdown.sendKeys(Keys.ARROW_DOWN);
            i++;
        }
        fromDropdown.sendKeys(Keys.ENTER);




    }

    @When("User handles the mouse action")
    public void userHandlesTheMouseAction() {

        WebElement signin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions signHower = new Actions(driver);
        signHower.clickAndHold(signin).build().perform();
        driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();

    }

    @When("Handle the frame")
    public void handleTheFrame() {

       WebElement frameElement= driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);

        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions dragdrop = new Actions(driver);
        dragdrop.dragAndDrop(drag,drop).build().perform();
        driver.switchTo().defaultContent();

    }

    @When("Handles the table")
    public void handlesTheTable() {

        WebElement cognizantTable = driver.findElement(By.xpath("//table[@class='infobox vcard']"));
       int columnOneCount = cognizantTable.findElements(By.tagName("th")).size();

         for(int i=0 ; i<columnOneCount;i++){

            String val = cognizantTable.findElements(By.tagName("th")).get(i).getText();
             System.out.println(val);

         }

        int columnTwoCount = cognizantTable.findElements(By.tagName("td")).size();

        for(int i=0 ; i<columnTwoCount;i++){

            String val = cognizantTable.findElements(By.tagName("td")).get(i).getText();
            System.out.println(val);

        }

        WebElement tab = driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']"));

       int coun= tab.findElements(By.xpath("//tbody/tr/td[4]")).size();
        for(int i=0;i<coun;i++){

           String s= tab.findElements(By.xpath("//tbody/tr/td[4]")).get(i).getText();
            System.out.println(s);
        }


    }
}
