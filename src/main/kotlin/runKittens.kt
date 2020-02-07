package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.TimeoutException
import org.openqa.selenium.UnhandledAlertException
import org.openqa.selenium.chrome.ChromeDriver



fun kittenClassifieds(driver: ChromeDriver) {
    runClassSEAKitten(driver)
    runClassDALKitten(driver)
    runClassSANKitten(driver)
    runClassLAKitten(driver)
    runClassPhoenixKitten(driver)
    runClassPhiladelphiaKitten(driver)
    runClassNewYorkKitten(driver)
    runClassMiamiKitten(driver)
    runClassHoustonKitten(driver)
    runClassChicagoKitten(driver)
}

fun runBirdChicago(driver: ChromeDriver) {
    val usrAd = "customersupport@thefinchfarm.com"
    val pwAd = "Marketing2019!"
    adsLogin(driver,usrAd,pwAd)
    adNowChicago(driver)
}

fun runClassSEAKitten(driver: ChromeDriver) {
    val usrAd = "seattle"
    val pwAd = "SPKFS2019!"
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowSEAKitten(driver)
}

fun runClassSANKitten(driver: ChromeDriver) {
    val usrAd = "sandiego"
    val pwAd = "SDPKFS2019!"
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowSANKitten(driver)
}

fun runClassDALKitten(driver: ChromeDriver) {
    val usrAd = "dallas"
    val pwAd = "DPKFS2019!"
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowDALKitten(driver)
}

fun runClassLAKitten(driver: ChromeDriver) {
    val usrAd = "customersupport"
    val pwAd = "PKFS2019!"
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowLAKitten(driver)
}

fun runClassPhoenixKitten(driver: ChromeDriver) {
    val usrAd = "Phoenix"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowPhoenixKitten(driver)
}

fun runClassPhiladelphiaKitten(driver: ChromeDriver) {
    val usrAd = "philadelphia"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowPhiladelphiaKitten(driver)
}

fun runClassNewYorkKitten(driver: ChromeDriver) {
    val usrAd = "newyork"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowNewYorkKitten(driver)
}

fun runClassMiamiKitten(driver: ChromeDriver) {
    val usrAd = "miami"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowMiamiKitten(driver)
}

fun runClassHoustonKitten(driver: ChromeDriver) {
    val usrAd = "houston"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowHoustonKitten(driver)
}

fun runClassChicagoKitten(driver: ChromeDriver) {
    val usrAd = "chicago"
    val pwAd = adsNowKittensLogin.getValue(usrAd)
    adsLogin(driver,usrAd+"@petkittensforsale.com",pwAd)
    adNowChicagoKitten(driver)
}

fun adsLogin(driver: ChromeDriver, user: String, pass: String) {
    try {
        driver.get("https://www.classifiedads.com/login.php")
        driver.findElement(By.name("login_email")).sendKeys("$user")
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