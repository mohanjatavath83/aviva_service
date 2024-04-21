package com.aviva;

import com.aviva.config.FF4JConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.ff4j.FF4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@Slf4j
public class AvivaApplication {

  @Autowired
  private FF4j ff4j;

  public static void main(String[] args) {
    String classpath = System.getProperty("java.class.path");
    log.info("classpath of aviva application {} ", classpath);
    SpringApplication.run(AvivaApplication.class, args);

  }


 /* @Bean
  public CommandLineRunner commandLineRunner() {
    return args -> {
      while (true) {
        if (ff4j.check(FF4JConfiguration.HELLO_FEATURE)) {
          System.out.println("Feature Enabled");
        } else {
          System.out.println("Feature Disabled");
        }
        Thread.sleep(5000);
      }
    };
  }*/


}
