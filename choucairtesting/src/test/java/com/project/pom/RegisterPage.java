package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base {
	
	By registerLinkLocator = By.linkText("Servicios");
	By registerPageCapacidades= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/investigacion.png']");
	By registerLinkCapacidades = By.linkText("Capacidades");
	
	By registerPageHacemos= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/mision.png']");
	By registerLinkHacemos = By.linkText("C�mo lo hacemos");
	
	By registerPagePortafolio = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/10/presentacion.png']");
	By registerLinkPortafolio  = By.linkText("Portafolio de Soluciones");
	
	//Portafolio
	
	By registerPageDigital= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/DPM.png']");
	By registerLinkDigital = By.linkText("Digital Performance Management");
	
	By registerPagePruebas= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Moviles.png']");
	By registerLinkPruebas = By.linkText("Pruebas M�viles");
	
	By registerPageBI= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/BI.png']");
	By registerLinkBI = By.linkText("Business Intellingence");
	
	By registerPageUsabilidad= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Usabilidad.png']");
	By registerLinkUsabilidad = By.linkText("Pruebas de Usabilidad");
	
	By registerPageContables= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/AFT.png']");
	By registerLinkContables = By.linkText("Pruebas Contables y Financieras");
	
	By registerPageDesempe�o= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Performance.png']");
	By registerLinkDesempe�o = By.linkText("Pruebas de Desempe�o");
	
	By registerPageMigraci�n= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Migracion.png']");
	By registerLinkMigraci�n = By.linkText("Pruebas de Migraci�n");
	
	By registerPageGeneralistas= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Generalista-1.png']");
	By registerLinkGeneralistas = By.linkText("Pruebas Generalistas");
	
	By registerPageSAP= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/SAP.png']");
	By registerLinkSAP = By.linkText("Automatizaci�n de Pruebas SAP");
	
	By registerPageAutomatizaci�n= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Automatizacion.png']");
	By registerLinkAutomatizaci�n = By.linkText("Automatizaci�n de Pruebas");
	
	By registerPageAmbientes= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Ambientes.png']");
	By registerLinkAmbientes = By.linkText("Ambientes de Prueba");
	
	By registerPageSwitches = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Switch.png']");
	By registerLinkSwitches  = By.linkText("Switches Transaccionales");
	
	By registerPageN�mina= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/nomina.png']");
	By registerLinkN�mina = By.linkText("Pruebas de N�mina");
	
	By registerPageSeguridad= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Seguridad.png']");
	By registerLinkSeguridad = By.linkText("Pruebas de Seguridad");
	
	By registerPageAlta= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Alta-auto.png']");
	By registerLinkAlta = By.linkText("Alta automatizaci�n");
	
	By registerPageCursos= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2018/09/Cursos.png']");
	By registerLinkCursos = By.linkText("Cursos y Certificaciones");

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
	public void testCapacidadesPage()throws InterruptedException {
		click(registerLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(registerPageCapacidades)) {
		
	}else {
		System.out.print("Registrer page was not found");
	}
	
	}
	
	public String registeredMessage() {
		return "";
	}
	
	
}



















