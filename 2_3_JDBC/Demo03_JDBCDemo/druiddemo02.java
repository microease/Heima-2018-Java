package Demo03_JDBCDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @program Heima-2018-Java
 * @description: 工具类测试
 * @author: huxiaoyi
 * @create: 2019/09/04 22:59
 */
public class druiddemo02 {
    public static void main(String[] args) {
        //完成添加操作，给account表添加一条记录
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            //获取连接
//            conn = DruidUtils.getConnection();
            //定义sql
            String sql = "insert into account values(null,?,?)";
            //获取pstmt对象
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "王五");
            pstmt.setDouble(2, 3000);
            pstmt.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            DruidUtils.close(pstmt, conn);
        }

    }
}
