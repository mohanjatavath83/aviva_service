package com.aviva.service;

import com.aviva.entity.UserEntity;

public interface UserService {

  void ingestUserData(Integer batchSize, Integer totalCount);

  UserEntity saveUser(UserEntity employeeEntity);

  UserEntity getUserById(Integer employeeId);
}
