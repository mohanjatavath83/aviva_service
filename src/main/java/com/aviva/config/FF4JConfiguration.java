package com.aviva.config;

import org.ff4j.FF4j;
import org.ff4j.springjdbc.store.EventRepositorySpringJdbc;
import org.ff4j.springjdbc.store.FeatureStoreSpringJdbc;
import org.ff4j.springjdbc.store.PropertyStoreSpringJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class FF4JConfiguration {

  public static final String HELLO_FEATURE = "helloFeature";

  @Autowired
  private DataSource dataSource;

  @Bean
  public FF4j ff4j() {

    FF4j ff4j = new FF4j();
    /*FlippingStrategy strategy = new ReleaseDateFlipStrategy("2024-04-16-06:08");
    Feature helloFeature = new Feature(HELLO_FEATURE);
    helloFeature.setEnable(true);
    helloFeature.setFlippingStrategy(strategy);

    ff4j.createFeature(helloFeature);*/

    ff4j.setFeatureStore(new FeatureStoreSpringJdbc(dataSource));
    ff4j.setPropertiesStore(new PropertyStoreSpringJdbc(dataSource));
    ff4j.setEventRepository(new EventRepositorySpringJdbc(dataSource));
    ff4j.audit(true);
    ff4j.autoCreate(true);

    return ff4j;
  }
}