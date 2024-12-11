package page;

import conts.PropertyConst;
import webElements.WebElements;

public class SessionPage extends LogicSessionPage {

    public SessionPage() {
        super();
    }

    public void insertUserName(){
        inputUsername(WebElements.userId, PropertyConst.USER);
    }

    public void insertPassword(){
        inputPassword(WebElements.password, PropertyConst.PASS);
    }

    public void selectButton() {
        clickButton(WebElements.loginButton);
    }

    public void selectCloseButton() {
        clickCloseButtonSession(WebElements.signOut);
    }

    public static void closeBrowser(){
        driver.quit();
    }
}