package com.cookshare.controller;

import com.cookshare.model.User;
import com.cookshare.service.user.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
  private final IUserService userService;

  @PostMapping("/register")
  public ResponseEntity<User> registerUser(@RequestBody User user) {
    User theUser = userService.registerUser(user);
    return ResponseEntity.ok(theUser);
  }

  @GetMapping
  public ResponseEntity<String> findUserByUsername(@RequestParam String username) {
    String theUser = userService.findByUsername(username);
    return ResponseEntity.ok(theUser);

  }

}
