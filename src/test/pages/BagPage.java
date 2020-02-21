package test.pages;

import ta.annotations.elements.Element;
import ta.annotations.elements.IOSBy;
import ta.entities.elements.PageElement;

public class BagPage {

    @IOSBy(name = "edit") // Different behaviour from Android
    @Element(desc = "Bag title", xpath = "//*[@text='Shopping Bag']")
    public static PageElement BAG_TITLE;

    @IOSBy(name = "titleLabelAccessibilityId")
    @Element(desc = "Bag item", id = "bag_item_title_text_view")
    public static PageElement BAG_ITEM;

    @IOSBy(name = "pay securely")
    @Element(desc = "Checkout", id = "activity_modular_bag_checkout_button")
    public static PageElement CHECKOUT_BUTTON;

    public static boolean isPageVisible() {
        return BAG_TITLE.isPresent();
    }

}
