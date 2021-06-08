package org.example.schoology.pages;

import org.openqa.selenium.By;

import org.example.core.ui.AbstractPage;

public class SubMenu extends AbstractPage {

    public void clickViewListLink(final String menu) {
        action.click(By.cssSelector(String.format("a[href='/%s']", menu.toLowerCase())));
    }
    public void searchString(final String stringToSearch, String search) {
        action.jsClick(driver.findElement(By.xpath(String.format("//input[@placeholder='%s']", search))));
        action.setValue(driver.findElement(By.xpath(String.format("//input[@placeholder='%s']", search))), stringToSearch);
        action.click(driver.findElement(By.xpath(String.format("//input[@value='%s']//parent::label//parent::li/following-sibling::li", stringToSearch))));
    }

}
