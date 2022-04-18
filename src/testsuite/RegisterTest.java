package testsuite;

import browserfactory.BeseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BeseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);


    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement register = driver.findElement(By.linkText("Register"));
       register.click();
        // expected result
        String expectedresult = "Register";
        // Actual result
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessageElement);
        Assert.assertEquals(actualMessage,expectedresult);
    }
    @Test
    public void userShoudRegisterAccountSuccessfully() {
        // click on the Register link
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        // Select gender radio button
        WebElement radio = driver.findElement(By.id("gender-male"));
        radio.click();
        // Enter the First name
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Saurabh");

        // Enter the Last name
        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName.sendKeys("Patel");
        //Click the year of Birth
        WebElement dateOfBirthYear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']/option[89]"));
      dateOfBirthYear.click();
      // click the date of Birth
        WebElement dateOfBirth = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']/option[29]"));
        dateOfBirth.click();
// click the Month of Birth
        WebElement monthOfBirth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']/option[11]"));
        monthOfBirth.click();
        // Enter the email in email field
        WebElement email = driver.findElement(By.name("Email"));
        email.sendKeys("sathipatil@gmail.com");
        //Enter the password field
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("@12465");
        // reconfirm the password
        WebElement reconfpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        reconfpassword.sendKeys("@12465");
        // Click on Registration button
        WebElement regist = driver.findElement(By.xpath("//button[@id='register-button']"));
        regist.click();
        // verify the text 'Your registration completed'

        // expected result
        String expectedresult = "Your registration completed";
        // Actual result
        WebElement actualResult = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualResult.getText();
        System.out.println(actualResult);
        Assert.assertEquals("Registration completed",actualMessage,expectedresult);


    }
    public void tearDown() { closeBrowser();}

}