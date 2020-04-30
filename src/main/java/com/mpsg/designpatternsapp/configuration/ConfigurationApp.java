package com.mpsg.designpatternsapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

import com.mpsg.designpatternsapp.prototype.ProtoFalse;
import com.mpsg.designpatternsapp.prototype.ProtoTrue;

@Configuration
public class ConfigurationApp {

  @Bean
  public ProtoFalse protoFalse() {
    return new ProtoFalse();
  }

  @Bean
  @Scope("prototype")
  public ProtoTrue protoTrue() {
    return new ProtoTrue();
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }
}
