package seleniumgluecode;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ro.Si;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.BasePage;
import pom.SingUpPage;


public class Test extends TestBase {


    @Given("^El usuario en la pagina home de demoblaze$")
    public void el_usuario_en_la_pagina_home_de_demoblaze() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el boton Sing Up$")
    public void hace_click_sobre_el_boton_Sing_Up() throws Throwable {
        homePage.clickOnSingUp();
    }

    @When("^Abre ventana emergente de Sing Up$")
    public void Abre_Ventana_Emergente_Se_Sing_Up() throws Throwable {
        Assert.assertTrue( "No abrio correctamente la ventana de Sing Up", singUpPage.isTitleSingUpDisplayed());
    }


    @When("^Ingresa (.*) and (.*)$/")
    public void Ingresa_UserName_And_Password(String UserName, String Password) {
        this.singUpPage.getUser();
        this.singUpPage.getPassword();

    }


    @Then("^Hace click en el boton Sing Up$")
    public void Hace_Click_En_El_Boton_Sing_Up() throws Throwable {
        WebElement botonSingUp = driver.findElement(By.id("btn btn-primary"));
        botonSingUp.click();
    }





    @Given("^El usuario se ubica en la pagina home de demoblaze$")
    public void El_Usuario_Ubica_En_La_Pagina_Home_De_Demoblaze() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el boton Log In$")
    public void hace_click_sobre_el_boton_Log_In() throws Throwable {
        homePage.clickOnLogIn();
    }

    @When("^Abre ventana emergente de Log In$")
    public void Abre_Ventana_Emergente_Se_Log_In() throws Throwable {
        Assert.assertTrue( "No abrio correctamente la ventana de Log_In", singUpPage.isTitleLogInDisplayed());
    }


    @When("^Ingresa el (.*) and (.*)$/")
    public void Ingresa_El_UserName_And_Password(String UserName, String Password) {
        this.singUpPage.getUser();
        this.singUpPage.getPassword();

    }


    @Then("^Hace click en el boton Log In$")
    public void Hace_Click_En_El_Boton_Log_In() throws Throwable {
        WebElement botonLogIn = driver.findElement(By.id("btn btn-primary"));
        botonLogIn.click();
    }



    @Given("^El usuario se encuentra en la pagina home de demoblaze$")
    public void El_Usuario_Se_Encuentra_En_La_Pagina_Home_De_Demoblaze() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre el boton Contact$")
    public void hace_click_sobre_el_boton_Contact() throws Throwable {
        homePage.clickOnContact();
    }


    @When("^Ingresa los datos de contacto (.*) and (.*) and (.*)$/")
    public void Ingresa_El_UserName_And_Password(String Email, String Name,String Message) {
        this.singUpPage.getEmail();
        this.singUpPage.getName();
        this.singUpPage.getMessage();

    }


    @Then("^Hace click en el boton Send Message$")
    public void Hace_Click_En_El_Boton_Send_Message() throws Throwable {
        WebElement botonSendMessage = driver.findElement(By.id("btn btn-primary"));
        botonSendMessage.click();
    }


    @Given("^El usuario se encuentra en la pagina Home Page$")
    public void El_Usuario_Se_Encuentra_En_La_Pagina_Home_Page() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("^Hace click sobre la categoria Laptops$")
    public void hace_click_sobre_La_Categoria_Laptops() throws Throwable {
        homePage.clickOnLaptops();
    }

    @When("^Hace click en MackBook Pro$")
    public void Hace_Click_En_MackBook_Pro() throws Throwable {
        WebElement botonAddToCart = driver.findElement(By.id("col-lg-4 col-md-6 mb-4"));
        botonAddToCart.click();
    }


    @Then("^Hace click en Add To Cart$")
    public void Hace_Click_En_Add_To_Cart() throws Throwable {
        WebElement botonAddToCart = driver.findElement(By.id("btn btn-success btn-lg"));
        botonAddToCart.click();
    }
}
