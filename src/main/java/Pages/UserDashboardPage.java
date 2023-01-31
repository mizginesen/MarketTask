package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class UserDashboardPage extends BaseStepMethod {

    private static final Logger LOGGER = LogManager.getLogger(UserDashboardPage.class);

    private static final By TXT_USERDPAGE_USERNAME = By.xpath("((//a[@title='Hesabım'])//span)[2]");
    private static final By INPUT_USERPAGE_SEARCH_BOX = By.xpath("(//input[@type='text'])[1]");

    public void verifyValidLogin(String userName){
       // getTextElement(TXT_USERDPAGE_USERNAME);
        ContainsText(TXT_USERDPAGE_USERNAME,userName);
        LOGGER.info("User text is verified "+userName);
    }

    public void searchProduct(String product){
        setTextElement(INPUT_USERPAGE_SEARCH_BOX, product);
    }
}
