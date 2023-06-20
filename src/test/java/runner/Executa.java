package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory {

	public static void abrirNavegador() {

		String browser = "https://www.amazon.com.br/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(browser);
		driver.manage().window().maximize();
	}

}
