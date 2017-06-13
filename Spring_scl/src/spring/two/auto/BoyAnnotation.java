package spring.two.auto;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

//@Component("boyAnnotation")给组件取一个名字

@Component("boyAnnotation")
public class BoyAnnotation {

	private static Logger logger = Logger.getLogger(BoyAnnotation.class);
	// @Autowired
	private UsaGirlFriend usaGirlFriend;
	private static ApplicationContext ctx;

	public UsaGirlFriend getUsaGirlFriend() {
		return usaGirlFriend;
	}

	@Resource(name="usaGirlFriend")
	public void setUsaGirlFriend(UsaGirlFriend usaGirlFriend) {
		this.usaGirlFriend = usaGirlFriend;
	}

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("spring_two_type.xml");
		BoyAnnotation boy = (BoyAnnotation) ctx.getBean("boyAnnotation");
		logger.info(boy.usaGirlFriend.speak());
	}

}
