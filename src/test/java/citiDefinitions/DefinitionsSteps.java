package citiDefinitions;

import org.openqa.selenium.WebDriver;

import citiPages.LoginPage;
import citiSteps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class DefinitionsSteps {
	
	private WebDriver driver;
	private Conexion conexion = new Conexion ();
	private LoginPage loginpage = new LoginPage(driver);
	
	@Given("^abrir el navegador$")
	public void abrir_navegador()  {
		this.conexion= new Conexion();
		this.driver=this.conexion.abrirElNavegador();
	}
	
	@And ("to enter user(.*) and password(.*)$")
	public void abrirNavegador(String username, String password ) {
		this.loginpage=new LoginPage(driver);
		this.loginpage.llenardatos(username, password);
		
	}

}
