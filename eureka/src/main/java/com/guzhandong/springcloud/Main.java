package com.guzhandong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author guzhandong
 * @CREATE 2017-10-24 上午11:32
 */

@SpringBootApplication
@EnableEurekaServer
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
