package seleniumgluecode;

import org.openqa.selenium.chrome.ChromeDriver;
import pom.HomePage;
import pom.SingUpPage;

public class TestBase {

    protected ChromeDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected SingUpPage singUpPage = new SingUpPage(driver);

}
