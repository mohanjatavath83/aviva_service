package com.aviva.service.impl;

import com.aviva.entity.UserEntity;
import com.aviva.repositories.UserRepository;
import com.aviva.service.UserService;
import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  @Transactional
  public void ingestUserData(Integer batchSize, Integer totalCount) {
    for (int i = 0; i < totalCount; i += batchSize) {
      int start = i;
      int end = Math.min(start + batchSize, totalCount);
      Runnable uploadTask = () -> uploadBatch(start, end);
      Thread thread = new Thread(uploadTask);
      thread.start();
    }
  }

  private void uploadBatch(int start, int end) {
    Faker faker = new Faker();
    for (int i = start; i < end; i++) {
      UserEntity user = new UserEntity(faker.name().firstName(), faker.name().lastName(), faker.internet().emailAddress());
      user.setCity(faker.address().city());
      user.setCountry(faker.address().country());
      user.setPassword(faker.internet().password());
      userRepository.save(user);
    }
  }

  public UserEntity saveUser(UserEntity userEntity) {
    userEntity = userRepository.save(userEntity);

    return userEntity;
  }

  public UserEntity getUserById(Integer userId) {
    return userRepository.findById(userId).orElse(null);
  }


}
