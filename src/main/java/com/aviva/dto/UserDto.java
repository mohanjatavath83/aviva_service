package com.aviva.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UserDto implements Serializable {
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;
  private String city;
  private String country;
}
