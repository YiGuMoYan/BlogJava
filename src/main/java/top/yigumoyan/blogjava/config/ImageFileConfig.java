package top.yigumoyan.blogjava.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ImageFileConfig implements WebMvcConfigurer {

    @Value("${BlogJava.domain}")
    private String domain;

    @Value("${BlogJava.prefix}")
    private String prefix;

    @Value("${BlogJava.file-path}")
    private String filePath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(prefix + "**").addResourceLocations("file:" + filePath);
    }
}
