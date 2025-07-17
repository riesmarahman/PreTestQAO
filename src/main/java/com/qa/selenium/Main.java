package com.qa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
   /* public static void main(String[] args){
  //      System.out.println("Halo ini dari kelas main");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
//        System.out.println("Title: " + driver.getTitle());
        WebElement searcBox = driver.findElement(By.name("q"));
        searcBox.sendKeys("Buah Mangga");
        searcBox.submit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));

        WebElement gambarTab = driver.findElement(By.linkText("Gambar"));
        gambarTab.click();

        System.out.println("Gambar sudah berhasil muncul");
        driver.quit();
    }

    */
}
