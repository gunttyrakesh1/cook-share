package com.cookshare.service.user;

import com.cookshare.model.User;

public interface IUserService {

  User registerUser(User user);

  String findByUsername(String username);
}
