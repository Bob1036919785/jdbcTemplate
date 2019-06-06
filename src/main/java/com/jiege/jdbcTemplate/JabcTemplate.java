package com.jiege.jdbcTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JabcTemplate {
    public static void main(String[] args) {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql:///mybatis_day01?serverTimezone=GMT%2B8");
        ds.setUsername("root");
        ds.setPassword("jiege");

//        创建jdbcTemplate对象
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(ds);

        jt.execute("insert into account(id,name,money) values (9,'ccc',10)");
    }
}
