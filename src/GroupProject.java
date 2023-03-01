import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupProject extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement signUp= driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        Assert.assertEquals("https://itera-qa.azurewebsites.net/UserRegister/NewUser", driver.getCurrentUrl());

        WebElement firstName= driver.findElement(By.xpath("//*[@id='FirstName']"));
        firstName.click();
        firstName.sendKeys("Denis");

        WebElement surname= driver.findElement(By.cssSelector("input[id='Surname']"));
        surname.click();
        surname.sendKeys("Cokcan");

        WebElement epost=driver.findElement(By.xpath("//*[@id='E_post']"));
        epost.click();
        epost.sendKeys("decokcan@gmail.com");

        WebElement mobile = driver.findElement(By.xpath("//*[@id='Mobile']"));
        mobile.click();
        mobile.sendKeys("05555555555");

        WebElement username= driver.findElement(By.xpath("//*[@id='Username']"));
        username.click();
        username.sendKeys("decokcan");

        WebElement password= driver.findElement(By.xpath("//*[@id='Password']"));
        password.click();
        password.sendKeys("deniz5555");

        WebElement Cpassword= driver.findElement(By.xpath("//*[@id='ConfirmPassword']"));
        Cpassword.click();
        Cpassword.sendKeys("deniz5555");

        WebElement submit = driver.findElement(By.cssSelector("div input[id='submit']"));
        submit.click();

        Assert.assertEquals("Registration Successful",driver.findElement(By.xpath("//*[text()='Registration Successful']")).getText());

    }

    @Test
    public void Test2() {
        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement LogIn = driver.findElement(By.linkText("Login"));
        LogIn.click();
        Assert.assertEquals("https://itera-qa.azurewebsites.net/Login", driver.getCurrentUrl());
        WebElement usernameL = driver.findElement(By.cssSelector("input[id='Username']"));
        usernameL.click();
        usernameL.sendKeys("decokcan");

        WebElement passL = driver.findElement(By.xpath("//input[@id='Password']"));
        passL.click();
        passL.sendKeys("deniz5555");

        WebElement logButton = driver.findElement(By.cssSelector("input[type='submit'][name='login']"));
        logButton.click();

        WebElement LoginSuccseffsul = driver.findElement(By.xpath("html/body/div/div/h3"));
        System.out.println(LoginSuccseffsul.getText().substring(8, LoginSuccseffsul.getText().length()));

        Assert.assertEquals("decokcan", LoginSuccseffsul.getText().substring(8, LoginSuccseffsul.getText().length()));

        WebElement createNew = driver.findElement(By.xpath("//*[@href='/Customer/Create']"));
        createNew.click();

        WebElement customerName = driver.findElement(By.cssSelector("[id='Name']"));
        customerName.sendKeys("Group11name");

        WebElement companyName = driver.findElement(By.cssSelector("[id='Company']"));
        companyName.sendKeys("Group11 LTD.STI.");

        WebElement address = driver.findElement(By.cssSelector("[id='Address']"));
        address.sendKeys("Center of the World(Corum/Turkey)");

        WebElement city = driver.findElement(By.cssSelector("[id='City']"));
        city.sendKeys("Corum");

        WebElement companyMobile = driver.findElement(By.cssSelector("[id='Phone']"));
        companyMobile.sendKeys("+0123456789");

        WebElement email = driver.findElement(By.cssSelector("[id='Email']"));
        email.sendKeys("group11@group11.com");

        WebElement createClick = driver.findElement(By.cssSelector("input[type='submit']"));
        createClick.click();

        }
}
