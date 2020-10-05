package org.pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page extends PageObject {
    @FindBy(name = "")
    private WebElementFacade searchTerms;

    @FindBy(css = "")
    private WebElementFacade lookupButton;

    public void enterKeywords(String keyword) {
    }

    public void lookupTerms() {
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}