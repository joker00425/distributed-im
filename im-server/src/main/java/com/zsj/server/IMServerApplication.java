package com.zsj.server;


import com.zsj.server.registry.RegistryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class IMServerApplication implements CommandLineRunner {

    @Resource
    RegistryService registryService;
    public static void main(String[] args) {

        SpringApplication.run(IMServerApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        registryService.registry();
    }
}
