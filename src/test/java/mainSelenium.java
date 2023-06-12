import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainSelenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().driverVersion("95").setup();
        ChromeDriver chromeDriver = new ChromeDriver();
             //By xpath and cssSelector
        chromeDriver.get("https:demoqa.com");
        WebElement element1 = chromeDriver.findElement(By.xpath("//div[@class='home-banner']/a"));
        WebElement element2 = chromeDriver.findElement(By.cssSelector("div.home-banner a "));
        element2.click();

             //By tagName
        WebElement header = chromeDriver.findElement(By.tagName("header"));
        header.click();

             //By ID
        chromeDriver.get("https://demoqa.com/webtables");
        WebElement button = chromeDriver.findElement(By.id("addNewRecordButton"));
        button.click();

             //By LinkText
        chromeDriver.get("https://demoqa.com/links");
        WebElement link = chromeDriver.findElement(By.linkText("Home"));
        link.click();


             //By partialLinkText
        chromeDriver.get("https://demoqa.com/links");
        WebElement link2 = chromeDriver.findElement(By.partialLinkText("Content"));
        link2.click();

             //By Name
        chromeDriver.get("https://demoqa.com/");
        WebElement name = chromeDriver.findElement(By.name("viewport"));
        System.out.println(name.getAttribute("content"));

             //By className
        chromeDriver.get("https://demoqa.com/");
        WebElement className = chromeDriver.findElement(By.className("home-banner"));
        className.click();



        chromeDriver.close();
        chromeDriver.quit();
        System.out.println("Finish!");
    }
}
