package com.weixin.controllers;

import com.weixin.result.RestResultID;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String entry() {
        return "Hello";
    }


    @RequestMapping("/.well-known/acme-challenge/**")
    @ResponseBody
    public String ssl() {
        return "pu50ZOCHLdVAzFwXVgaIdHGClycXr_q0QO0IO5X3NyY.xpbgK9QnHkHLRpGBZiYsa-hXaayqrPxfxPVaFPAPocA";
    }

    // 本页面 为系统默认进入的页面   不设登录拦截
    @ResponseBody
    @RequestMapping("/login_page")
    public RestResultID login_page(Model model) {
        model.addAttribute("name", "eeeee");
        return new RestResultID(0, "", 0);
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
