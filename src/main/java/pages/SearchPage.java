package pages;

import utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;


public class SearchPage extends BasePage {

    /*********Constructor*********/
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    //****WebElements****

    By searchBoxBy = By.id("productSearch");
    By searchButtonBy = By.id("buttonProductSearch");
    By searchFilterBy = By.xpath("//*[@id=\"99861462-caa6-4fd1-869a-c6c95cb5f4d1\"]/div/ol/li[4]/ol/li[3]");



    //By chooseProductBy = By.xpath("//*[@id=\"p-242058259\"]/div[1]");
    //By  chooseProductBy = By.cssSelector("#view > ul > li:nth-child(3)");
    By chooseProductBy = By.xpath("//*[@id=\"view\"]/ul/li[3]");
    By increaseQuantity = By.xpath("//*[@id=\"addToCartForm\"]/div/div/button[2]");
    By addToCart = By.xpath("//*[@id=\"addToCart\"]");

    //*********Page Methods*********
//search the product on Homepage
    public SearchPage searchProduct(String productname) {
        //Enter SearchedProduct(Samsung)
        writeText(searchBoxBy, productname);
        //Click Search Button
        click(searchButtonBy);
        click(searchFilterBy);
        return this;
        }

    public SearchPage chooseProduct() {
        //waitVisibility(chooseProductBy);
        //wait.until(elementClickableByXpath("//li[3]/div/div[2]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='6bae3340-d2fb-4356-a656-a0e4f87db5bd']/div/div/ul/li[1]/div/a/div/h3")));
        click(chooseProductBy);
        waitVisibility(increaseQuantity);
        click(increaseQuantity);
        click(addToCart);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"form-item-list\"]/ul/li/div/div[1]/h4/a")));
        List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"form-item-list\"]/ul/li/div/div[1]/h4/a"));
        allLinks.get(0).click();
        return this;

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='p-241718458']/div[1]/a")));
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("p-241718458")));

        //List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"p-303035261\"]/div[1]/a/h3"));
        //List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"p-241718458\"]/div[1]/a"));
        //allLinks.get(0).click();

    }

    //**public SearchPage verifyChosenProduct(String expectedUrl){
    //Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);
     //return this;

    //}
}



