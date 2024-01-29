package stepDefinitions;

import browserControl.WebConnector;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConstantUtils;

import java.time.Duration;

public class Stepdefinition extends WebConnector {

    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String webpage) {
        driver.get(webpage);

//    @Given("the user navigates to")
//   public void the_user_navigates_to() {
//       driver.get(BASE_URL);

    }
}







