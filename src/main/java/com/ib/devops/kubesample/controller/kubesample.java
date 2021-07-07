package com.ib.devops.kubesample.controller;

import com.ib.devops.kubesample.beans.helloworldbean;
import com.ib.devops.kubesample.service.GetInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class kubesample {

    @Autowired
    private GetInstance getInstance;

   // Application should display "healthy:true" for "/"
   @RequestMapping("/")
    @ResponseBody
    public  String healthcheck(){

       return "healthy/true";
    }

    // it should display "hello-nitin V3 " when user try to access "/hellonit"
    @RequestMapping("/hello-world-bean1")
    @ResponseBody
    public  String hellonit(){

        return "Hello World" + " V3 " + getInstance.retruninstanceof();
    }


    //it should return "hello-world" when user try to access "/hello-world-bean"
    @RequestMapping("/hello-world-bean")
    @ResponseBody
    public helloworldbean Helloworld() {

    return new helloworldbean("hello-world");

    }


    // it should display "hello-world " when user try to access "/hello-world/path-variable/{name}"
    @GetMapping("/hello-world/path-variable/{name}")
    @ResponseBody
    public  helloworldbean helloworldwitharguments(@PathVariable String name){

        return  new helloworldbean(String.format("Hello World , %s", name));

    }




}
