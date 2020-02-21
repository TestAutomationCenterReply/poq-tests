package test.pages;

import ta.annotations.elements.Element;
import ta.entities.elements.PageElement;

public class HomePage {

    @Element(desc = "Home swipe layout", id = "fragment_home_swipe_refresh_layout")
    private static PageElement HOME_SWIPE_LAYOUT;

    public static boolean isPageVisible() {
        return HOME_SWIPE_LAYOUT.isVisible();
    }

}
