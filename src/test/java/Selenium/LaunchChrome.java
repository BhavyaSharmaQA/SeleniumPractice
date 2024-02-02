package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LaunchChrome {

	WebDriver driver;

	@BeforeTest
	public void BeforeTest() {
		System.out.println("Starting Chrome Browser ");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhavya\\Desktop\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

//	@BeforeClass
//	public void LaunchBrowser() {
//
//		System.out.println("Launching Nipun");
//	}

	@Test(enabled = false)
	public void TestAssert() {

		driver.manage().window().maximize();
		driver.get("https://sandbox.nipunbycsg.com/auth/login");
		String expectedTitle = "Nipun by CSG";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
		WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		WebElement signIn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

		userName.sendKeys("salesadmin@csgtech.in");
		password.sendKeys("User@123");
		signIn.click();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}

		String expectedTitle1 = "Admin | Dashboard |";
		String originalTitle1 = driver.getTitle();
		Assert.assertEquals(originalTitle1, expectedTitle1, "Titles of the website do not match");

		if (driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			driver.close();
		}

		System.out.println("Nipun Terminated");
	}


	@Test(enabled = false)
	public void TestAssert2() {
		System.out.println("Launching Nipun");
//	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Bhavya\\Desktop\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.nipunbycsg.com/auth/login");
		String expectedTitle = "Nipun by CSG";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
		WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		WebElement signIn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

		userName.sendKeys("salesadmin@csgtech.in");
		password.sendKeys("User@123");
		signIn.click();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}

		String expectedTitle1 = "Admin | Dashboard |";
		String originalTitle1 = driver.getTitle();
		Assert.assertEquals(originalTitle1, expectedTitle1, "Titles of the website do not match");

		WebElement logOut = driver.findElement(By.xpath("//span[text()=\"Logout\"]"));
		logOut.click();

		driver.close();
	}

	@Test(enabled = false)
	public void TestAssert3() {
		System.out.println("Launching Nipun");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.nipunbycsg.com/auth/login");
		String expectedTitle = "Nipun by CSG";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
		WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		WebElement signIn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

		userName.sendKeys("salesadmin@csgtech.in");
		password.sendKeys("User@123");
		signIn.click();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}

		String expectedTitle1 = "Admin | Dashboard |";
		String originalTitle1 = driver.getTitle();
		Assert.assertEquals(originalTitle1, expectedTitle1, "Titles of the website do not match");


		WebElement inventory = driver.findElement(By.xpath("//span[text()=\"Inventory\"]"));
		inventory.click();

		WebElement products = driver.findElement(By.xpath("//span[text()=\"Products\"]"));
		products.click();

		WebElement ProductMaster = driver.findElement(By.xpath("//h5[@class=\"text-dark font-weight-bold mt-2 mb-2 mr-5\"]"));
		ProductMaster.getText();
		String Text = ProductMaster.getText();
		Assert.assertEquals(Text, "Product Master", "Text of the Page Do not Match");

		driver.close();
	}

	@Test
	public void TestAssert4() throws InterruptedException {
		System.out.println("Launching Nipun");
//		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.nipunbycsg.com/auth/login");
		String expectedTitle = "Nipun by CSG";
		String originalTitle = driver.getTitle();
		Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
		WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		WebElement signIn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));

		userName.sendKeys("salesadmin@csgtech.in");
		password.sendKeys("User@123");
		signIn.click();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}

		String expectedTitle1 = "Admin | Dashboard |";
		String originalTitle1 = driver.getTitle();
		Assert.assertEquals(originalTitle1, expectedTitle1, "Titles of the website do not match");


		WebElement inventory = driver.findElement(By.xpath("//span[text()=\"Inventory\"]"));
		inventory.click();

		WebElement products = driver.findElement(By.xpath("//span[text()=\"Products\"]"));
		products.click();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}

		WebElement addNew = driver.findElement(By.xpath("//a[@class=\"btn btn-light-warning font-weight-bolder btn-sm mr-2\"]"));
		addNew.click();

		WebElement ProductAdd = driver.findElement(By.xpath("//h5[@class=\"text-dark font-weight-bold mt-2 mb-2 mr-5\"]"));
		ProductAdd.getText();
		String Text = ProductAdd.getText();
		Assert.assertEquals(Text, "Product Add", "Text of the Page Do not Match");


		Select productType = new Select(driver.findElement(By.xpath("//select [@name=\"product_type\"]")));
		productType.selectByVisibleText("Test Product Type");

		Thread.sleep(500);

		Select category = new Select(driver.findElement(By.xpath("//select [@name=\"category\"]")));
		category.selectByVisibleText("Test Category 1");

		Thread.sleep(500);

		Select subCategory = new Select(driver.findElement(By.xpath("//select [@name=\"sub_category\"]")));
		subCategory.selectByVisibleText("Test Sub Category 1");

		WebElement title = driver.findElement(By.xpath("//input[@name=\"title\"]"));
		title.sendKeys("Test Product C");

		WebElement hsn = driver.findElement(By.xpath("//input[@name=\"hsn\"]"));
		hsn.sendKeys("993543");

		WebElement gst = driver.findElement(By.xpath("//input[@name=\"gst\"]"));
		gst.sendKeys("0.16");

		WebElement make = driver.findElement(By.xpath("//input[@name=\"make\"]"));
		make.sendKeys("Test Make 3");

		Select enable = new Select(driver.findElement(By.xpath("//select[@id=\"id_enable_e_com\"]")));
		enable.selectByVisibleText("Yes");

		Select packing = new Select(driver.findElement(By.xpath("//select[@id=\"id_packing\"]")));
		packing.selectByVisibleText("Test Packing");

		Select unit = new Select(driver.findElement(By.xpath("//select[@id=\"id_unit\"]")));
		unit.selectByVisibleText("Test Unit 1");

		Select deliveryType = new Select(driver.findElement(By.xpath("//select[@id=\"id_delivery_type\"]")));
		deliveryType.selectByVisibleText("Normal");

		WebElement consumableBtn = driver.findElement(By.xpath("(//label[text()=\"Consumable\"]/..//span)[2]"));
		consumableBtn.click();

		Thread.sleep(1000);

		WebElement attributeManagmentBtn = driver.findElement(By.xpath("(//label[text()=\"Disable\"]/..//span)[2]"));
		attributeManagmentBtn.click();

		Thread.sleep(2000);

		JavascriptExecutor executor = (JavascriptExecutor)driver;

		WebElement select = driver.findElement(By.xpath("(//input[@class='select2-search__field'])[1]"));
		executor.executeScript("arguments[0].click();", select);
//		select.click();

		Thread.sleep(2000);

		WebElement color = driver.findElement(By.xpath("//li[text()=\"Color\"]"));
		executor.executeScript("arguments[0].click();", color);
//		color.click();

		Thread.sleep(2000);

//		WebElement select2 = driver.findElement(By.xpath("(//input[@class=\"select2-search__field\"])[2]"));
//		executor.executeScript("arguments[0].click();", select2);
////		select2.click();
//
//		Thread.sleep(1000);
//
//		WebElement black = driver.findElement(By.xpath("//li[@id=\"select2-kt_attribute_1-result-e6yo-294416324029\"]"));
//		executor.executeScript("arguments[0].click();", black);
////		black.click();
//		Thread.sleep(1000);
//
//		WebElement ContinueBtn = driver.findElement(By.xpath("//button[@class=\"main-btn\"]"));
//		ContinueBtn.click();



	}


//  @AfterClass
//  public void AfterGoogle()
//  {
//	  System.out.println("Google Terminated");
//  }
//
//
// @AfterTest
//  public void CloseBrowser()
//  {
//
//	System.out.println("Browser Terminated");
//
//
//  }

}

	
	


