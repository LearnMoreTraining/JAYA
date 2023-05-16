package stepdefination;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;


public class Hooks {

    @Before
    public  void setup(){

        System.out.println("Before");
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("AfterStep");
    }

    @After
    public void teardown(){

        System.out.println("After");
    }

}
