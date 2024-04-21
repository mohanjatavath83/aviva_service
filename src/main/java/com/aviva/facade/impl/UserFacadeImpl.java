package com.aviva.facade.impl;

import com.aviva.dto.BatchDto;
import com.aviva.dto.UserDto;
import com.aviva.entity.UserEntity;
import com.aviva.facade.UserFacade;
import com.aviva.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserFacadeImpl implements UserFacade {

  private final UserService userService;

  public void ingestUserData(BatchDto batchDto) {
    log.info("start data user ingestion in database start_time {} ", LocalDateTime.now());
    userService.ingestUserData(batchDto.getBatchSize(), batchDto.getTotalCount());
    log.info("completed data user ingestion in database end_time {} ", LocalDateTime.now());
  }

  public UserDto createUser(UserDto UserDto) {
    UserEntity userEntity = new UserEntity();
    userEntity.setFirstName(UserDto.getFirstName());
    userEntity.setLastName(UserDto.getLastName());
    userEntity.setEmail(UserDto.getEmail());
    userEntity.setCity(UserDto.getCity());
    userEntity.setCity(UserDto.getCity());
    userEntity = userService.saveUser(userEntity);
    UserDto employeeDto1 = new UserDto();
    employeeDto1.setId(userEntity.getId());
    employeeDto1.setFirstName(userEntity.getFirstName());
    employeeDto1.setEmail(userEntity.getEmail());
    return employeeDto1;
  }


  public UserDto getEmployee(Integer userId) {
    UserEntity userEntity = userService.getUserById(userId);
    UserDto userDto = new UserDto();
    userDto.setId(userEntity.getId());
    userDto.setFirstName(userEntity.getFirstName());
    userDto.setEmail(userEntity.getEmail());


    return userDto;
  }

}
