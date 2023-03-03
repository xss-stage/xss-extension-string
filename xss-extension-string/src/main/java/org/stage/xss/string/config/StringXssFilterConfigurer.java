package org.stage.xss.string.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.stage.xss.core.spi.XssFilter;
import org.stage.xss.string.StringXssFilter;

@Configuration
public class StringXssFilterConfigurer{

    @Bean
    @Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
    public XssFilter stringXssFilter(){
        return new StringXssFilter();
    }

}
