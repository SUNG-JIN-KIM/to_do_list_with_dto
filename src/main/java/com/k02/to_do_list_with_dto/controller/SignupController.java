package com.k02.to_do_list_with_dto.controller;


import com.k02.to_do_list_with_dto.dto.SignupDTO;
import com.k02.to_do_list_with_dto.model.User;
import com.k02.to_do_list_with_dto.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SignupController {
    private final UserRepository userRepository;

    @GetMapping("/signup")
    public String showSignup(Model model){
        model.addAttribute("signupDto", new SignupDTO());

        return "signup";
    }

    @PostMapping("/signup")
    public String doSignup(
            @Valid @ModelAttribute("signupDto") SignupDTO signupDTO, // 검증 결과
           BindingResult bindingResult, // 화면에 보여주기
           Model model
    ){
        if(bindingResult.hasErrors()){
            return "signup";
        }

        // 중복 가입 여부
        User user = User.builder()
                .username(signupDTO.getUsername())
                .password(signupDTO.getPassword())
                .build();

        return "redirect:/login?registered";
    }
}
