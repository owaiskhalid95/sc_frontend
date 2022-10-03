package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SampleAppPage;
import com.crm.qa.pages.TextInputPage;
import com.crm.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class SampleAppPageTest extends TestBase {


    SampleAppPage sampleAppPage;

    public SampleAppPageTest(){
        super();

    }
    @BeforeMethod
    public void setUp() throws InterruptedException {

        initialization();

        sampleAppPage = new SampleAppPage();
    }
    @Test(priority =1)

    public void verifyTextInputPage(){
        sampleAppPage.clickOnTextInput();
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("http://www.uitestingplayground.com/sampleapp"));
        System.out.println(URL);
    }



    @Test(priority=2)
    public void verifyButton(){
        sampleAppPage.clickOnTextInput();
        sampleAppPage.test("spritecloud","pwd");
        Assert.assertEquals("Log Out", driver.findElement(By.id("login")).getText());


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
