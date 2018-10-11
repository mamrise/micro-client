package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * The type Application.
 *
 * @author Jack
 * @date 2018 /9/6 下午4:18
 */
@SpringCloudApplication
@EnableEurekaClient
public class Application {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
