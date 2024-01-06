import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;


public class TrtTest {
    private static WebDriver driver;

    @BeforeTest
    public static void setUp() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start C:\\\"Working Project\"\\qualit-sandbox.jar");
        Thread.sleep(5000);
        driver = new ChromeDriver();
        driver.get("http://localhost:8080");
        WebElement box = driver.findElement(By.xpath("//*[@id='navbarDropdown']"));
        box.click();
        WebElement box2 = driver.findElement(By.xpath("//*[text()='Товары']"));
        box2.click();
    }

    @Test
            void testOne() {
        WebElement box3 = driver.findElement(By.xpath("//*[text()='Добавить']"));
        box3.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement box4 = driver.findElement(By.xpath("//*[@id='name']"));
        box4.sendKeys("Груша256/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement box5 = driver.findElement(By.xpath("//*[@value='FRUIT']"));
        box5.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement box6 = driver.findElement(By.xpath("//*[@id='save']"));
        box6.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }

    @Test
            void testTwo() {
        WebElement box8 = driver.findElement(By.xpath("//*[text()='Добавить']"));
        box8.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement box9 = driver.findElement(By.xpath("//*[@id='name']"));
        box9.sendKeys("Цукини#$/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement box7 = driver.findElement(By.xpath("//*[@value='VEGETABLE']"));
        box7.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement box11 = driver.findElement(By.xpath("//*[@id='exotic']"));
        box11.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement box10 = driver.findElement(By.xpath("//*[@id='save']"));
        box10.click();
    }






}
