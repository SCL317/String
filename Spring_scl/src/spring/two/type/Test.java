package spring.two.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("spring_two_type.xml");
		DataType entity = (DataType) ctx.getBean("dataType");
		entity.printValue();
	}

}
