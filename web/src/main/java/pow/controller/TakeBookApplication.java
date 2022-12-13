package pow.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"pow.*"})
@EntityScan(basePackages = {"pow.*"})
@EnableJpaRepositories(basePackages = {"pow.*"})
public class TakeBookApplication extends SpringBootServletInitializer {

    @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TakeBookApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TakeBookApplication.class);
    }
}
