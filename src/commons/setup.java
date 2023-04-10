package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setup {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://work.conando.vn");
        driver.manage().window().maximize();

    }
}
