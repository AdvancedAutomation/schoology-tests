package org.example.core.ui;

import org.openqa.selenium.WebDriver;

public class SharedDriver {

    public SharedDriver(){
        if(DriverFactory.getDriver() == null){
            WebDriver driver = BrowserFactory.getBrowser("chrome");
            DriverFactory.addDriver(driver);
        }

    }
}