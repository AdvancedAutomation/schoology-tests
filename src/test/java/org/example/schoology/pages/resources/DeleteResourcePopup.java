package org.example.schoology.pages.resources;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.example.core.Environment;
import org.example.core.ui.AbstractPage;
import org.example.schoology.Resources;

public class DeleteResourcePopup extends AbstractPage {

    private final ResourceBundle bundle;

    public DeleteResourcePopup() {
        super();
        bundle = ResourceBundle.getBundle(Resources.I18N_RESOURCE, Environment.getInstance().getLocale());
    }

    public void clickDeleteButton() {
        final String keyResources = "resource.button.delete";
        WebElement deleteButton = driver.findElement(By.cssSelector(String.format("[value='%s']",
                bundle.getString(keyResources))));
        action.click(deleteButton);
    }
}
