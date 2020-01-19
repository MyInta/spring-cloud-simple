package cn.ssijri.springcloud.controller;

import cn.ssijri.springcloud.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author inta
 * @date 2020/1/12
 * @describe customer是顾客的意思，一般网上用consumer消费者表示
 */
@RestController
public class CustomerController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable(value = "name") String name) {
        return helloRemote.index(name);
    }

}
