package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTests extends TestBase {

	@BeforeMethod
	public void logIn() throws InterruptedException {
		driver.navigate().to("https://gallery-app.vivifyideas.com/");
		Thread.sleep(3000);
	}

	@Test(priority = 0)
	public void validCredentialsLogIn() throws InterruptedException {
		mainPage.clickOnLogInBtn();
		String eMail = excelReader.getCellData("LogIn", 1, 1);
		String password = excelReader.getCellData("LogIn", 2, 1);
		logInPage.eMailInsert(eMail);
		logInPage.passwordInsert(password);
		logInPage.submitClick();
		
		Assert.assertEquals(true, mainPage.getLogOut().isDisplayed());

		Thread.sleep(3000);

	}
	@Test(priority = 5)
	public void signOut() throws InterruptedException {
		validCredentialsLogIn();
		mainPage.clickOnLogOut();
		mainPage.getLogInBtn().isDisplayed();
	}
	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
