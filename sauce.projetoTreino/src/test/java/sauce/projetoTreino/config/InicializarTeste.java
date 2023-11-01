package sauce.projetoTreino.config;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import sauce.projetoTreino.drivers.DriversConexao;

public class InicializarTeste extends DriversConexao {

	static String ambiente = "https://www.saucedemo.com/";

	public static void configurarAmbiente() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();

	}

	public static void encerrarTeste() {
		driver.quit();
	}

}
