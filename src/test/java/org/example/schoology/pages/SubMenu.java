package org.example.schoology.pages;

import org.example.AbstractPage;
import org.openqa.selenium.By;

public class SubMenu extends AbstractPage {

    public void clickViewListLink(final String menu) {
        driver.findElement(By.cssSelector(String.format("a[href='/%s']", menu.toLowerCase()))).click();
    }

}
