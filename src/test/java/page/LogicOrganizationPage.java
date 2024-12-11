package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogicOrganizationPage extends BasePage {

    public LogicOrganizationPage(WebDriver driver) {
        super(driver);
    }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void insertHubOrganizationAndSelect(String locator, String organization) {
        Find(locator).click();
        Find(locator).sendKeys(organization);
        Find(locator).sendKeys(Keys.ENTER);
    }

    public void clickInventoryOption(String locator) {
        Find(locator).click();
    }

    public void clickNodeCapacityOption(String locator) {
        Find(locator).click();
    }

    public void clickResourcePool(String locator) {
        Find(locator).click();
    }

    public void clickButtonAdd(String locator) {
        Find(locator).click();
    }

    public void insertEffectiveStartDate(String locator, String date) {
        Find(locator).sendKeys(date);
    }

    public void insertEffectiveEndDate(String locator, String date) {
        Find(locator).sendKeys(date);
    }

    public void clickButtonSave(String locator) {
        Find(locator).click();
    }

    public void checkStandardCapacityPeriod(String locator) {
        Find(locator).click();
    }

    public void insertSundayCapacity(String locator, String capacity) {
        Find(locator).sendKeys(capacity);
    }

    public void insertMondayCapacity(String locator, String capacity) {
        Find(locator).sendKeys(capacity);
    }

    public void insertTuesdayCapacity(String locator, String capacity) {
        Find(locator).sendKeys(capacity);
    }

    public void insertWednesdayCapacity(String locator, String capacity) {
        Find(locator).sendKeys(capacity);
    }

    public void insertThursdayCapacity(String locator, String capacity) {
        Find(locator).sendKeys(capacity);
    }

    public void insertFridayCapacity(String locator, String capacity) {
        Find(locator).sendKeys(capacity);
    }

    public void insertSaturdayCapacity(String locator, String capacity) {
        Find(locator).sendKeys(capacity);
    }

    public void clickButtonSaveCapacity(String locator) {
        Find(locator).click();
    }
}