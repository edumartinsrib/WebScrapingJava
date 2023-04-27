import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String links = "//*[@id=\"exhibitor-directory\"]//a";

        FirefoxDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.navigate().to("https://www.feicon.com.br/pt-br/Expositores.html");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(links)));
        List<WebElement> languagesNamesList = driver.findElements(By.xpath(links));
        System.out.println(languagesNamesList);

        for (WebElement languageElement : languagesNamesList) {
            String languageName = languageElement.getText();
            System.out.println(languageName + "teste");
        }
        
        // Close the browser window
        driver.close();

    }

}
