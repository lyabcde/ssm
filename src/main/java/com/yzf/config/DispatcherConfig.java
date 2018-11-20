package com.yzf.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.context.annotation.ComponentScan.Filter;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.yzf.controller","com.yzf.config"},includeFilters = {@Filter(type= FilterType.ANNOTATION,classes={Controller.class}),
        @Filter(type=FilterType.ASSIGNABLE_TYPE,classes={PropertyConfig.class})},useDefaultFilters = false)
public class DispatcherConfig {

    @Autowired
    private  PropertyConfig propertyConfig;

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix(propertyConfig.getWebViewPrefix());
        internalResourceViewResolver.setSuffix(propertyConfig.getWebViewSuffix());
        return internalResourceViewResolver;
    }
}
