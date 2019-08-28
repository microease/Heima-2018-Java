package Demo01_jdbc;

import java.sql.*;

public class demo03_jdbc {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        //1 注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2 获取连接对象
            conn = DriverManager.getConnection("jdbc:mysql:////db3", "root", "root");
            //3 定义sql
            String sql = "update account set balance = 1500 where id = 3";
            //4 获取执行sql的对象
            stmt = conn.createStatement();
            //5 执行sql
            int count = stmt.executeUpdate(sql);
            //6 处理结果
            System.out.println(count);
            if(count>0){
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
            }

            //
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
            if(conn !=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
