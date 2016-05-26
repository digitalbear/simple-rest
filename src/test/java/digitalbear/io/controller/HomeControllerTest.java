package digitalbear.io.controller;

import junit.framework.TestCase;

public class HomeControllerTest extends TestCase {

    public void testHomeControllerReturnsString() {
        assertEquals(new HomeController().home(), "This is a simple Rest app");
    }
}
