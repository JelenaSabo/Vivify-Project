package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CreateGalleryPage;
import pages.LogInPage;
import pages.MainPage;

public class TestBase {
	
	MainPage mainPage;
	WebDriver driver;
	ExcelReader excelReader;
	LogInPage logInPage;
	CreateGalleryPage createGalleryPage;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.mainPage = new MainPage(driver);
		this.excelReader = new ExcelReader("data/TestCasesVivify.xlsx");
		this.logInPage = new LogInPage(driver);
		this.createGalleryPage = new CreateGalleryPage(driver);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void afterClass() throws IOException {
		driver.close();
		excelReader.fis.close();
		excelReader.wb.close();
		
	}
	public void validLogIn() {
		mainPage.clickOnLogInBtn();
		String eMail = excelReader.getCellData("LogIn", 1, 1);
		String password = excelReader.getCellData("LogIn", 2, 1);
		logInPage.eMailInsert(eMail);
		logInPage.passwordInsert(password);
		logInPage.submitClick();
		
	}
	}
	
