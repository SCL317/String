package spring_first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx;

	private static void print(Object object) {
		System.out.println(object);
	}

	public static void test1() {
		Users users = new Users();
		users.setName("Teacher");
		users.setAddress("hefei");
		users.setMemo("this is my first Spring project");
		print(users);
	}

	public static void test2() {
		// 使用ClassPathXmlApplicationContext的方式实例化spring的上下文
		ctx = new ClassPathXmlApplicationContext("spring_first.xml");
		// 通过ApplicationContext的getbean()方法，根据id来获取bean实例
		Users users = (Users) ctx.getBean("users");
		print(users);
	}

	public static void main(String[] args) {
		test1();
		test2();
	}

}
