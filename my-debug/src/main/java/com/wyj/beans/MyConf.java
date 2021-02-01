package com.wyj.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* 配置类
 */
@Configuration
public class MyConf {

   @Bean
   public UserService myuserserive(){
      return new UserService();
   }

}