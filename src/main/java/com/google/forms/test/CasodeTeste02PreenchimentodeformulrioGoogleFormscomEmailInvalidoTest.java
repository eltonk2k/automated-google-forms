package com.google.forms.test;

import com.google.forms.pages.FormsGooglePO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CasodeTeste02PreenchimentodeformulrioGoogleFormscomEmailInvalidoTest {
    private FormsGooglePO formsGooglePO;

    private WebDriver driver;

    @Before
    public void setUp() {
        formsGooglePO = new FormsGooglePO();
        formsGooglePO.setup();
    }

    @After
    public void tearDown() {
        formsGooglePO.quit();
    }




    @Test
    public void ctPreenchimentodeformulriogoogleformscomSucesso() {
        formsGooglePO.accessPage();

        formsGooglePO.adicionarNome();
        formsGooglePO.adicionarEmailInvalido();
        formsGooglePO.selecionarCartaoVisa();
        formsGooglePO.selecionarCartaoElo();
        formsGooglePO.adicionarNumeroCartao();
        formsGooglePO.adcionarDataNascimento();
        formsGooglePO.clickEnviar();


    }
}
