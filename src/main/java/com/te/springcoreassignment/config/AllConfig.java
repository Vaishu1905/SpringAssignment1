package com.te.springcoreassignment.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AnimalConfig.class,PetConfig.class})
public class AllConfig {

}
