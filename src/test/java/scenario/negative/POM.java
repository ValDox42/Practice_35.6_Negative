package scenario.negative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;


public class POM {

    private final WebDriver webDriver;

    public POM(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void dataEnterLogin(String log) {
        WebElement wrongDataLogin = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/form/div[1]/label/input"));
        wrongDataLogin.sendKeys(log);
    }

    public void dataEnterPass(String pass) {
        WebElement wrongDataPass = webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/form/div[2]/label/input"));
        wrongDataPass.sendKeys(pass);
    }

    public void enterData() {
        webDriver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/form/button")).click();
    }

    public void checkWarning(String warningCheck) {
        final var warning = webDriver.findElement((By.className("e2e4-uikit-error__header"))).getText();
        assertEquals(warningCheck, warning);
    }

}
