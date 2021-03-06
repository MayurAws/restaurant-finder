package net.peak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "net.peak.repository")
@EnableSwagger2
@EnableTransactionManagement
@EnableSpringDataWebSupport
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
