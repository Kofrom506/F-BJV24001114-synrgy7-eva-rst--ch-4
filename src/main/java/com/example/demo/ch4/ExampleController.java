package com.example.demo.ch4;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hello")
public class ExampleController {
    @GetMapping(value = "/")
    public String hello(){
        return "hello word";
    }

    @GetMapping(value = "/{yourname}")
    public String yourname(@PathVariable String yourname){
        return yourname;
    }


}