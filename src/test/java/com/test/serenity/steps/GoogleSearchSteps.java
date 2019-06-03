package com.test.serenity.steps;

import com.test.serenity.GoogleResultsPage;
import com.test.serenity.GoogleSearchPage;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.util.List;

public class GoogleSearchSteps extends UIInteractionSteps {

  GoogleSearchPage searchPage;
  GoogleResultsPage resultsPage;

  @Step
  public void openGoogleSearchPage() {
    searchPage.open();
  }

  @Step
  public void searchFor(String searchRequest) {
    resultsPage = searchPage.searchFor(searchRequest);
  }

  @Step
  public void verifyResult(String searchResult) {
    List<String> results = resultsPage.getResultsList();
    Assert.assertTrue(results.contains(searchResult));
  }
}
