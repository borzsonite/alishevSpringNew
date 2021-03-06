package ru.alishev.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//@RequestMapping("/first") // указывает на необходимость данного префикса в строке урл
public class FirstController {

   @GetMapping("/hello") // после набора в строке урл /hello
    public String helloPage(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "surname", required = false) String surname) {

       System.out.println("Hello " + name + " " + surname);
        return "first/hello"; // вызовется страница  WEB-INF/views/first/hello.html
    }

    @GetMapping("/goodbuy")
    public String goodbuyPage() {
       return "first/goodbuy";
    }
}
