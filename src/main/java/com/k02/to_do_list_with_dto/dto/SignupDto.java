package com.k02.to_do_list_with_dto.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupDto {
    @NotBlank(message = "아이디를 입력하세요.")
    @Size(min=3, max=15, message = "아이디는 3~15자여야 합니다.")
    private String username;

    @NotBlank(message = "비밀번호를 입력하세요.")
    @Size(min=6, max=20, message = "비밀번호는는 6~20자여야 합니다.")
    private String password;
}
