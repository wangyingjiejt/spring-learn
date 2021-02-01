package com.wyj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
* 配置类
 */
@Configuration
public class MyConf {

   @Bean("myuserserive")
   public UserService userService(){
      return new UserService();
   }

}