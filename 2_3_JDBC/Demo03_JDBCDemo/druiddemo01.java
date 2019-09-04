package Demo03_JDBCDemo;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.sql.Connection;
import java.util.Properties;

/**
 * @program Heima-2018-Java
 * @description:
 * @author: huxiaoyi
 * @create: 2019/09/04 00:57
 */
public class druiddemo01 {
    public static void main(String[] args) throws Exception {
        //导入JAR包
        //定义配置文件
        //加载配置文件
        Properties pro = new Properties();
        InputStream is = druiddemo01.class.getClassLoader().getResourceAsStream("druid.properties");

        pro.load(is);
        //获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
        //获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
