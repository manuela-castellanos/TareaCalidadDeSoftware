package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    private static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PERSONAL\\UNIMINUTO\\SegundoTestClase\\src\\main\\resources\\chromedriver.exe");

        driver= new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        String usuario = "standard_user";
        String contrasena = "secret_sauce";

        //localizador del elemento

        WebElement usuarioEntrada= driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement contrasenaEntrada = driver.findElement(By.id("password"));

        WebElement btnIngresar = driver.findElement(By.xpath("//input[@id='login-button']"));

        usuarioEntrada.sendKeys(usuario);
        contrasenaEntrada.sendKeys(contrasena);
        btnIngresar.click();


        WebElement btncompra= driver.findElement(By.xpath("//div[@class='inventory_list']/div[1]//button[@class='btn_primary btn_inventory']"));
        btncompra.click();
        WebElement btncopra1 = driver.findElement(By.xpath("//div[4]//button[@class='btn_primary btn_inventory']"));
        btncopra1.click();

        WebElement carrito= driver.findElement(By.cssSelector("path"));
        carrito.click();


    }
}
