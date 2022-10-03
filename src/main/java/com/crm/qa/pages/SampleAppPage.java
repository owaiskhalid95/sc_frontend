package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleAppPage extends TestBase{

    @FindBy(xpath="//*[@id=\"newButtonName\"]")
    WebElement text;

    @FindBy(id="updatingButton")
    WebElement button;


    @FindBy(xpath="/html/body/section[2]/div/div[4]/div[2]")
    WebElement sampleapp;




    public void clickOnTextInput(){

        driver.navigate().to("http://www.uitestingplayground.com/sampleapp");
    }


    public void test(String un,String pass){
        driver.findElement(By.name("UserName")).sendKeys(un);
        driver.findElement(By.name("Password")).sendKeys(pass);

        driver.findElement(By.id("login")).click();

    }

}
