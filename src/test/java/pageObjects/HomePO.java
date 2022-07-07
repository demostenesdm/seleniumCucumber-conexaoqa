package pageObjects;

import org.openqa.selenium.By;

import static Hooks.driverFactory.getDriver;

public class HomePO {

    By btnLogin = By.cssSelector(".btn-light");
    By btnCadastrar = By.cssSelector(".btn-primary");

    public void openHome(){
        getDriver().get("https://conexaoqa.herokuapp.com/");
    }
    public void btnLoginClick(){

    }
    public void btnCadastrarClick(){

    }
}
