package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StorageServiceSystemApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(StorageServiceSystemApplication.class, args);
		
		StorageService storage1 = context.getBean(StorageService.class);
		storage1.storeFile("app.txt");
		
		StorageService local1 = context.getBean("localStorage",StorageService.class);
		local1.storeFile("file1.txt");
		StorageService local2 = context.getBean("localStorage",StorageService.class);
		local2.storeFile("file2.txt");
		
	}
}
