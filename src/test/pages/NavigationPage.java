package test.pages;

import ta.annotations.elements.Element;
import ta.annotations.elements.IOSBy;
import ta.entities.elements.PageElement;

public class NavigationPage {

    @Element(desc = "Drawer button", xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private static PageElement HAMBURGER;

    @Element(desc = "Shop button", name = "shop") // This is an iOS selector
    private static PageElement SHOP;

    @IOSBy(name = "clearance")
    @Element(desc = "Clearance drawer option", xpath = "//android.widget.TextView[@text='Clearance']")
    private static PageElement CLEARANCE_OPTION;

    @IOSBy(xpath = "//XCUIElementTypeNavigationBar/XCUIElementTypeStaticText")
    @Element(desc = "Bag icon", id = "action_bag")
    private static PageElement BAG;

}
