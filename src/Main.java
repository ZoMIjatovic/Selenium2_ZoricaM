import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {

    
    public static void main(String[] args) {
        
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        driver.manage().window().maximize();
        
        driver.get("http://booking.com");
        
      WebElement WhereAreYouGoingField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ss")));
      WhereAreYouGoingField.sendKeys("Belgrade");
      
      
        
        WebElement CheckInCheckOutBoxField = wait.until(ExpectedConditions.elementToBeClickable(By.className("sb-date-field")));
        CheckInCheckOutBoxField.click();
        
        WebElement CheckInDateField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[4]/td[7]")));
        CheckInDateField.click();
        
                
        WebElement CheckOutField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[3]/div/div/div/div[1]")));
        CheckOutField.click();
     
         WebElement CheckOutDateBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[5]/td[6]")));
         CheckOutDateBox.click();
       
        WebElement CheckBoxField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("xp__guests__toggle")));
        CheckBoxField.click();

        WebElement RoomsCheckBoxField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"no_rooms\"]/option[4]")));
        RoomsCheckBoxField.click();

        WebElement AdultsCheckBoxField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"group_adults\"]/option[8]")));
        AdultsCheckBoxField.click();

        WebElement ChildrenCheckBoxField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"group_children\"]/option[3]")));
        ChildrenCheckBoxField.click();

        WebElement WhatAreTheAgesOfTheChildrenYouReTravellingWith = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[4]/select[1]/option[14]")));
        WhatAreTheAgesOfTheChildrenYouReTravellingWith.click();

        WebElement WhatAreTheAgesOfTheChildrenYouReTravellingWithSecondField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"frm\"]/div[1]/div[3]/div[2]/div/div/div[4]/select[2]/option[14]")));
        WhatAreTheAgesOfTheChildrenYouReTravellingWithSecondField.click();

        WebElement SearchButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("sb-searchbox__button")));
        SearchButton.click();

              
              
         
      
      
      
      
        
    }
    
}