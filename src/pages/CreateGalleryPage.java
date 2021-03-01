package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateGalleryPage {
	
	WebDriver driver;
	WebElement titleField;
	WebElement descriptionsField;
	WebElement imagesField;
	WebElement addImageBtn;
	WebElement submitBtn;
	WebElement cancelBtn;
	
	public CreateGalleryPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getTitleField() {
		return driver.findElement(By.id("title"));
	}

	public WebElement getDescriptionsField() {
		return driver.findElement(By.id("description"));
	}

	public WebElement getImagesField() {
		return driver.findElement(By.className("form-control"));
	}

	public WebElement getAddImageBtn() {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/form/div[3]/button"));
	}

	public WebElement getSubmitBtn() {
		return driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
	}

	public WebElement getCancelBtn() {
		return driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
	}
	
	
}
