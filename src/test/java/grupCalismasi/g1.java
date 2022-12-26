package grupCalismasi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class g1 {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
    }
    @AfterClass
    public static void teardown(){

        driver.close();
    }
    @Before
    public void testSetup() throws InterruptedException {
        WebElement controlText= driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
     controlText.click();
     WebElement customerService=driver.findElement(By.linkText("Customer Service"));
     customerService.click();
     Thread.sleep(3000);


    }


    @Test
    public void test02(){
        //customer service sayfasinin erisilebilir oldugunu test edin
        //step1=kullanici amazon web sayfasina gider
        //step2=kullanici amazon web sayfasindan customer service butonuna tiklanir
        //step3=kullanici customer service sayfasinda header texti gormelidir

        WebElement customerserviceHeaderText=driver.findElement(By.xpath("//h1[@class='fs-heading bolded']"));
        Assert.assertTrue(customerserviceHeaderText.isDisplayed());



    }
    @Test @Ignore
    public  void test01(){
        // amazon'a gidip, gitmedigimizi test edelim
        //step1=amazon web sayfasina gidildiginde amazon header yazisi gorunur olmali
        WebElement amazonHeaderText=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        Assert.assertTrue(amazonHeaderText.isDisplayed());


    }

}
