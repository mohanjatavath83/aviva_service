package com.aviva.controller;


import com.aviva.dto.BatchDto;
import com.aviva.dto.ResponseDto;
import com.aviva.dto.UserDto;
import com.aviva.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

  private final UserFacade userFacade;

  @Autowired
  private FF4j ff4j;

  @PostMapping("/ingest")
  public ResponseEntity<ResponseDto<String>> ingestUsers(@RequestBody BatchDto batchDto) {
    userFacade.ingestUserData(batchDto);
    return ResponseEntity.ok(new ResponseDto<String>("success", HttpStatus.CREATED.value(), "success"));
  }


  @PostMapping
  public ResponseEntity<ResponseDto<UserDto>> createUser(@RequestBody UserDto employeeDto) {
    UserDto employeeDto1 = userFacade.createUser(employeeDto);
    return ResponseEntity.ok(new ResponseDto<UserDto>("success", HttpStatus.CREATED.value(), employeeDto1));
  }

  @GetMapping("userId")
  public ResponseEntity<ResponseDto<UserDto>> getUserById(@PathVariable(name = "userId") Integer userId) {
    UserDto userDto = userFacade.getEmployee(userId);
    return ResponseEntity.ok(new ResponseDto<UserDto>("success", HttpStatus.CREATED.value(), userDto));
  }
}
