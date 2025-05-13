package com.adeytech.adey_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class AdeySecurityApplication {
	static String maxCompany  =  "";
	static  Integer maxValue = 0;;
	public static void main(String[] args) {

		Map<String, Integer> stockPrice = new HashMap<>();

		stockPrice.put("Oracle", 56);
		stockPrice.put("Fiserv", 117);
		stockPrice.put("BMW", 73);
		stockPrice.put("Microsoft", 213);
		stockPrice.put("Google", 421);
		stockPrice.put("AdeyTech", 890);



		stockPrice.forEach((a, b) -> {
			if(b> maxValue){
				maxValue = b;
				maxCompany = a;
			}
		});

		System.out.println(stockPrice.entrySet().stream().max((ar, val) -> ar.getValue()).get().getKey());

		System.out.print(maxCompany);
		SpringApplication.run(AdeySecurityApplication.class, args);
	}

}
