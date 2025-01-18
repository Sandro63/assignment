package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TokenController {

    @GetMapping("/login/oauth2/code/")
    public String handleAuthorizationCode(@RequestParam("code") String code) {
        // You can use the 'code' to exchange for an access token
        System.out.println("Authorization Code: " + code);
        return "redirect:/";  // Redirect after handling
    }
}
