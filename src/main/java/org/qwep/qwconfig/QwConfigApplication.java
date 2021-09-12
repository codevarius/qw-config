package org.qwep.qwconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class QwConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(QwConfigApplication.class, args);
    }

}
