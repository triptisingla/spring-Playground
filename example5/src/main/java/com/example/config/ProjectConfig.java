package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/**
 * @ComponentScan("com.example.beans") : This annotation is used to
 *                                       automatically pick up all the
 *                                       spring components from the
 *                                       beans package and register them
 *                                       in the spring's application
 *                                       context.
 */
@ComponentScan("com.example.beans")
public class ProjectConfig {

}
