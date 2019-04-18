package com.weixin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

  @RequestMapping("/")
  // @ResponseBody
  public String entry() {
    return "{login_page:1}";
  }

  // 本页面 为系统默认进入的页面   不设登录拦截
  @RequestMapping("/login_page")
  public String login_page( Model model) {
    model.addAttribute("name", "eeeee");
    return "{login_page:1}";
  }


  @RequestMapping("/webapp/**/**")
  // @ResponseBody
  public String webapp() {
    return "webapp";
  }

  @RequestMapping("/register/**/**")
  // @ResponseBody
  public String register() {
    return "register";
  }
}
