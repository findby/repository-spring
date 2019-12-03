package org.part.spring.commutils;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
/***
 * @author	wenxiang.fei
 * @Description	统一使用JdbcTemplate
 * @time	2019-12-03 10:12:09
 */
public class JdbcTemplateUtils {
	
	public static JdbcTemplate getSpringJdbcTemplate(JdbcTemplate jdbcTemplate) {
		
	    DriverManagerDataSource dataSource = new DriverManagerDataSource();
	    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	    dataSource.setUrl("jdbc:mysql://localhost:3306/develop?useUnicode=true&characterEncoding=UTF-8");
	    dataSource.setUsername("root");
	    dataSource.setPassword("1234");
	    
		return new JdbcTemplate(dataSource);
	}
}
