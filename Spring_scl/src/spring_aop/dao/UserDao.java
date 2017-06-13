package spring_aop.dao;

import spring_aop.entity.User;

/**
 * 增加dao接口，定义所需的持久化
 * */

public interface UserDao {
	public void save(User user);
}
