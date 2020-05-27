package org.example.schoology.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateCourse {

	private WebDriver driver;

	@FindBy(css = "#edit-course-name")
	private WebElement courseNameTextField;

	@FindBy(css = "#edit-section-name-1")
	private WebElement sectionNameTextField;

	@FindBy(css = "#edit-subject-area")
	private WebElement subjectAreaSelectField;

	@FindBy(css = "#edit-grade-level-range-start")
	private WebElement levelSelectField;

	@FindBy(css = "#edit-submit")
	private WebElement createButton;

	public CreateCourse(WebDriver driver) {
		this.driver = driver;
	}

	public void createCourse(String courseName, String sectionName, String subject, String level){
		courseNameTextField.sendKeys(courseName);
		sectionNameTextField.clear();
		courseNameTextField.sendKeys(sectionName);
		Select subjectArea = new Select(subjectAreaSelectField);
		subjectArea.selectByVisibleText(subject);
		Select levelSelect = new Select(levelSelectField);
		levelSelect.selectByVisibleText(level);
		createButton.click();
	}

}
