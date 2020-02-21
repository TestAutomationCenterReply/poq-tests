package test.pages;

import ta.annotations.elements.Element;
import ta.annotations.elements.IOSBy;
import ta.entities.elements.PageElement;

public class ProductPage {

    @IOSBy(name = "add to bag")
    @Element(desc = "Add to bag button", xpath = "//android.widget.Button[@text='ADD TO BAG']")
    private static PageElement ADD_TO_BAG;

    @IOSBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell")
    @Element(desc = "First size option", xpath = "//androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.TextView")
    private static PageElement FIRST_SIZE_OPTION;

    @Element(desc = "Allow notification button", name = "Allow")
    private static PageElement ALLOW_NOTIFICATIONS;

    @IOSBy(name = "Product_Detail")
    @Element(desc = "Product detail", id = "product_info_section_title_text_view")
    private static PageElement PRODUCT_DETAILS;

    public static boolean isPageVisible() {
        return PRODUCT_DETAILS.isVisible();
    }

}
