package test.steps;

import cucumber.api.java.en.And;
import test.pages.ShopPage;

import static org.testng.Assert.assertTrue;

public class NavigationSteps {

    @And("I put a breakpoint")
    public static void breakpoint() {
        System.out.println("Break!");
    }

    @And("I click the {int} item in the shop")
    public static void clickShopItemByIndex(int index) {
        assertTrue(ShopPage.clickItemByIndex(index), "Cannot click element by index");
    }

}
