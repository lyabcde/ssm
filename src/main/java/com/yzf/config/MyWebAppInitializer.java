package com.yzf.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration.Dynamic;


/**
 * 初始化servlet WebApplicationContext 相关
 *
 * @author chen.nie
 * @date 2017/12/28
 **/
public class MyWebAppInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) {

        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
        ctx.setServletContext(servletContext);

        Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
