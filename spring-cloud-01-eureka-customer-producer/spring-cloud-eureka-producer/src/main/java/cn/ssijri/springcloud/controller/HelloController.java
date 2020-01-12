package cn.ssijri.springcloud.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author inta
 * @date 2020/1/12
 * @describe
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello " + name + ", this is first message";
    }
}
