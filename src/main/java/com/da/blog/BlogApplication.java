package com.da.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * com.da.blog.Application.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 */
@SpringBootApplication
@EnableScheduling
public class BlogApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class,args);
    }
}
