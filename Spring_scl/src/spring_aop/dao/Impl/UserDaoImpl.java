package spring_aop.dao.Impl;

import spring_aop.dao.UserDao;
import spring_aop.entity.User;

/**
 * 用户DAO类，实现IDao接口，负责User类的持久化操作
 * */

public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
		// 这里并没有实现完整的数据库，仅为了说明问题
		System.out.println("保存用户数据到信息库");
		
	}

	
}
