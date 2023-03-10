package org.example.hibernate.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@PropertySource("classpath:config.properties")
@ComponentScan(basePackages = "org.example.hibernate")
public class AppConfig {

}
