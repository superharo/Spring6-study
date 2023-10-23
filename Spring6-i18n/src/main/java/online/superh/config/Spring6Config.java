package online.superh.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-23 11:58
 */
@Configuration
@ComponentScan("online.superh")
public class Spring6Config {

    /**
     * 国际化 配置
     *
     *  ResourceBundleMessageSource
     *
     * 这个是基于Java的ResourceBundle基础类实现，允许仅通过资源名加载国际化资源
     *
     * ReloadableResourceBundleMessageSource
     *
     * 这个功能和第一个类的功能类似，多了定时刷新功能，允许在不重启系统的情况下，更新资源的信息
     *
     * StaticMessageSource
     *
     * 它允许通过编程的方式提供国际化信息，可以通过这个来实现db中存储国际化信息的功能。
     *
     */
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:hello");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}
