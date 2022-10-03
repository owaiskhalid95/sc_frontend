package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextInputPage extends TestBase{

    @FindBy(xpath="//*[@id=\"newButtonName\"]")
    WebElement text;

    @FindBy(id="updatingButton")
    WebElement button;


    @FindBy(xpath="//*[@id=\"overview\"]/div/div[2]/div[4]")
    WebElement textInput;

    public void clickOnTextInput(){

        driver.navigate().to("http://www.uitestingplayground.com/textinput");
    }


    public void test(String un){
        driver.findElement(By.id("newButtonName")).sendKeys(un);
        driver.findElement(By.id("updatingButton")).click();

    }




}
