package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;
import listener.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;

import javax.swing.*;
import java.util.List;


@Listeners({Listener.class})
public class SearchPageTestCases extends BaseTest {

    @Test(priority = 0)
    public void searchProduct() {

        //*************PAGE INSTANTIATIONS*************
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage =new LoginPage(driver);
        SearchPage searchPage = new SearchPage(driver);

        //*************PAGE METHODS********************
        homePage.goToHB();
        loginPage.goToLoginPage().loginToHB("ewotest11@gmail.com","Ev12345.");
        String captchaVal = JOptionPane.showInputDialog("Please enter the captcha value:");
        //Type the entered captcha to the text box
        //driver.findElement(By.id("recaptcha_response_field")).sendKeys(captchaVal);
        //driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[5]")).click();
        searchPage.searchProduct("samsung");

        //searchPage.verifyTitle("Samsung - n11.com");
        searchPage.chooseProduct();


        //searchPage.verifyChosenProduct("https://urun.n11.com/cep-telefonu/samsung-galaxy-s9-plus-64gb-samsung-turkiye-garantili-P242058259");


    }
}


