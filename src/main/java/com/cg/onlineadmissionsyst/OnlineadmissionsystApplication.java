package com.cg.onlineadmissionsyst;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.onlineadmissionsyst.contoller.AddressController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2
@SpringBootApplication
public class OnlineadmissionsystApplication {
	org.apache.logging.log4j.Logger logger=LogManager.getLogger();
	public static void main(String[] args) {
		SpringApplication.run(OnlineadmissionsystApplication.class, args);
	}

	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
			    .paths(PathSelectors.any())
				.build();
	}
	/*@Bean
	CommandLineRunner cmdLineRunner(AddressController ar) {
	return args->
	{
		logger.info(ar.getAddressById(2));
		
	};
 }*/
}
