package com.pluralsight.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

@Controller
public class BlogController {
    @RequestMapping("/")
    public String listPosts(ModelMap m) {
        m.put("title", "Blog Post 1");

        return "home";
    }
}
