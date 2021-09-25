package es.viferpar.microservices.helloworldservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import es.viferpar.microservices.helloworldservice.model.HelloWorld;

@FeignClient(name = "complex-answer")
public interface ComplexAnswerProxy {

  @GetMapping("/complex-answer")
  public HelloWorld retrieveComplexAnswer();

}
