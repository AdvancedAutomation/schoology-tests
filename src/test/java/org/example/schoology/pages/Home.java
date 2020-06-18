package org.example.schoology.pages;

import org.example.AbstractPage;
import org.example.schoology.pages.resources.Resources;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends AbstractPage {

	@FindBy(xpath = "//a[@href='/resources' and text()='Resources']")
	private WebElement resourceMenu;

	/**
	 * This only works for Courses and Groups
	 * Resources and More menu has another behavior.
	 * @param menuName
	 * @return
	 */
	public SubMenu clickMenu(String menuName) {
		driver.findElement(By.xpath(String.format("//span[text()='%s']/parent::button", menuName))).click();
		return new SubMenu();
	}

	public Resources clickResources() {
		resourceMenu.click();
		return new Resources();
	}
}
