package com.zdd.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConsulServer {
    public static void main(String[] args) {
        SpringApplication.run(ConsulServer.class,args);
    }
    @RequestMapping("serverHealth")
    public String serverHealth(){

        System.out.println("服务端健康检查");
        return "ok";
    }
}
