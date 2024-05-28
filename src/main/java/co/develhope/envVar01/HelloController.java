package co.develhope.envVar01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Environment environment;

    @GetMapping("/hello")
    public String greeting() {
        String devName = environment.getProperty("devName");
        String authCode = environment.getProperty("authCode");
        return "Hi " + devName + ", your authCode is : " + authCode;
    }
}

