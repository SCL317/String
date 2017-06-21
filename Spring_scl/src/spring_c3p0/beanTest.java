package spring_c3p0;

import java.sql.*;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanTest {

	public static void main(String[] args) throws Exception {
		// 实例化Spring容器。Spring容器负责实例化Bean
		ApplicationContext ctx =
			new ClassPathXmlApplicationContext("spring_c3p0.xml");
		// 获取容器中id为dataSource的Bean
		DataSource ds = ctx.getBean("dataSource", DataSource.class);
		// 通过DataSource来获取数据库连接
		Connection conn = ds.getConnection();
		// 通过数据库连接获取PreparedStatement
		PreparedStatement pstmt = conn.prepareStatement(
			"insert into news_inf values(null , ? , ?)");
		pstmt.setString(1 , "关于c3p0");
		pstmt.setString(2 , "c3p0是什么鬼");
		// 执行SQL语句
		pstmt.executeUpdate();
		// 清理资源，回收数据库连接资源。
		if (pstmt != null)pstmt.close();
		if (conn != null)conn.close();
	}

}
