package com.acme.springboot.hellokubernetes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
class HelloKubernetesController {

   @GetMapping("/hello-kubernetes")
   String helloKubernetes() {
      return "Hello Kubernetes!";
   }
}
