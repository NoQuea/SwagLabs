//Создать новый проект SauceDemo
//        Расшарить на Github и пригласить ментора в коллабораторы
//        Создать новый Java-класс, в нем для ресурса https://www.saucedemo.com/
//        составить список локаторов,
//        можно искать на ВСЕХ страницах приложения
//        (driver.findWebElement(<локатор>))
//        для КАЖДОГО из примеров локаторов ниже:
//
//        id
//        name
//        classname
//        tagname
//        linktext
//        partiallinktext
//        xpath
//        Поиск по атрибуту, например By.xpath("//tag[@attribute='value']");
//        Поиск по тексту, например By.xpath("//tag[text()='text']");
//        Поиск по частичному совпадению атрибута, например By.xpath("//tag[contains(@attribute,'text')]");
//        Поиск по частичному совпадению текста, например By.xpath("//tag[contains(text(),'text')]");
//        ancestor, например //*[text()='Enterprise Testing']//ancestor::div
//        descendant
//        following
//        parent
//        preceding
//        Подсказка:  XPath Axes
//        *поиск элемента с условием AND, например //input[@class='_2zrpKA _1dBPDZ' and @type='text']
//        css
//        .class
//        .class1.class2
//        .class1 .class2
//        #id
//        tagname
//        tagname.class
//        [attribute=value]
//        [attribute~=value]
//        [attribute|=value]
//        [attribute^=value]
//        [attribute$=value]
//        [attribute*=value]
//        Подсказка: https://www.w3schools.com/cssref/css_selectors.asp
//
//


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Lokators extends BaseTest{


    @Test
    public void CheckThePriceOfTheItemAndItsNameInTheCart() {


        driver.get("https://www.saucedemo.com");

        WebElement login = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        login.sendKeys("standard_user");
        Assert.assertEquals(login.getAttribute("value"), "standard_user", "Invalid login");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        Assert.assertEquals(password.getAttribute("value"), "secret_sauce", "Invalid password");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        WebElement completionOfLogin = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        Assert.assertEquals(completionOfLogin.getAttribute("value"),
                            completionOfLogin.getAttribute("value"),"Login failed");

        ////////////////////////////

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        WebElement buttonRemove = driver.findElement(By.id("remove-sauce-labs-backpack"));
        Assert.assertEquals(buttonRemove.getAttribute("value"),
                            buttonRemove.getAttribute("value"), "Button is not found");

        ///////////////////////////

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        WebElement cartCheck = driver.findElement(By.xpath("//span[@class='title']"));
        Assert.assertEquals(cartCheck.getAttribute("value"),
                            cartCheck.getAttribute("value"), "The cart is not logged in");



    }
}
