package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	WebDriver driver;
	WebElement eMailField;
	WebElement passwordField;
	WebElement submitBtn;

	public LogInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("password"));
	}

	public WebElement geteMailField() {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getSubmitBtn() {
		return driver.findElement(By.className("btn-custom"));
	}
	
	public void eMailInsert(String eMail) {
		geteMailField().clear();
		geteMailField().sendKeys(eMail);
	}
	
	public void passwordInsert(String password) {
		getPasswordField().clear();
		getPasswordField().sendKeys(password);
	}
	
    public void submitClick() {
    	getSubmitBtn().click();
    }
}
