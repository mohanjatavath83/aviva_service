package com.aviva.facade;

import com.aviva.dto.BatchDto;
import com.aviva.dto.UserDto;

public interface UserFacade {

  void ingestUserData(BatchDto batchDto);

  UserDto createUser(UserDto userDto);

  UserDto getEmployee(Integer employeeId);
}
