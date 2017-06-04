package com.site.service.impl;

import com.site.dao.UserDao;
import com.site.domain.User;
import com.site.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	public User login(HashMap param){
		User user = userDao.find(param);
		userDao.update(user);
		return user;
	}

	public User accountIsExisted(HashMap param){
		return userDao.find(param);
	}

	public User passwordCheck(HashMap param){
		User user = userDao.find(param);
		return user;
	}
	
	public User register(User user){
		user.setType("体验");
		userDao.create(user);
		return user;
	}
	
	public User passwordForgot(HttpSession session,User userParam){
		HashMap param = new HashMap<String,Object>();
		param.put("account",userParam.getAccount());
		User user = userDao.find(param);
		return user;
	}
	
	public User passwordRecover(User userParam){
		HashMap param = new HashMap<String,Object>();
		param.put("account",userParam.getAccount());
		User user = userDao.find(param);
		return user;
	}

	public User save(User userParam, String editPassword){
		User user = null;
		if(userParam.getId() != null) {
			HashMap param = new HashMap<String,Object>();
			param.put("id",userParam.getId());
			user = userDao.find(param);
			user.setAccount(userParam.getAccount());
			user.setPassword(userParam.getPassword());
			user.setName(userParam.getName());
			user.setMailbox(userParam.getMailbox());
			user.setContact(userParam.getContact());
			user.setCompany(userParam.getCompany());
			user.setDepartment(userParam.getDepartment());
			return user;
		}
		else {
			userDao.create(userParam);
			return userParam;
		}
	}

	public User find(Long id){
		HashMap param = new HashMap<String,Object>();
		param.put("id",id);
		return userDao.find(param);
	}

	public void delete(Long id){
		userDao.delete(id);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
