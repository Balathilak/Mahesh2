package org.def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
      WebDriver driver;
      @Given("User is on facebook page")
      public void user_is_on_facebook_page() {
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.get("https://www.facebook.com/");
          
          //askandfsdbkjfbsdwjfkjdsbnjsa
      }

      @When("User enter UserName and Password")
      public void user_enter_UserName_and_Password() {
         WebElement txtUserName = driver.findElement(By.id("email"));
         txtUserName.sendKeys("hbibhjbh");
         WebElement txtPass = driver.findElement(By.id("pass"));
         txtPass.sendKeys("gvtfgv");
      }

      @When("User Should click login button")
      public void user_Should_click_login_button() {
          WebElement btnlogin = driver.findElement(By.name("login"));
          btnlogin.click();
      }

      
      
      @Then("User need to verify home page is appeard \\(or) not")
      public void user_need_to_verify_home_page_is_appeard_or_not() {
          System.out.println("Invalid Browser");
      }


      
}
