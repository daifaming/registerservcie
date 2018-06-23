package com.example.demo;

import com.netflix.discovery.shared.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoApplication
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder(Application.class).web(true).run(args);
    }
}
