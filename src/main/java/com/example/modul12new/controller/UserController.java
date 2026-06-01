package com.example.modul12new.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.modul12new.model.User;
import com.example.modul12new.repository.UserRepository;



@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // READ
    @GetMapping("/")
    public String index(Model model) {

        model.addAttribute("users", userRepository.findAll());

        return "index";
    }

    // FORM CREATE
    @GetMapping("/tambah")
    public String tambah(Model model) {

        model.addAttribute("user", new User());

        return "tambah";
    }

    // CREATE
    @PostMapping("/simpan")
    public String simpan(@ModelAttribute User user) {

        userRepository.save(user);

        return "redirect:/";
    }
}