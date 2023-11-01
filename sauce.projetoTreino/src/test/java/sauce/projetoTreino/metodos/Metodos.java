package sauce.projetoTreino.metodos;

import org.openqa.selenium.By;

import sauce.projetoTreino.drivers.DriversConexao;

public class Metodos extends DriversConexao {

	public void escrever(By locator, String texto) {
		try {
			driver.findElement(locator).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("*************Causa do erro************" + e.getCause());
			System.out.println("************Mensagem do erro***********" + e.getMessage());
		}

	}

	public void clicar(By locator) {
		try {
			driver.findElement(locator).sendKeys();
		} catch (Exception e) {
			System.out.println("*************Causa do erro************" + e.getCause());
			System.out.println("************Mensagem do erro***********" + e.getMessage());
		}

	}

}
