package org.steps;

import org.pages.Page;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps {
    Page page;

    @Step
    public void enters(String keyword) {
    }

    @Step
    public void startsSearch() {
    }

    @Step
    public void shouldSeeDefinition(String definition) {
    }

    @Step
    public void isTheHomePage() {
    }

    @Step
    public void looksFor(String term) {
    }
}