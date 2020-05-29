package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogController {

  @GetMapping(value = "/")
  public String listPosts(@RequestParam ModelMap modelMap){
    modelMap.put("title", "Blog Post 1");
    return "home";
  }
}
