package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponesDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponesDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponesDto(name, amount);
    }

}
