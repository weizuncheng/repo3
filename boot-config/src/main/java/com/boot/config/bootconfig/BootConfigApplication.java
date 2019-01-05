package com.boot.config.bootconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BootConfigApplication {

    public static void main(String[] args) {
      ConfigurableApplicationContext     context = SpringApplication.run(BootConfigApplication.class, args);
        Environment env=    context.getEnvironment();
            String   ip  =  env.getProperty("local.ip.addr");
        System.out.println(ip);
        context.close();
    }

}

