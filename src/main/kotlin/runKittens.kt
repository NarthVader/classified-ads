package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.UnhandledAlertException
import org.openqa.selenium.chrome.ChromeDriver

fun runClassifieds(driver: ChromeDriver) {
    runClassLAKitten(driver)
    runClassPhoenixKitten(driver)
    runClassPhiladelphiaKitten(driver)
    runClassNewYorkKitten(driver)
    runClassMiamiKitten(driver)
    runClassHoustonKitten(driver)
    runClassChicagoKitten(driver)
}

fun runClassChicago(driver: ChromeDriver) {
    val usrAd = "customersupport@thefinchfarm.com"
    val pwAd = "Marketing2019!"
    adsLogin(driver,usrAd,pwAd)
    adNowChicago(driver)
}

fun runClassLAKitten(driver: ChromeDriver) {
    val usrAd = "customersupport"
    val pwAd = "PKFS2019!"
    adsLogin(driver,usrAd,pwAd)
    adNowLAKitten(driver)
}

fun runClassPhoenixKitten(driver: ChromeDriver) {
    val usrAd = "Phoenix"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd,pwAd)
    adNowPhoenixKitten(driver)
}

fun runClassPhiladelphiaKitten(driver: ChromeDriver) {
    val usrAd = "philadelphia"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd,pwAd)
    adNowPhiladelphiaKitten(driver)
}

fun runClassNewYorkKitten(driver: ChromeDriver) {
    val usrAd = "newyork"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd,pwAd)
    adNowNewYorkKitten(driver)
}

fun runClassMiamiKitten(driver: ChromeDriver) {
    val usrAd = "miami"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd,pwAd)
    adNowMiamiKitten(driver)
}

fun runClassHoustonKitten(driver: ChromeDriver) {
    val usrAd = "houston"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd,pwAd)
    adNowHoustonKitten(driver)
}

fun runClassChicagoKitten(driver: ChromeDriver) {
    val usrAd = "chicago"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd,pwAd)
    adNowChicagoKitten(driver)
}

fun adsLogin(driver: ChromeDriver, user: String, pass: String) {
    try {
        driver.get("https://www.classifiedads.com/login.php")
        driver.findElement(By.name("login_email")).sendKeys("$user"+"@petkittensforsale.com")
        driver.findElement(By.name("login_password")).sendKeys("$pass")
        driver.findElement(By.xpath("//input[@value='Log in']")).click()
        Thread.sleep(1000)

    }
    catch (a: UnhandledAlertException) {
        println("Alert Exception: $a")
        driver.switchTo().alert().accept()
    } catch (t: TimeoutException) {
        println("Timeout Exception: $t")
    } catch (n: NoSuchElementException) {
        println("No Such Element Exception: $n")
    } catch (o: Exception) {
        println("Other Exceptions: $o")
    }
}