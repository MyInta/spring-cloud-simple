package cn.ssijri.springcloud.remote.impl;

import cn.ssijri.springcloud.remote.HelloRemote;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author inta
 * @date 2020/1/12
 * @describe 原先是打算给feign调用fallbackFactory属性使用的
 */
@Component
public class HelloRemoteImpl implements FallbackFactory<HelloRemote> {
    @Override
    public HelloRemote create(Throwable throwable) {
        return new HelloRemote() {
            @Override
            public String index(String name) {
                return "hello " + name + ",this message send failed,and we open the hytrix with fallback!";
            }
        };
    }
}
