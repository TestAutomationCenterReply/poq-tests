package test.pages;

import ta.annotations.elements.Element;
import ta.annotations.elements.IOSBy;
import ta.entities.elements.PageElement;

public class LoginPage {

    @IOSBy(name = "sign in")
    @Element(desc = "Sign in button", id = "content_block_login_view_sign_in_button")
    private static PageElement SIGN_IN_BUTTON;

    public static boolean isPageVisible() {
        return SIGN_IN_BUTTON.isVisible();
    }

}
