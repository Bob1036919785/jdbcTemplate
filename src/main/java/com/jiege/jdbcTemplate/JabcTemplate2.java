package com.jiege.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JabcTemplate2 {
    public static void main(String[] args) {
//       1.获取容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        jdbcTemplate.execute("insert into account(id,name ,money) values (13,'123',123)");

        /* DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///mybatis_day01?serverTimezone=GMT%2B8");
        dataSource.setUsername("root");
        dataSource.setPassword("jiege");

//        创建jdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(dataSource);

        jt.execute("insert into account(id,name,money) values (11,'ccc',10)");*/
    }
}
