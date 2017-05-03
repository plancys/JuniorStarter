package pl.server.spring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public String helloWorld() {
        return "Hello World";
    }
}
