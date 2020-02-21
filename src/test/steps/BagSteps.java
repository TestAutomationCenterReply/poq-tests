package test.steps;

import cucumber.api.java.en.Then;
import test.pages.BagPage;

import static org.testng.Assert.assertTrue;

public class BagSteps {

    @Then("At least an element should be in the bag")
    public static void checkElemenInBag() {
        assertTrue(BagPage.BAG_ITEM.isVisible(), "No item is present in the bag");
    }

}
