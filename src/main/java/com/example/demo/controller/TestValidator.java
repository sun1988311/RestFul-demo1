package com.example.demo.controller;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class TestValidator {

    @GetMapping("/test")
    public String showForm(User user) {
        return "/thymeleaf/form";
    }

    @GetMapping("/results")
    public String results() {
        return "thymeleaf/results";
    }

    @PostMapping("/test")
    public String checkUser(@Valid User user, BindingResult bindingResult, RedirectAttributes attr) {
        if (bindingResult.hasErrors()) {
            return "thymeleaf/form";
        }

        attr.addFlashAttribute("user", user);
        return "redirect:/results";

    }
}
 