package com.example.spring5jokesappv2.controller;

import com.example.spring5jokesappv2.controller.services.JockService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JockController {
    private JockService jockService;

    public JockController(JockService jockService) {
        this.jockService = jockService;
    }

    @RequestMapping("/jock")
    public String getJocks(Model model){
        model.addAttribute("jock",jockService.nextJock());
        return "list";
    }
}
