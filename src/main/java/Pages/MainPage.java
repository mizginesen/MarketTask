package Pages;

import Base.BaseStepMethod;
import Utilities.ConfigReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static Base.BaseTest.driver;

public class MainPage extends BaseStepMethod {

    private static final Logger LOGGER= LogManager.getLogger(MainPage.class);

    private static final By BTN_MAINPAGE_GIRIS_YAP = By.xpath("//*[@id='myAccount']");
    private static final By BTN_MAINPAGE_LOGIN = By.id("login");

    private static final By TEXTBOX_EMAIL = By.id("txtUserName");

    private static final By TEXTBOX_PASSWORD = By.xpath("//input[@placeholder='Şifre']");

    private static final By BTN_LOGIN_BUTTON_1 = By.id("btnLogin");

    private static final By BTN_LOGIN_BUTTON_2 = By.id("btnEmailSelect");
    public void go_To_Url(String url){

        driver.get(url);
    }

    public void hoverOverGirisYapButon(){
        hoverElement(BTN_MAINPAGE_GIRIS_YAP,3);
        LOGGER.info("User hover over giris yap button");

        clickElement(BTN_MAINPAGE_LOGIN);
        LOGGER.info("User click login buton");
    }

}
