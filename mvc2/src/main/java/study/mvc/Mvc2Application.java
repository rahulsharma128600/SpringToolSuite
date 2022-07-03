package study.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan("cdac.iet.controller") // To provide packages for which we want to access @controller in different class in different packages..for multiple packages use -> ({"",""})
@ImportResource("classpath:beans.xml") // To provide bean path of xml..for multiple beans.xml use -> ({"classpath:","classpath:"})
public class Mvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Mvc2Application.class, args);
	}

}
