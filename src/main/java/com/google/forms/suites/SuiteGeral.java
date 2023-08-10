package com.google.forms.suites;

import com.google.forms.test.CasodeTeste01PreenchimentoFormularioGoogleFormscomSucessoTest;
import com.google.forms.test.CasodeTeste02PreenchimentoFormularioGoogleFormscomEmailInvalidoTest;
import com.google.forms.test.CasodeTeste03PreenchimentoFormularioGoogleFormscomNumeroCartaoInvalidoTest;
import com.google.forms.test.CasodeTeste04PreenchimentoFormularioGoogleFormscomCaixaSelecaoCartaoCreditoemBrancoTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({

        CasodeTeste01PreenchimentoFormularioGoogleFormscomSucessoTest.class,
        CasodeTeste02PreenchimentoFormularioGoogleFormscomEmailInvalidoTest.class,
        CasodeTeste03PreenchimentoFormularioGoogleFormscomNumeroCartaoInvalidoTest.class,
        CasodeTeste04PreenchimentoFormularioGoogleFormscomCaixaSelecaoCartaoCreditoemBrancoTest.class
	
})
public class SuiteGeral {

}
