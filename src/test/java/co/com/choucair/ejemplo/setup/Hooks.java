package co.com.choucair.ejemplo.setup;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static co.com.choucair.ejemplo.utils.KillBrowser.processes;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

public class Hooks {

    @Before
    public void initialConfigurationDektop() {

        setTheStage(new OnlineCast());
    }

    @After
    public void killBrowser() throws IOException, InterruptedException {
        processes("chromedriver");
    }

}
