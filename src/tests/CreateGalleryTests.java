package tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateGalleryTests extends TestBase {
	
	@BeforeMethod
	public void createGallery() throws InterruptedException {
		driver.navigate().to("https://gallery-app.vivifyideas.com/");
		Thread.sleep(3000);
	}
	@Test (priority = 0)
	public void createMyGallery() throws InterruptedException {
		validLogIn();
		mainPage.clickOnCreateGalleryBtn();
		String title = excelReader.getCellData("CreateGallery", 1, 1);
		String descriptions = excelReader.getCellData("CreateGallery", 2, 1);
		String images = excelReader.getCellData("CreateGallery", 3, 1);
		createGalleryPage.titleInsert(title);
		createGalleryPage.descriptionsInsert(descriptions);
		createGalleryPage.imagesInsert(images);
		createGalleryPage.submitClick();
		
		Assert.assertEquals(true, mainPage.getLogOut().isDisplayed());

		Thread.sleep(3000);
	}

	@AfterMethod
	public void afterTest() throws InterruptedException {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
}
