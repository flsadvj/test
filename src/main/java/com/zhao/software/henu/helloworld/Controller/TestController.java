package com.zhao.software.henu.helloworld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping("/data")
    @ResponseBody
    public String getData(){
        System.out.println("输出data");
        return "HelloWorld";
    }

}
