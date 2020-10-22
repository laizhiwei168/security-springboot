package com.lzw.bootframe.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置jsp
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 视图解析器  弃掉是配置文件中配置了
    /*@Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver= new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setPrefix(".jsp");
        return viewResolver;
    }*/

    // 默认url根路径跳转到/login，此url为 spring security提供
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        
        registry.addViewController("/").setViewName("redirect:/login-view");

        registry.addViewController("/login-view").setViewName("/login");
    }
}
