package com.lgd.es.test;

import org.junit.Test;

import java.sql.*;
import java.util.Properties;

/**
 * <p>Project: samples-all</p>
 * <p>Package: com.lgd.es.test</p>
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/6/15
 */

public class JdbcTest {

    String driver = "org.elasticsearch.xpack.sql.jdbc.jdbc.JdbcDriver";
    String elasticsearchAddress = "10.250.140.14:9987";

    public Properties connectionProperties(){
        Properties properties = new Properties();
//        properties.put("user", "test_admin");
//        properties.put("password", "x-pack-test-password");
        return properties;
    }

    @Test
    public void test(){
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String address = "jdbc:es://http://" + elasticsearchAddress;
        Properties connectionProperties = connectionProperties();

        try (Connection connection = DriverManager.getConnection(address, connectionProperties);
            Statement statement = connection.createStatement();
             ResultSet results = statement.executeQuery(
                     "SELECT name, page_count FROM library ORDER BY page_count DESC LIMIT 5")) {

            while(results.next()){
                System.out.println(results.getString(1));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
