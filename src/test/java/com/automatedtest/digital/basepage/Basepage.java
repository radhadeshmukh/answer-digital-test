package com.automatedtest.digital.basepage;

import org.openqa.selenium.WebDriver;
import com.automatedtest.digital.infrastructure.driver.Setup;
import com.automatedtest.digital.infrastructure.driver.Wait;



public class Basepage {

    protected WebDriver driver;
    protected Wait wait;

    public Basepage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
