package com.egsw.sandbx;

import com.egsw.sandbx.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String HelloWorld(){
        return "HelloWorld";
    }

    @GetMapping(path = "/hello-bean")
    public HelloWorldBean HelloWorldBean(){
        return new HelloWorldBean("HelloWorld");
    }

    @GetMapping(path = "/hello-bean/{name}")
    public HelloWorldBean HelloWorldBeanId(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello, %s", name));
    }


}
