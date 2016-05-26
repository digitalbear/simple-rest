package digitalbear.io.controller;

import junit.framework.TestCase;


public class PolicyDetailStubTest extends TestCase {

    public void testPolicyNumberIsNotNull() throws Exception {
        assertTrue("Policy Number is empty",
                PolicyDetailStub.get(1).getPolicyNo() != null && !PolicyDetailStub.get(1).getPolicyNo().isEmpty());
    }
    public void testTitleIsNotNull() throws Exception {
        assertTrue("Title is empty",
                PolicyDetailStub.get(1).getTitle() != null && !PolicyDetailStub.get(1).getTitle().isEmpty());
    }
    public void testForenameIsNotNull() throws Exception {
        assertTrue("Forename is empty",
                PolicyDetailStub.get(1).getForename() != null && !PolicyDetailStub.get(1).getForename().isEmpty());
    }
    public void testSurnameIsNotNull() throws Exception {
        assertTrue("Surname is empty",
                PolicyDetailStub.get(1).getSurname() != null && !PolicyDetailStub.get(1).getSurname().isEmpty());
    }

}