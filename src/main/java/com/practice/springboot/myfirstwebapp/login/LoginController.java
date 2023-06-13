package com.practice.springboot.myfirstwebapp.login;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.slf4j.Logger;

@Controller
public class LoginController {

  private Logger logger = LoggerFactory.getLogger(getClass());

  @RequestMapping("login")
  public String goToLoginPage(@RequestParam String name, ModelMap model){
    model.put("name", name);
    logger.info("Request params is {}", name);
    System.out.println("Request Param is " + name);
    return "login";
  }
}
