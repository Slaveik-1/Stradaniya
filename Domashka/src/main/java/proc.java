//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.time.Duration;
//
//public class proc {
//    public static void main(String[] args) throws Exception {
//        ProcessBuilder builder = new ProcessBuilder(
//                "cmd.exe", "cd \"C:\\Working Project\\qualit-sandbox.jar");
//        Process process = builder.start();
//
//
//       WebDriver driver = new ChromeDriver();
//       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
//        driver.get("http://localhost:8080");
//        WebElement box = driver.findElement(By.xpath("//*[@id='navbarDropdown']"));
//        box.click();
//        WebElement box2 = driver.findElement(By.xpath("//*[text()='Товары']"));
//        box2.click();
//        //Предусловие
//        WebElement box3 = driver.findElement(By.xpath("//*[text()='Добавить']"));
//        box3.click();
//        WebElement box4 = driver.findElement(By.xpath("//*[@id='name']"));
//        box4.sendKeys("Груша256/");
//        WebElement box5 = driver.findElement(By.xpath("//*[@value='FRUIT']"));
//        box5.click();
//        WebElement box6 = driver.findElement(By.xpath("//*[@id='save']"));
//        box6.click();
//        //Первый тест
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//        WebElement box8 = driver.findElement(By.xpath("//*[text()='Добавить']"));
//        box8.click();
//        WebElement box9 = driver.findElement(By.xpath("//*[@id='name']"));
//        box9.sendKeys("Цукини#$/");
//        WebElement box7 = driver.findElement(By.xpath("//*[@value='VEGETABLE']"));
//        box7.click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//        WebElement box11 = driver.findElement(By.xpath("//*[@id='exotic']"));
//       box11.click();
//        WebElement box10 = driver.findElement(By.xpath("//*[@id='save']"));
//        box10.click();
//        //второй тест
//
//       // driver.quit();
//        }
//
//
//    }
//
//
