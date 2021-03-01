package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class MainPage {
		
		WebDriver driver;
		WebElement logInBtn;
		WebElement createGalleryBtn;
		WebElement logOut;

		public MainPage(WebDriver driver) {
			super();
			this.driver = driver;
		}
		public WebElement getLogOut() {
			return driver.findElement(By.className("nav-buttons"));
		}
		public WebElement getLogInBtn() {
			return driver.findElement(By.className("router-link-active"));
		}
		public WebElement getCreateGalleryBtn() {
			return driver.findElement(By.className("nav-buttons"));
		}
		public void clickOnLogInBtn() {
			getLogInBtn().click();
		}
		public void clickOnCreateGalleryBtn() {
			getCreateGalleryBtn().click();
		}
		public void clickOnLogOut() {
			getLogOut().click();
		}
	}

