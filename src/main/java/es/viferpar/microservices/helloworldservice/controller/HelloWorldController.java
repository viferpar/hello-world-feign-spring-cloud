package es.viferpar.microservices.helloworldservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import es.viferpar.microservices.helloworldservice.config.HelloWorldConfig;
import es.viferpar.microservices.helloworldservice.model.HelloWorld;
import es.viferpar.microservices.helloworldservice.proxy.ComplexAnswerProxy;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RestController
public class HelloWorldController {

  private final ComplexAnswerProxy complexAnswerProxy;

  private final Environment environment;

  private final HelloWorldConfig config;

  @GetMapping("/hello-world")
  public String retrieveGreeting() {

    final HelloWorld answer = complexAnswerProxy.retrieveComplexAnswer();

    final String host = environment.getProperty("HOSTNAME");

    final String port = environment.getProperty("local.server.port");

    return String.format("%s, %s %s from %s:%s", config.getGreeting(), answer.getFirstName(),
        answer.getLastName(), host, port);

  }

}
