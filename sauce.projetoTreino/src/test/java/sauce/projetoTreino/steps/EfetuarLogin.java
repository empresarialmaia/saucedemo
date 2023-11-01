package sauce.projetoTreino.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sauce.projetoTreino.config.InicializarTeste;
import sauce.projetoTreino.pages.HomePage;

public class EfetuarLogin {
	
	HomePage home = new HomePage();
	
	
	@Before
	public void inicarTeste() {
	InicializarTeste.configurarAmbiente();	
	}
	@After
	
	public void finalizarTeste() {
	InicializarTeste.encerrarTeste();	
	}
	

	@When("informar username correto")
	public void informarUsernameCorreto() {
		home.username("standard_user");
	   
	}
	@When("informar password correto")
	public void informarPasswordCorreto() {
		home.password("secret_sauce");
	  
	}
	@Then("login efetuado com sucesso")
	public void loginEfetuadoComSucesso() {
		home.clicarBtLogin();
	    
	}




}
