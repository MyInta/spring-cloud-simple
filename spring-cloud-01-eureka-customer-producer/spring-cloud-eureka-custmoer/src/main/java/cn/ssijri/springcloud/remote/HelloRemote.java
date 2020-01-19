package cn.ssijri.springcloud.remote;

import cn.ssijri.springcloud.remote.impl.HelloRemoteImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author inta
 * @date 2020/1/12
 * @describe
 */
@FeignClient(name = "spring-cloud-producer", fallbackFactory = HelloRemoteImpl.class)
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String index(@RequestParam(value = "name") String name);
}
