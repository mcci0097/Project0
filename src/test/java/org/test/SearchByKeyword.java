package org.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.steps.EndUserSteps;

@RunWith(SerenityRunner.class)
public class SearchByKeyword {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps endUserSteps;

    @Issue("#Project-0")
    @Test
    public void searchByKeyword() {
    }

    @Test
    public void searchByKeyword2() {
    }
} 