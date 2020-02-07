package com.pinnsights

import org.openqa.selenium.chrome.ChromeDriver

val puppiesPassword = "PPFS2020!"

fun puppyClassifieds(driver: ChromeDriver) {
    runClassSEAPuppy(driver)
    runClassDALPuppy(driver)
    runClassSANPuppy(driver)
    runClassLAPuppy(driver)
    runClassPhoenixPuppy(driver)
    runClassPhiladelphiaPuppy(driver)
    runClassNewYorkPuppy(driver)
    runClassMiamiPuppy(driver)
    runClassHoustonPuppy(driver)
    runClassChicagoPuppy(driver)
}

fun runClassSEAPuppy(driver: ChromeDriver) {
    val usrAd = "seattle"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com", puppiesPassword)
    adNowSEAPuppy(driver)
}

fun runClassSANPuppy(driver: ChromeDriver) {
    val usrAd = "sandiego"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com",puppiesPassword)
    adNowSANPuppy(driver)
}

fun runClassDALPuppy(driver: ChromeDriver) {
    val usrAd = "dallas"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com",puppiesPassword)
    adNowDALPuppy(driver)
}

fun runClassLAPuppy(driver: ChromeDriver) {
    val usrAd = "la"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com",puppiesPassword)
    adNowLAPuppy(driver)
}

fun runClassPhoenixPuppy(driver: ChromeDriver) {
    val usrAd = "Phoenix"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com",puppiesPassword)
    adNowPhoenixPuppy(driver)
}

fun runClassPhiladelphiaPuppy(driver: ChromeDriver) {
    val usrAd = "philadelphia"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com",puppiesPassword)
    adNowPhiladelphiaPuppy(driver)
}

fun runClassNewYorkPuppy(driver: ChromeDriver) {
    val usrAd = "newyork"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com",puppiesPassword)
    adNowNewYorkPuppy(driver)
}

fun runClassMiamiPuppy(driver: ChromeDriver) {
    val usrAd = "miami"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com",puppiesPassword)
    adNowMiamiPuppy(driver)
}

fun runClassHoustonPuppy(driver: ChromeDriver) {
    val usrAd = "houston"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com",puppiesPassword)
    adNowHoustonPuppy(driver)
}

fun runClassChicagoPuppy(driver: ChromeDriver) {
    val usrAd = "chicago"
    adsLogin(driver,usrAd+"@petpuppiesforsale.com",puppiesPassword)
    adNowChicagoPuppy(driver)
}