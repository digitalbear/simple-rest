package digitalbear.io.controller;

import digitalbear.io.model.PolicyDetail;

import java.util.HashMap;
import java.util.Map;

public class PolicyDetailStub {
    private static Map<Integer, PolicyDetail> policies = new HashMap<Integer, PolicyDetail>();

    static {
        PolicyDetail a = new PolicyDetail("H12345678", "MR", "A", "Test");
        policies.put(1, a);
        PolicyDetail b = new PolicyDetail("H22345678", "MR", "B", "Test");
        policies.put(2, b);
        PolicyDetail c = new PolicyDetail("H32345678", "MR", "B", "Test");
        policies.put(3, c);
    }

    public static PolicyDetail get(int id) {
        return policies.get(id);
    }
}
