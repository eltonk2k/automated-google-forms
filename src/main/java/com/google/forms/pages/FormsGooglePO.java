package com.google.forms.pages;

import org.openqa.selenium.*;
import static org.hamcrest.CoreMatchers.is;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class FormsGooglePO {
	private WebDriver driver;

	public void setup() {
		driver = new FirefoxDriver();
	}

	public void quit() {
		driver.quit();
	}

	public void accessPage() {
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSeBh8-5TWNDDPIzaJyEl1CxRzxr6-oisgnCashBGtymK7NRBA/viewform");
		driver.manage().window().setSize(new Dimension(1550, 830));
	}

	public void adicionarNome() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type=\'text\']")));
		element.click();
		driver.findElement(By.xpath("//input[@type=\'text\']")).sendKeys("Bueko Clubi Lofya");
	}


	public void adicionarEmail() {
		driver.findElement(By.xpath("//input[@type=\'email\']")).click();
		driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("teste@gmail.com");

	}


	public void selecionarCartaoVisa() {
		driver.findElement(By.xpath("//div[1]/label/div/div/div[2]")).click();
	}

	public void selecionarCartaoElo() {
		driver.findElement(By.xpath("//div[3]/label/div/div/div[2]")).click();
	}


	public void adicionarNumeroCartao() {
		driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("5519303309833920");
	}

	public void adcionarDataNascimento() {
		driver.findElement(By.xpath("//div[2]/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("//div[2]/div[1]/div/div[1]/input")).sendKeys("02");
		driver.findElement(By.xpath("//div[3]/div/div[2]/div[1]/div/div[1]/input")).sendKeys("08");
		driver.findElement(By.xpath("//div[5]/div/div[2]/div[1]/div/div[1]/input")).sendKeys("2023");
	}

	public void clickEnviar() {
		driver.findElement(By.xpath("//span/span")).click();
	}


	public void verificarTituloForms() {
		assertThat(driver.findElement(By.xpath("//div/div/div[2]")).getText(), is("ANALISTA DE TESTES E CONTROLE DE QUALIDADE"));
	}

	public void verificarEnvioMensagemSucessoForms() {
		assertThat(driver.findElement(By.xpath("//div[3]")).getText(), is("Sua resposta foi registrada."));
	}

	public void verificarBotaoEnviarOutraResposta() {
		List<WebElement> elements = driver.findElements(By.linkText("Enviar outra resposta"));
		assert(elements.size() > 0);
	}


	public void adicionarEmailInvalido() {
		driver.findElement(By.xpath("//input[@type=\'email\']")).click();
		driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("teste@gmail");

	}

	public void verificarMensagemFormatoEmailInvalido() {
		assertThat(driver.findElement(By.xpath("//div[3]/span")).getText(), is("Formato de e-mail inválido."));
	}

	public void adicionarNumeroCartaoInvalido() {
		driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div[1]/div/div[1]/input")).click();
		driver.findElement(By.xpath("//div[4]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("stringStringStringString");
	}

	public void verificarMensagemFormatoCartaoInvalido() {
		assertThat(driver.findElement(By.xpath("//div[4]/div/div/div[3]/span")).getText(), is("Número de cartão inválido."));
	}

	public void verificarMensagemCaixaSelecaoCartaoCreditoVazio() {
		assertThat(driver.findElement(By.xpath("//div/div/div[3]/span")).getText(), is("Esta pergunta é obrigatória"));
	}

}
