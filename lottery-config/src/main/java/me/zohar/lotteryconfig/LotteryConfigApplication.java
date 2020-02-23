package me.zohar.lotteryconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.MutablePropertySources;

@SpringBootApplication
@EnableConfigServer
public class LotteryConfigApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(LotteryConfigApplication.class, args);
		MutablePropertySources mutablePropertySources = app.getEnvironment().getPropertySources();
		return;
	}

}
