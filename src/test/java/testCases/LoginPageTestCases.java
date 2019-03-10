package testCases;

import utils.BaseTest;

import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

@Listeners({Listener.class})

public class LoginPageTestCases extends BaseTest {
    //*************PAGE INSTANTIATIONS*************

    @Test(priority = 0)
    public void invalidLoginTest_InvalidUserNameInvalidPassword () {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage =new LoginPage(driver);
        //*************PAGE METHODS********************
        homePage.goToHB();
        loginPage.goToLoginPage()
                  .loginToHB("ewotest11@gmail.com", "Ev12345")
                  .verifyLoginUserName("E-posta adresiniz ya da şifreniz yanlış.")
                   .verifyLoginPassword("E-posta adresiniz ya da şifreniz yanlış.");
    }

    @Test (priority = 1)
    public void validLoginTest_ValidUserValidPassword () {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage =new LoginPage(driver);
        //*************PAGE METHODS********************
        homePage.goToHB();
        loginPage.goToLoginPage()
                .loginToHB("ewotest11@gmail.com","Ev12345.");

    }


}
