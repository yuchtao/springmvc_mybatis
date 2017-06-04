package com.site.dao;

import com.site.domain.User;
import java.util.HashMap;
import java.util.List;

public interface UserDao {
	List<User> page(Integer startIndex, Integer pageSize);
	Long total();
	User find(HashMap<String, Object> param);
	void create(User user);
	void update(User user);
	void delete(Long id);
}
