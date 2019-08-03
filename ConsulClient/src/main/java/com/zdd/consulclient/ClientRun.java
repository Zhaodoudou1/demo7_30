package com.zdd.consulclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ClientRun {
    public static void main(String[] args) {
        SpringApplication.run(ClientRun.class,args);
    }

    @RequestMapping("clientHealth")
    public String clientHealth(){
        System.out.println("clientHealth");
        return "ok";
    }
}
