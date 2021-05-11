package ru.alishev.springcourse.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/firstt") // указывает на необходимость данного префикса в строке урл
public class FirstController {

   @GetMapping("/hello") // после набора в строке урл /hello
    public String helloPage() {
        return "/first/hello"; // вызовется страница  WEB-INF/views/first/hello.html
    }

    @GetMapping("/goodbuy")
    public String goodbuyPage() {
       return "/first/goodbuy";
    }
}
