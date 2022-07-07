package Hooks;

import org.junit.After;
import org.junit.Before;

import static Hooks.driverFactory.getDriver;
import static Hooks.driverFactory.killDriver;

public class Hook {

    @Before
    public void tearUp(){
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(){
        //killDriver();
    }
}
