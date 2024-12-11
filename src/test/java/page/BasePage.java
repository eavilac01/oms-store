package page;

import conts.PropertyConst;
import inputData.BrowserData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import settings_browser.ViewSettings;
import utils.BrowserUtils;

public class BasePage {

    protected static WebDriver driver;
    public static WebDriverWait wait;
    static ViewSettings settings = new ViewSettings();
    private static final Logger logger = LoggerFactory.getLogger(BasePage.class);


    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(settings.getHeadless_mode());
        driver = new ChromeDriver(chromeOptions);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        logger.info("{} {}", BrowserData.webSiteAdmin, PropertyConst.WEB_SITE);
        logger.info("{} {}", BrowserData.AppLoad, driver.getPageSource());
        wait = new WebDriverWait(driver, BrowserUtils.WAIT);
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, BrowserUtils.WAIT);

    }

    public static void navigateTo(String url){
        driver.get(url);
    }
}