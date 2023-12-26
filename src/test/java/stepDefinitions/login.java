package stepDefinitions;
import org.openqa.selenium.JavascriptExecutor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class login {
    private WebDriver driver;

    @Given("The user accesses lovelocal page")
    public void the_user_accesses_lovelocal_page()  {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-notifications");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.lovelocal.in/");

    }
//2nd
    @When("The user clicks on the account button")
    public void the_user_clicks_on_the_account_button() {
        WebElement accountButton = driver.findElement(By.xpath("//span[@class=\"text-truncate\"]"));
        accountButton.click();
    }

    @And("The user clicks on the get started button")
    public void the_user_clicks_on_the_get_started_button() {
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class, 'width240p') and contains(@class, 'btn-primary')]"));
        loginButton.click();
    }

    @And("The user enter valid mobile number")
    public void the_user_enter_valid_mobile_number() throws InterruptedException {
        WebElement phoneNumberInput = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
        phoneNumberInput.sendKeys("9930000000");
        Thread.sleep(10000);

    }

    @And("The user clicks on Next button")
    public void the_user_clicks_on_next_button() throws InterruptedException {
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='phone-number-submit']"));
        submitButton.click();
        Thread.sleep(10000);
    }

    @And("The user enter valid OTP")
    public void the_user_enter_valid_otp() {
        WebElement otpInput = driver.findElement(By.xpath("//input[contains(@name, 'otp') and contains(@placeholder, 'Enter OTP')]"));
        otpInput.sendKeys("9876");
    }


    @And("The user clicks on the Next button")
    public void the_user_clicks_on_the_next_button() throws InterruptedException {
        WebElement otpSubmitButton = driver.findElement(By.xpath("//button[@id='otp-submit']"));
        otpSubmitButton.click();
        Thread.sleep(5000);

    }

    @And("The user selects a language")
    public void the_user_selects_a_language() {
        WebElement selectButton = driver.findElement(By.xpath("//div[text()='मराठी']/../..//div[@class='custom-control custom-radio']"));
        selectButton.click();

    }

    @And("The user clicks on the update button")
    public void the_user_clicks_on_the_update_button() throws InterruptedException {
        WebElement updateButton = driver.findElement(By.xpath("//button[@class='font-weight-black w-100 btn btn-primary btn-lg' and text()='UPDATE']"));
        updateButton.click();
        Thread.sleep(5000);
    }

    @Then("The user should be redirected to a successful lovelocal page")
    public void the_user_should_be_redirected_to_a_successful_lovelocal_page() throws InterruptedException {
        System.out.println("successfully");
    }



    //3rdSCE
    @When("The user clicks on the banner shop now page")
    public void the_user_clicks_on_the_banner_shop_now_page() throws InterruptedException {
        Thread.sleep(5000);
        // Use Duration for the timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Wait for the element to be clickable
        WebElement orderButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Winter ']")));
        driver.findElement(By.xpath("//img[@alt='Winter ']")).click();
        System.out.println("Winter Banner clicked successfully");
        Thread.sleep(3000);
        WebDriver.Navigation nav = driver.navigate();
        nav.back();
    }

    @And("The user clicks on the order now banner page")
    public void the_user_clicks_on_the_order_now_banner_page() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement shopButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Welcome LOVEIT OFFER']")));
        driver.findElement(By.xpath("//img[@alt='Welcome LOVEIT OFFER']")).click();
        System.out.println("Welcome LOVEIT OFFER Banner clicked successfully");
        Thread.sleep(3000);
        WebDriver.Navigation nav = driver.navigate();
        nav.back();
        }

    @And("The user clicks on the refer now banner page")
    public void the_user_clicks_on_the_refer_now_banner_page() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement referButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Christmas_SANTA']")));
        driver.findElement(By.xpath("//img[@alt='Christmas_SANTA']")).click();
        System.out.println("Christmas_SANTA Banner clicked successfully");
        Thread.sleep(6000);
        WebDriver.Navigation nav = driver.navigate();
        nav.back();

    }

    @Then("The user successfully navigates back to the home page")
    public void the_user_successfully_navigates_back_to_the_home_page() {
        driver.navigate().back();
        System.out.println("Successfully navigated back to the home page");
        driver.quit();
    }


//4thSEC

    @When("The user scrolls up to the want to repeat section")
    public void the_user_scrolls_up_to_the_want_to_repeat_section() {
        // Assuming you want to scroll to an element with the text "Atul Hiralkar"
        WebElement atulHiralkarElement = driver.findElement(By.xpath("/html//div[@id='root']/div//section[@class='r__section r__section_first']//h3[.='Atul Hiralkar']"));
        // Use JavascriptExecutor to scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", atulHiralkarElement);
    }

    @And("The user clicks on the want to repeat product")
    public void the_user_clicks_on_the_want_to_repeat_product() {
        driver.findElement(By.xpath("//img[@alt='Britannia Daily Bread - Sub Olive, Ideal For Italian & Greek Cuisine 200 g ']"));
         System.out.println("successfully");
    }

    @And("The user successfully lands on the shops front")
    public void the_user_successfully_lands_on_the_shops_front() {
        System.out.println("successfully");
    }

    @Then("The user successfully navigates back to the home page")
    public void the_user_successfully_navigates_back_to_the_home_page() {
        System.out.println("successfully");
        driver.navigate().back();
    }


//5thSEC
    @When("The user scrolls up to super saving for you")
    public void theUserScrollsUpToSuperSavingForYou() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement superSavingElement = driver.findElement(By.xpath("//h3[text()='super savings for you']"));
        js.executeScript("arguments[0].scrollIntoView(true);", superSavingElement);
        Thread.sleep(10000);
    }

    @And("The user clicks on earn and refer page")
    public void the_user_clicks_on_earn_and_refer_page() throws InterruptedException{
        WebElement efButton = driver.findElement(By.xpath("//img[@alt='Refer and Earn']"));
        efButton.click();
        Thread.sleep(10000);
    }

    @And("The user successfully lands on the refer a friend popup")
    public void the_user_successfully_lands_on_the_refer_a_friend_popup() throws InterruptedException{
        WebElement rfButton = driver.findElement(By.xpath("//h3[text()='Refer a Friend']"));
        rfButton.click();
        Thread.sleep(   10000);
    }

    @Then("The user successfully navigates back to the home page")
    public void the_user_successfully_navigates_back_to_the_home_page() {
        WebElement hpButton = driver.findElement(By.xpath("//button[@class='close']"));
        hpButton.click();
    }


//6thSEC
     @When("The user scrolls up to shop discover shop near you")
     public void the_user_scrolls_up_to_shop_discover_shop_near_you() {
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement discoverShopNearYouElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Discover Shops near You']")));
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].scrollIntoView(true);", discoverShopNearYouElement);
         System.out.println("Successfully scrolled up");
     }

    @And("The user clicks on the 1st shop")
    public void the_user_clicks_on_the_1st_shop() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement spButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='r__flex r__flex-20']//a[@href='/india/mumbai/saki-naka/meat-fish-shops/kainat-chicken-shop-260076']")));
        spButton.click();
        System.out.println("Successfully clicked on the 1st shop");
    }

    @And("The user successfully lands on the shop front")
    public void the_user_successfully_lands_on_the_shop_front() {
        System.out.println("Successfully landed on the shop front");
    }

    @Then("The user successfully navigates back to the home page")
    public void the_user_successfully_navigates_back_to_the_home_page() {
        WebDriver.Navigation nav = driver.navigate();
        nav.back();
        System.out.println("Successfully navigated back to the home page");
    }


//7th SEC
    @When("The user scrolls up to shop by categories")
    public void the_user_scrolls_up_to_shop_by_categories() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement discoverShopNearYouElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='shop by category']")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", discoverShopNearYouElement);
        System.out.println("Successfully scrolled up");
    }

    @And("The user clicks on the 1st category")
    public void the_user_clicks_on_the_1st_category() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement spButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='shops/c/groceries-38']//img[@alt='Grocery']")));
        spButton.click();
        System.out.println("successfully");
    }

    @And("The user successfully lands on the category page")
    public void the_user_successfully_lands_on_the_category_page() {
        System.out.println("successfully");
    }

    @Then("The user successfully navigates back to the home page")
    public void the_user_successfully_navigates_back_to_the_home_page() {
        WebDriver.Navigation nav = driver.navigate();
        nav.back();
        System.out.println("successfully");
    }


//8thSEC
    @When("The user scrolls up to banners section")
    public void the_user_scrolls_up_to_banners_section() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement discoverShopNearYouElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Smart Basket']")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", discoverShopNearYouElement);
        System.out.println("Successfully scrolled up");
    }

    @And("The user clicks on the 1st banner")
    public void the_user_clicks_on_the_1st_banner() throws InterruptedException {
        Thread.sleep(10000);
        WebElement spButton = driver.findElement(By.xpath("//div[@id='quickCheckout']//a[@href='/monthly-saman-list']/img[@alt='Smart Basket']"));
        spButton.click();
        System.out.println("successfully");
    }

    @And("The user successfully lands on the monthly saman page")
    public void the_user_successfully_lands_on_the_monthly_saman_page() {
        System.out.println("successfully");
    }

    @Then("The user successfully navigates back to the home page")
    public void the_user_successfully_navigates_back_to_the_home_page() throws InterruptedException {
        Thread.sleep(10000);
        WebDriver.Navigation nav = driver.navigate();
        nav.back();
        System.out.println("successfully");
    }


//9thSEC
    @When("The user scrolls up to Text content section")
    public void the_user_scrolls_up_to_text_content_section() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement discoverShopNearYouElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[.='LoveLocal - the one-stop shop for your local daily essentials']")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", discoverShopNearYouElement);
        System.out.println("Successfully scrolled up");

    }


}