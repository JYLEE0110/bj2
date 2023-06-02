package org.zerock.bj2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@MapperScan(basePackages = ("org.zerock.bj2.**.mappers")) // @Mapper를 안써도 된다.

public class Bj2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bj2Application.class, args);
	}

}
