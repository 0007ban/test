package com.hirit.research;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @EnableAutoConfiguration(@SpringBootApplication 안에 숨어있음)
 * 빈은 사실 두 단계로 나눠서 읽힘
 * 	1단계 : @ComponentScan
 * 	2단계 : @EnableAutoConfiguration
 * @ComponentScan : 속한 패키지 부터 하위만 스캔. 다른 패키지는 스캔하지 않음
 * 	@Component
 * 	@Configuration @Repository @Service @Controller @RestController
 * @EnableAutoConfiguration
 * 	spring.factories
 * 		org.springframework.boot.autoconfigure.EnableAutoConfiguration
 * @configuration
 * @ConditionalOnXxxxYyyyZzzz
 *
 */
@SpringBootApplication
public class ResearchApplication {

	public static void main(String[] args) {

		SpringApplication.run(ResearchApplication.class, args);
	}

}
