package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
        }

        String baseURL = "https://www.hepsiburada.com/";

        //*********Page Methods*********
        //Go to Homepage

        public HomePage goToHB (){
            driver.get(baseURL);
            return this;
        }


        //Verify Homepagetitle
        public String title(){
            return driver.getTitle();
        }
        public void verifyTitle() {
            Assert.assertEquals(title(), "Türkiye'nin En Büyük Online Alışveriş Sitesi Hepsiburada.com");
        }
    }

