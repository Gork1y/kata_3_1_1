package com.gorkiy.kata_3_1_1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.gorkiy.kata_3_1_1.Service.UserService;
import com.gorkiy.kata_3_1_1.model.User;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String printUsers(ModelMap model) {
        model.addAttribute(userService.getAllUsers());
        return "user";
    }

    @PostMapping
    public String addUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.delete(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String editUser( @PathVariable("id") Long id, ModelMap model) {
        User user = userService.getById(id);
        model.addAttribute("user", user );
        return "editUser";
    }

    @PostMapping("/edit")
    public String updateUser(User user) {
        userService.add(user);
        return "redirect:/";
    }
}
