package org.sh.origin.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

  @RequestMapping("test")
  public String test(){
    return "test";
  }

}
