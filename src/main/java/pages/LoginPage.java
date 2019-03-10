package pages;

import utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {
    //***Constructor
    public LoginPage(WebDriver driver){
        super(driver);
    }

    //*****WebElements****
    By goToMyAccountBy = By.id("myAccount");

    By goTologinAccountBy = By.id("login");

    //Go to LoginPage
    public LoginPage goToLoginPage (){
        click(goToMyAccountBy);
        click(goTologinAccountBy);
        return this;
    }

        //*********Web Elements*********
    By usernameBy = By.id("email");
    By passwordBy = By.id("password");
    By loginButtonBy = By.xpath("//*[@id=\"form-login\"]/div[4]/button");
    By errorMessageUsernameBy = By.xpath("//*[@id=\"error-message-container\"]/div/div");
    By errorMessagePasswordBy = By.xpath("//*[@id=\"error-message-container\"]/div/div");

    //*********Page Methods*********

    public LoginPage loginToHB (String username, String password){
        //Enter Username(Email)
        writeText(usernameBy,username);
        //Enter Password
        writeText(passwordBy, password);
        //Click Login Button
        click(loginButtonBy);
        return this;
    }

    //Verify Username Condition
    public LoginPage verifyLoginUserName (String expectedText) {
        assertEquals(errorMessageUsernameBy, expectedText);
        return this;
    }

    //Verify Password Condition
    public LoginPage verifyLoginPassword (String expectedText) {
        assertEquals(errorMessagePasswordBy, expectedText);
        return this;
    }


}
