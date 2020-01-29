package com.pinnsights

import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select


fun autoPuppyPost(driver: ChromeDriver,location:String) {
    var userLoc = ""
    if(location=="san diego") {
        userLoc = "sandiego"
    } else if(location=="new york") {
        userLoc = "newyork"
    } else if(location=="los angeles") {
        userLoc="la"
    }
    else {
        userLoc = location
    }
    var user = "$userLoc@petpuppiesforsale.com"
    var pass = "PPFS2020!"
    adsLogin(driver,user,pass)
    postBorderCollie(driver,location)
    postBichon(driver, location)
    postBeagle(driver, location)
    postAustralianShepherd(driver, location)
    postAustralianCattle(driver, location)
    postAkita(driver, location)
    postDalmation(driver, location)
    postAffenpinscher(driver, location)
}

fun postBorderCollie(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Border Collie Puppies")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    puppyDropdownFirst(driver,location)
    driver.findElement(By.name("title")).sendKeys("Border Collie Puppies")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("2874.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petpuppiesforsale.com/collie-puppies-for-sale/\n" +
            "Email - customersupport@petpuppiesforsale.com\n" +
            "Call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Border Collie Puppies\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified ")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postBichon(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Bichon Frise Puppies for Sale")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    puppyDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Bichon Frise Puppies for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("2561.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petpuppiesforsale.com/bichon-puppies-for-sale/\n" +
            "Email - customersupport@petpuppiesforsale.com\n" +
            "Call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Bichon Frise Puppies for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postBeagle(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Beagle Puppies for Sale")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    puppyDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Beagle Puppies for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("3124.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petpuppiesforsale.com/beagle-puppies/\n" +
            "Email - customersupport@petpuppiesforsale.com\n" +
            "Call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Beagle Puppies for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postAustralianShepherd(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Australian Shepherd Puppies")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    puppyDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Australian Shepherd Puppies")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("2561.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petpuppiesforsale.com/australian-shepherd-puppies/\n" +
            "Email - customersupport@petpuppiesforsale.com\n" +
            "Call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Australian Shepherd Puppies\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postAustralianCattle(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Australian Cattle puppies for sale")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    puppyDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Australian Cattle puppies for salee")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("3374.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petpuppiesforsale.com/australian-cattle-dog-puppies/\n" +
            "Email - customersupport@petpuppiesforsale.com\n" +
            "Call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Australian Cattle puppies for sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postAkita(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Pet Akita puppies for sale")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    puppyDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Pet Akita puppies for sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("3499.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petpuppiesforsale.com/akita-puppies/\n" +
            "Email - customersupport@petpuppiesforsale.com\n" +
            "Call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Akita puppies for sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postDalmation(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Dalmatian Puppies for Sale")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    puppyDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Dalmatian Puppies for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("2749.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petpuppiesforsale.com/dalmatian-puppies/\n" +
            "Email - customersupport@petpuppiesforsale.com\n" +
            "Call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Dalmatian Puppies for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}

fun postAffenpinscher(driver: ChromeDriver,location: String) {

    Thread.sleep(3000)
    println("creating Affenpinscher Puppies for Sale")
    driver.get("https://www.classifiedads.com/post.php")
    Thread.sleep(3000)

    puppyDropdownSecond(driver,location)
    driver.findElement(By.name("title")).sendKeys("Affenpinscher Puppies for Sale")
    Thread.sleep(1000)
    driver.findElement(By.name("price")).sendKeys("4374.99")
    Thread.sleep(1000)
    iframe(driver)
    driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")).sendKeys("https://www.petpuppiesforsale.com/affenpinscher-puppies/\n" +
            "Email - customersupport@petpuppiesforsale.com\n" +
            "Call 877-527-5656\n" +
            "Will Ship\n" +
            "Pet Affenpinscher Puppies for Sale\n" +
            "Active, Playful, Requires Attention, Affectionate , Vocal, Docile, Intelligent, Independent, Health, Grooming, Child Friendly, Pet Friendly\n" +
            "Health Certificate, Vet certified")
    Thread.sleep(3000)
    driver.switchTo().defaultContent()
    captchaLoop(driver,location)
    Thread.sleep(3000)
    driver.findElement(By.xpath("//a[@class='flat']")).click()
}


fun puppyDropdownFirst(driver: ChromeDriver,location: String) {
    //pets dropdown
    Select(driver.findElement(By.name("category"))).selectByValue("17")
    Thread.sleep(3000)

    //pets dropdown
    Select(driver.findElement(By.id("subcategory"))).selectByValue("289")
    Thread.sleep(3000)

    driver.findElement(By.cssSelector("#location")).sendKeys(location)
    Thread.sleep(3000)
    var locString = locMap.getValue(location)
    driver.findElement(By.xpath("//li[@lid='$locString']")).click()
    Thread.sleep(3000)
}

fun puppyDropdownSecond(driver: ChromeDriver,location: String) {
    //pets dropdown
    Select(driver.findElement(By.name("category"))).selectByValue("17")
    Thread.sleep(3000)

    //pets dropdown
    Select(driver.findElement(By.id("subcategory"))).selectByValue("289")
    Thread.sleep(3000)

}

fun iframe(driver: ChromeDriver) {
    val iframe = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"))
    driver.switchTo().frame(iframe)
    Thread.sleep(3000)
}

fun captchaLoop(driver: ChromeDriver, location: String) {
    Thread.sleep(3000)
    var done = false
    var test = driver.findElement(By.name("captchacode"))
    driver.findElement(By.name("captchacode")).sendKeys("test")
    Thread.sleep(1000)
    while(!done) {
        var input = driver.findElement(By.name("captchacode")).getAttribute("value")
        if(input.length==5 && !test.equals(driver.switchTo().activeElement())) {
            println("conditions met")
            done = true
        }
        Thread.sleep(1000)
    }
}