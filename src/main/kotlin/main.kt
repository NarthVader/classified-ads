import com.pinnsights.*
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import java.io.File
import java.util.HashMap
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val chromePrefs = HashMap<String, Any>()
    chromePrefs["profile.default_content_settings.popups"] = 0
    val options = ChromeOptions()
    options.setExperimentalOption("prefs", chromePrefs)
    val cap = DesiredCapabilities.chrome()
    cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true)
    cap.setCapability(ChromeOptions.CAPABILITY, options)
    val driver = ChromeDriver(cap)

    var puppyLocation = ""
    var puppyPost = false
//
//    val file = File("BWWHistory.txt")
//    if (!file.exists()) file.createNewFile()
//    val history = file.readLines()
//
//    driver.get("https://waitbutwhy.com/archive")
//
//    val titles = driver.findElementsByClassName("post-right")
//        .map { it.findElement(By.tagName("H5")) }
//        .map { it.findElement(By.tagName("A")) }
//        .map { it.text }
//
//    val new = titles - history
//    if (new.isEmpty()) {
//        println("Nothing new on But Wait Why?")
//    } else {
//        println("New articles:")
//        new.forEach {
//            println(it)
//            file.appendText("$it\n")
//        }
//    }


    //    "seattle" "san diego" "Phoenix" "philadelphia"
//    "new york" "miami" "los angeles" "houston" "dallas" "chicago"

//    puppyLocation = "seattle"
//    puppyPost = true

    if(puppyPost) {
        autoPuppyPost(driver,puppyLocation)
    } else {
        runClassifieds(driver)
    }

    driver.close()

    exitProcess(1)
}

fun runClassifieds(driver: ChromeDriver) {
    birdClassifieds(driver)
    kittenClassifieds(driver)
    puppyClassifieds(driver)
}

fun birdClassifieds(driver: ChromeDriver) {
    runBirdChicago(driver)
}