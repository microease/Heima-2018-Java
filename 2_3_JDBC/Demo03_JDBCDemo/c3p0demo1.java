package Demo03_JDBCDemo;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @program Heima-2018-Java
 * @description: 演示
 * @author: huxiaoyi
 * @create: 2019/09/03 23:58
 */
public class c3p0demo1 {
    public static void main(String[] args) throws SQLException {
        //创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        //获取连接对象
        Connection conn = ds.getConnection();
        //打印
        System.out.println(conn);

    }
}
