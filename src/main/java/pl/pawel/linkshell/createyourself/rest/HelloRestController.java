package pl.pawel.linkshell.createyourself.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
    @RequestMapping(value="/echo")
    public String echo(@RequestParam(value="request", defaultValue="Hello!") String request) {
        return request;
    }
}
