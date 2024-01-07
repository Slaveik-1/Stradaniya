import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class TrtTest {
    private static WebDriver driver;

    @BeforeTest
    public static void setUp() throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd /c start C:\\\"Working Project\"\\qualit-sandbox.jar");
        Thread.sleep(10000);
        //Включаем стенд , и ждём его запуска , без ожидания тесты не проходят из-за недоступности локалхоста
        driver = new ChromeDriver();   // Включаем наш хром драйвер
        driver.get("http://localhost:8080");  //Переходим по ссылке на стенд
        WebElement box = driver.findElement(By.xpath("//*[@id='navbarDropdown']"));
        box.click();
        // Нажимаем на выпадающий список песочница
        WebElement box2 = driver.findElement(By.xpath("//*[text()='Товары']"));
        box2.click();
        //Выбираем раздел товары
    }

    @Test (priority = 1)// Первый грустный тест
            void testOne() {
        WebElement box3 = driver.findElement(By.xpath("//*[text()='Добавить']"));
        box3.click();
                //Нажимаем кнопку добавить (Теоретически нажатие кнопки добавить можно было бы вынести в @BeforeEach
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                //После каждого действия ждём а то тесты любят падать
        WebElement box4 = driver.findElement(By.xpath("//*[@id='name']"));
        box4.sendKeys("Груша256/");
        //Выбираем поле наименование и вводим в него Текст
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement box5 = driver.findElement(By.xpath("//*[@value='FRUIT']"));
        box5.click();
                //В выпадающем списке выбираем тип фрукт
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement box6 = driver.findElement(By.xpath("//*[@id='save']"));
        box6.click();
        //Сохраняем всё это
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test (priority = 2)// Второй грустный тест
            void testTwo() {
                WebElement box8 = driver.findElement(By.xpath("//*[text()='Добавить']"));
                box8.click();
                //Нажимаем кнопку добавить
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                WebElement box9 = driver.findElement(By.xpath("//*[@id='name']"));
                box9.sendKeys("Цукини#$/");
                //Выбираем поле наименование и вводим в него Текст
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                WebElement box7 = driver.findElement(By.xpath("//*[@value='VEGETABLE']"));
                box7.click();
                //В выпадающем списке выбираем тип овощ
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                WebElement box11 = driver.findElement(By.xpath("//*[@id='exotic']"));
                box11.click();
                //Нажимаем чекбокс экзотический
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                WebElement box10 = driver.findElement(By.xpath("//*[@id='save']"));
                box10.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            }
        //Сохраняем
                // driver.quit();
                //Самая важная часть теста которая должна быть без таймера и без слипа , что бы сразу его вырубить и не позориться :с

                @AfterTest
                        //После прохождения тестов очищаем стенд через 10 секунд
                void yjeNeTest() throws InterruptedException {
                    Thread.sleep(10000);
                    WebElement last1 = driver.findElement(By.xpath("//*[@id='navbarDropdown']"));
                    last1.click();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    WebElement last2 = driver.findElement(By.xpath("//*[@id='reset']"));
                    last2.click();
                }








}
