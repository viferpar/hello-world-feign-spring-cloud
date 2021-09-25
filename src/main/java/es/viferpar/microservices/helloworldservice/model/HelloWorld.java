package es.viferpar.microservices.helloworldservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class HelloWorld {

  private String greeting;

  private String firstName;

  private String lastName;

}
