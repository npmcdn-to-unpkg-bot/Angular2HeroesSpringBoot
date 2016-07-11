package com.hero;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by akhanal on 7/5/16.
 */
@RestController
@RequestMapping(value = "/api")
public class APIController {
    @RequestMapping(value = "/hello")
    public @ResponseBody HelloResponse sayHello() {
        return new HelloResponse("Hello");
    }
}
