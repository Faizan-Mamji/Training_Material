import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",".\\browsers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }
}
