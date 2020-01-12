package cn.ssijri.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloud01EurekaSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud01EurekaSimpleApplication.class, args);
    }

}
