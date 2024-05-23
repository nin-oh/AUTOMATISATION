package org.xproce;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSeleniumTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Spécifiez le chemin vers GeckoDriver
        System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe"); // Mettez à jour ce chemin selon votre système
        driver = new FirefoxDriver();
        // Construire le chemin complet du fichier HTML local
        String filePath = "file:///C:/Users/houma/OneDrive/Desktop/AUTOMATISATION/src/Templates/calculator.html";
        driver.get(filePath); // Ouvrir le fichier HTML local
    }

    @Test
    public void testCalculator() {
        WebElement num1Field = driver.findElement(By.id("num1"));
        WebElement num2Field = driver.findElement(By.id("num2"));
        WebElement calculateButton = driver.findElement(By.xpath("//button[text()='Calculate']"));
        WebElement resultDiv = driver.findElement(By.id("result"));

        num1Field.sendKeys("2");
        num2Field.sendKeys("3");
        calculateButton.click();

        assertEquals("Result: 5.0", resultDiv.getText(), "2 + 3 devrait être égal à 5");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}