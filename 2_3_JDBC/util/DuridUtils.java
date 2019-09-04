package util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @program Heima-2018-Java
 * @description:
 * @author: huxiaoyi
 * @create: 2019/09/04 22:35
 */
public class DuridUtils {
    //定义成员变量DataSource
    private static DataSource ds;

    static {
        //加载配置文件
        Properties pro = new Properties();
        try {
            pro.load(DuridUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //获取Datasource
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    获取连接
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public static void close(Statement stmt, Connection conn) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //获取连接池方法
    public static DataSource getDataSource() {
        return ds;
    }

}
