package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage{

    private String titleHomePage = "STORE";
    private By botonSingUp = By.id("signin2");
    private By botonLogIn = By.id("login2");
    private By botonContact = By.id("nav-link");
    private By botonLaptops = By.id("itemc");


    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception{
        return this.getTitle().equals(titleHomePage);
    }

    public  void clickOnSingUp() throws Exception {
        this.click(botonSingUp);
    }

    public  void clickOnLogIn() throws Exception {
        this.click(botonLogIn);
    }

    public  void clickOnContact() throws Exception {
        this.click(botonContact);
    }

    public  void clickOnLaptops() throws Exception {
        this.click(botonLaptops);
    }
}
