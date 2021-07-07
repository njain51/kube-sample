package com.ib.devops.kubesample.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {

  @RequestMapping("/welcome")
    @ResponseBody
    public String welcome1() {

      return "welcome to Spring Boot Application";
  }

}
