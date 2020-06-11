package org.example.schoology.pages;

import org.openqa.selenium.WebDriver;

import java.util.Map;

public class EditGroupPopup extends AbstractGroupPopup {

    public EditGroupPopup(WebDriver driver) {
        super(driver);
    }

    public Groups edit(Map<String, String> groupMap){
        fill(groupMap);
        submitButton.click();
        return new Groups(driver);
    }
}