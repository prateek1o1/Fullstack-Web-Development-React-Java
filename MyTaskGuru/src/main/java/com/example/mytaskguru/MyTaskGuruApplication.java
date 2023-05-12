package com.example.mytaskguru;

import com.example.mytaskguru.services.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MyTaskGuruApplication {
	private static final Logger logger= LogManager.getLogger(MyTaskGuruApplication.class);
	@Configuration
	@EnableWebMvc
	public class webConfig implements WebMvcConfigurer {
		@Override
		public void addCorsMappings(CorsRegistry registry){
			registry.addMapping("/**");
		}
	}
	@Bean
	BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}

	public static void main(String[] args) {
		logger.info("This is an info log message");
		SpringApplication.run(MyTaskGuruApplication.class, args);
	}

}
