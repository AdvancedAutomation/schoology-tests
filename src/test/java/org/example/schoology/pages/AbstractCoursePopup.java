package org.example.schoology.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class AbstractCoursePopup {

    @FindBy(css = "#edit-course-name")
	private WebElement courseNameTextField;

    @FindBy(css = "#edit-section-name-1")
	private WebElement sectionNameTextField;

    @FindBy(css = "#edit-subject-area" )
	private WebElement subjectAreaDropDown;

    @FindBy(css = "#edit-grade-level-range-start")
	private WebElement levelDropDown;

    @FindBy(css = "#edit-submit")
	protected  WebElement submitButton;

	protected WebDriver driver;

    protected WebDriverWait wait;

    public AbstractCoursePopup(WebDriver driver){
        this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
    }

    public void fill(Map<String, String> courseMap){
		Map<String, Step> stepsMap = new HashMap<>();
		stepsMap.put("name", () -> setName(courseMap.get("name")));
		stepsMap.put("section", () ->setSection(courseMap.get("section")));
		stepsMap.put("area", () ->selectSubjectArea(courseMap.get("area")));
		stepsMap.put("level", () ->selectLevel(courseMap.get("level")));

		for(String keyField: courseMap.keySet()){
			stepsMap.get(keyField).execute();
		}
		//TODO
		// Web element is not removed but is added  a display  none
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".course-create-popup")));

		//tag element is removed
		//Loading
		//wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector(".course-create-popup"))));
	}

	private void setName(String name){
		WebElement nameField = courseNameTextField;
		nameField.clear();
		nameField.sendKeys(name);

		//courseNameTextField.sendKeys(name);
	}

	private void setSection(String section){
		WebElement sectionField = sectionNameTextField;
		sectionField.clear();
		sectionField.sendKeys(section);
	}

	private void selectSubjectArea(String area){
		Select subjectArea = new Select(subjectAreaDropDown);
		subjectArea.selectByVisibleText (area);
	}

	private void selectLevel(String level){
		Select levelField = new Select(levelDropDown);
		levelField.selectByVisibleText(level);
	}

}
