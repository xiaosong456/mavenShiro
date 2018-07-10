package com.lxsoft.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Test
 *
 * @author lxs
 * @version v1.0.0
 */
@Controller
@RequestMapping("test")
public class Test {

    @RequestMapping("/test")
    @ResponseBody
    public String testSSM(){
        return "Hello world";
    }
}
