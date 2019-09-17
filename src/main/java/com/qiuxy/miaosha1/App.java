package com.qiuxy.miaosha1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController 便捷的annotation，itself annotated with @Controller and @ResponseBody. 
 *
 * @EnableAutoConfiguration. 
 * 		This annotation tells Spring Boot to “guess” how you will want to configure Spring, 
 * 		based on the jar dependencies that you have added. 
 * 		Since spring-boot-starter-web added Tomcat and Spring MVC, 
 * 		the auto-configuration will assume that you are developing a web application and 
 * 		setup Spring accordingly.
 * 		启动自动配置特性，springboot会根据依赖关系，猜测？？什么呢？会做什么呢？
 * 
 * @ComponentScan  
		 * If specific packages are not defined, 
		 * scanning will occur from the package of the class that declares this annotation. 
		 * 如果不指定扫描包位置，则默认从本包开始
 */
@RestController
@EnableAutoConfiguration
@ComponentScan
@EnableEurekaClient
public class App {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
    	
    	/**
    	 * Classes that can be used to bootstrap and launch a Spring application from a Java main method. 
    	 * By default class will perform the following steps to bootstrap your application: 

				1. Create an appropriate ApplicationContext instance (depending on your classpath) 
				2. Register a CommandLinePropertySource to expose command line arguments as Spring properties 
				3. Refresh the application context, loading all singleton beans 
				4. Trigger any CommandLineRunner beans 

    	 */
    	// the run method to tell SpringApplication which is the primary Spring component
    	// The args array is also passed through to expose any command-line arguments.
        SpringApplication.run(App.class, args);
    }

}
