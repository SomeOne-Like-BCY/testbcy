package com.bcy.testbcy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class helloword {

    @RequestMapping("/hello")
    public String toString() {
        return "budfadsfasdf";
    }
}
