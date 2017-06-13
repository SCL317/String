package spring_aop.service.impl;

import lombok.Setter;
import spring_aop.dao.UserDao;
import spring_aop.entity.User;
import spring_aop.service.UserService;


/**
 * 用户业务类，实现对User功能的业务管理
 * 
 * */

public class UserServiceImpl implements UserService {
    //声明接口类的引用，和具体实现类解耦合；
	@Setter
	private UserDao dao;
	//使用lombok生成dao属性的setter访问器，会被spring调用，实现设置注入
	
	@Override
	public void addNewUser(User user) {
		// 调用dao的方法保存用户信息
		dao.save(user);
		
	}
}
