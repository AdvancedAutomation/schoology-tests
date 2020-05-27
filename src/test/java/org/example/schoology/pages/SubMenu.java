package org.example.schoology.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubMenu {

	private WebDriver driver;

	@FindBy(css = "a[href='/courses']")
	private WebElement myCoursesLink;

	public SubMenu(WebDriver driver) {
		this.driver = driver;
	}

	public Courses clickMyCoursesLink() {
		myCoursesLink.click();
		return new Courses(driver);
	}

}
