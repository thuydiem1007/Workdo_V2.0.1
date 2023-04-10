package locator.todolist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class todolistPage {
    WebDriver google;

    public void createTask() {
        WebElement btnAddCV = google.findElement(By.xpath("//a[@class='button is-info']"));
        btnAddCV.click();
    }
}
