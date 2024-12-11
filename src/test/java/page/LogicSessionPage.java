package page;

import conts.PropertyConst;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogicSessionPage extends BasePage {

    public LogicSessionPage() {
        super(driver);
    }

    public void navigateToBusinessCenter(){
        navigateTo(PropertyConst.WEB_SITE);
    }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void inputUsername(String locator, String CampUserName){
        Find(locator).click();
        Find(locator).sendKeys(CampUserName);
    }

    public void inputPassword(String locator, String CampPassword){
        Find(locator).click();
        Find(locator).sendKeys(CampPassword);
    }

    public void clickButton(String locator){
        Find(locator).click();
    }

    public void clickCloseButtonSession(String locator){
        Find(locator).click();
    }
}