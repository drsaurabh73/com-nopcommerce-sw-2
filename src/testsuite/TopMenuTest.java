package testsuite;

import browserfactory.BeseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BeseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //computer element
        WebElement Computerlink = driver.findElement(By.linkText("Computers"));
        Computerlink.click();

        //Actuall result
        WebElement actualresult = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualmsg = actualresult.getText();

        //expected result
        String expectedresult = "Computers";

        //Match actual result and expectedresult
        Assert.assertEquals(actualmsg, expectedresult);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        electronics.click();
        // expected result
        String expectedresult = "Electronics";
        // Actual result
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessageElement);
        Assert.assertEquals(actualMessage,expectedresult);


    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement Apparel = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        Apparel.click();
        //expected result
       String expectedresult = "Apparel";

        //acutal result
        WebElement actualMessageElement = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessageElement);
        Assert.assertEquals(actualMessage,expectedresult);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement DigitalDawnload = driver.findElement(By.linkText("Digital downloads"));
        DigitalDawnload.click();
        //expected result
        String expectedresult = "Digital downloads";
        // actual result
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessageElement);
        Assert.assertEquals(actualMessage,expectedresult);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement Books = driver.findElement(By.linkText("Books"));
        Books.click();
        //expexted result
        String expectedResult = "Books";
        //Actual result
        String actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]")).getText();
        System.out.println(actualMessageElement);
        Assert.assertEquals("User is not Books page",actualMessageElement,expectedResult);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement jewelry = driver.findElement(By.linkText("Jewelry"));
        jewelry.click();
        //expected result
        String expectedResult = "Jewelry";
        // actual result
        String actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]")).getText();
        System.out.println(actualMessageElement);
        Assert.assertEquals("User is not on Jewelry tab",actualMessageElement,expectedResult);

    }
@Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement giftcards = driver.findElement(By.linkText("Gift Cards"));
        giftcards.click();
        // expected result
    String expectedResult = "Gift Cards";
    // actual result
    String actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]")).getText();
    System.out.println(actualMessageElement);
    Assert.assertEquals("User unable to open Gift cards",actualMessageElement,expectedResult);


}
public void tearDown(){
        driver.quit();
}
}
