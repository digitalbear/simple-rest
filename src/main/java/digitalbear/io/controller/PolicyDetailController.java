package digitalbear.io.controller;

import digitalbear.io.model.PolicyDetail;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class PolicyDetailController {

    @RequestMapping(value = "policyDetail/{id}", method = RequestMethod.GET)
    public PolicyDetail get(@PathVariable int id) {
        return PolicyDetailStub.get(id);
    }
}
