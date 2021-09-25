package es.viferpar.microservices.helloworldservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "hello.world")
public class HelloWorldConfig {

  @Getter
  @Setter
  private String greeting = "Good morning";

}
