package digitalbear.io.controller;

import junit.framework.TestCase;

public class PolicyDetailControllerTest extends TestCase {

    public void testPolicyDetailControllerReturnsObject() {
        assertEquals(new PolicyDetailController().get(1), PolicyDetailStub.get(1));
    }

    public void testPolicyDetailControllerReturnsCorrectPolicyNumber() {
        assertEquals(new PolicyDetailController().get(1).getPolicyNo(), "H12345678");
    }
}