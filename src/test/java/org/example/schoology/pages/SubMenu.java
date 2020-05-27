package org.example.schoology.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubMenu {

	private WebDriver driver;

	@FindBy(css = "a[href='/courses']")
	private WebElement coursesLink;

	public SubMenu(WebDriver driver) {
		this.driver = driver;
	}

	public Courses clickMyCoursesLink() {
		coursesLink.click();
		return new Courses(driver);
	}

}
