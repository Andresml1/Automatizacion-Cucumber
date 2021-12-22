package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingUpPage extends BasePage {

     private By pageTitleLocator = By.id("signInModalLabel");
     private By pageTitleTwoLocator = By.id("logInModalLabel");
     private String titlePage = "Sing Up";
     private String titleTwoPage = "Log in";
     private By user = By.id("sign-username");
     private By password = By.id("sign-password");
     private By email = By.id("recipient-email");
     private By name = By.id("recipient-name");
     private By message = By.id("message-text");


    public SingUpPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleSingUpDisplayed() throws Exception {
       return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }

    public boolean isTitleLogInDisplayed() throws Exception {
        return this.isDisplayed(pageTitleTwoLocator) && this.getText(pageTitleTwoLocator).equals(titleTwoPage);
    }

    public By getUser() {
        return user;
    }

    public By getPassword() {
        return password;
    }

    public By getEmail() {
        return email;
    }

    public By getName() {
        return name;
    }

    public By getMessage() {
        return message;
    }
}
