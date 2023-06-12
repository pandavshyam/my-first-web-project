package com.practice.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

  @RequestMapping("say-hello")
  @ResponseBody
  public String sayHello(){
    return "Hello!";
  }

  @RequestMapping("say-hello-html")
  @ResponseBody
  public String sayHelloHtml(){
    StringBuffer sb = new StringBuffer();
    sb.append("<html>");
    sb.append("<head>");
    sb.append("<title>");
    sb.append("My First Web Page");
    sb.append("</title>");
    sb.append("</head>");
    sb.append("<body>");
    sb.append("My First Web page");
    sb.append("</body>");
    sb.append("</html>");
    return sb.toString();
  }
}
