// 실행 흐름은 UserController -> UserServiceImplement -> PostUserRequestDto -> UserServiceImplement -> UserRepository -> UserEntity -> ResponseDto -> UserServiceImplement -> UserController 순서

// 기능 : 사용자 데이터 입력 시 API 요청

package com.korit.basic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korit.basic.dto.PostUserRequestDto;
import com.korit.basic.service.UserService;
import com.korit.basic.dto.ResponseDto;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;
  
  @PostMapping()
  public ResponseEntity<ResponseDto> postUser(
    @RequestBody @Valid PostUserRequestDto requestBody
  ) {
    ResponseEntity<ResponseDto> response = userService.postUser(requestBody);
    return response;
  }

}
