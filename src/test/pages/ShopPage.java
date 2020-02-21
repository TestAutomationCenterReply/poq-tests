package test.pages;

import org.openqa.selenium.WebElement;
import ta.annotations.elements.Element;
import ta.annotations.elements.IOSBy;
import ta.entities.elements.PageElement;
import ta.steps.MobileSteps;

import java.util.ArrayList;
import java.util.List;

public class ShopPage {

    @Element(desc = "Desired shop element", xpath = "(//*[@name='plpCellTitleLabel'])[7]")
    private static PageElement DESIRED_ITEM;

    @IOSBy(name = "plpCellTitleLabel")
    @Element(desc = "Shop element", id = "product_item_view_title")
    private static PageElement ITEMS;

    /**
     * Index goes from 1 to N
      * @param index Index from 1 to N
     * @return True if the element has been found and clicked
     */
    public static boolean clickItemByIndex(int index) {
        List<String> foundElements = new ArrayList<>();

        while (true) {
            List<WebElement> elems = PageElement.getPageElementHelper().elementsToBePresent(ITEMS.getBy(), ITEMS.getDescription());
            if (elems == null || elems.isEmpty()) {
                return false; // No elements found
            }

            int sizeBefore = foundElements.size();

            for (WebElement elem : elems) {
                String name = elem.getText();
                if (name.trim().equals("")) continue;
                if (!elem.isDisplayed()) continue;
                if (!foundElements.contains(name)) {
                    foundElements.add(name);
                    if (foundElements.size() == index) {
                        return PageElement.getPageElementHelper().ClickElement(elem);
                    }
                }
            }

            if (sizeBefore == foundElements.size()) {
                return false; // No new elements
            }

            MobileSteps.scrollForTimes("DOWN", 2);
        }
    }

    public static boolean isPageVisible() {
        return ITEMS.isVisible();
    }

}
