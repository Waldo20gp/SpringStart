package com.curso.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource(value= "classpath:values.properties",encoding = "utf-8"),
})
public class ValuesConfig {

}
