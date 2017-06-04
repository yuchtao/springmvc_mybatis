package com.site.service;

import com.site.domain.User;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

public interface UserService {
	User login(HashMap param);
	User accountIsExisted(HashMap param);
	User passwordCheck(HashMap param);
	User register(User user);
	User passwordForgot(HttpSession session, User userParam);
	User passwordRecover(User userParam);
	User save(User userParam, String editPassword);
	User find(Long id);
	void delete(Long id);
}
