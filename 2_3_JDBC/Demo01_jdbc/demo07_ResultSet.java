package Demo01_jdbc;

import java.sql.*;

public class demo07_ResultSet {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        //1 注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2 获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:////db3", "root", "root");
            //3 定义sql
            String sql = "select * from account";
            //4 获取执行sql的对象
            stmt = conn.createStatement();
            //5 执行sql
            rs = stmt.executeQuery(sql);
            //6 处理结果
            //让游标向下一行
            while (rs.next()) {
                //判断是否有数据
                //获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);
                //打印数据
                System.out.println(id + name + balance);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
    }
}
