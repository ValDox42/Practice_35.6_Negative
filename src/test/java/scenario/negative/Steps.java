package scenario.negative;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    private static final WebDriver webDriver;
    private static final POM pomdata;
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\valdo\\IdeaProjects\\Practice_35.6_Negative\\src\\test\\resources\\chromedriver.exe");
        webDriver = new ChromeDriver();
        pomdata = new POM(webDriver);
    }

    @Given("authorisation page url of e2e4 {string}")
    public void authorisation_page_url_of_e2e4(String url) {
        webDriver.get(url);
    }

    @When("trying to input login {string}")
    public void loginInput(String login) {
        pomdata.dataEnterLogin(login);
    }


    @And("trying to input password {string}")
    public void passInput(String password) {
        pomdata.dataEnterPass(password);
    }

    @Then("send data")
    public void dataSend() {
        pomdata.enterData();
    }

    @Then("check for warning {string}")
    public void warningCheck(String warningCheck) {
        pomdata.checkWarning(warningCheck);
    }

}