package com.gosky.sf.testinterface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lq
 * @date 2019/12/7 3:29 上午
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello World";
    }
}
