package org.sh.origin.user.controller;

import com.netflix.discovery.DiscoveryManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

  @RequestMapping("test")
  public String test(){
    return "test";
  }

  @GetMapping(value = "/offline")
  public void offLine(){
    DiscoveryManager.getInstance().shutdownComponent();
  }

}
