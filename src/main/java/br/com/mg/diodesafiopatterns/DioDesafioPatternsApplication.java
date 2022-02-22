package br.com.mg.diodesafiopatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DioDesafioPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioDesafioPatternsApplication.class, args);
	}

}
