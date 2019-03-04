package com.udemy.sfg.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage() {
        return "index";
    }
}
