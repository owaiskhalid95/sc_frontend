package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;

import com.crm.qa.pages.TextInputPage;
;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextInputPageTest extends TestBase {
    @FindBy(id="updatingButton")
    WebElement button;
TextInputPage textInputPage;
    public TextInputPageTest(){
        super();

    }

    @BeforeMethod
    public void setUp() throws InterruptedException {

        initialization();

        textInputPage = new TextInputPage();
    }
    @Test(priority =1)

    public void verifyTextInputPage(){
        textInputPage.clickOnTextInput();
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("http://www.uitestingplayground.com/textinput"));
        System.out.println(URL);
    }


    @Test(priority=2)
    public void verifyButton(){
        textInputPage.clickOnTextInput();
        textInputPage.test("spritecloud");
        Assert.assertEquals("spritecloud", driver.findElement(By.id("updatingButton")).getText());


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
