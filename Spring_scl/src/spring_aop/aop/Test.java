package spring_aop.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring_aop.entity.User;
import spring_aop.service.UserService;

public class Test {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("spring_aop.xml");
		UserService userService =(UserService) ctx.getBean("service");

		User user =new User();
		user.setId(1);
		user.setUsername("zhangsan");
		user.setPassword("888888");
		user.setEmail("zhangsan@qq.com");
		userService.addNewUser(user);
	}

}
