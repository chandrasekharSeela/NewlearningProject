import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {

    static WebDriver driver;
    @BeforeTest
    public void openGoogleUrl(){
      String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("start-maximized");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
    @Test
    public void test1(){
        System.out.println("Test 1");
        System.out.println(System.getProperty("user.dir"));
    }
    @AfterClass
    public void closeBrowser(){
       driver.quit();
    }

}
