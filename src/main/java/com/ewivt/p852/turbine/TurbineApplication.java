package com.ewivt.p852.turbine;

import com.netflix.turbine.init.TurbineInit;
import com.netflix.turbine.streaming.servlet.TurbineStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean servletRegistrationBeanTurbineStreamServlet() {
		TurbineStreamServlet turbineStreamServlet = new TurbineStreamServlet();
		TurbineInit.init();
		return new ServletRegistrationBean(turbineStreamServlet, "/turbine.stream");
	}
}
