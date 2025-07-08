package com.k02.to_do_list_with_dto.controller;

import com.k02.to_do_list_with_dto.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final UserRepository userRepository;

    @GetMapping({"/","/login"})
    public String showLogin(){
        return "login";
    }
}
