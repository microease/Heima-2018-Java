package Demo01_jdbc;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class demo02_jdbc {
    public static void main(String[] args) {
        Statement stmt = null;
        Connection conn = null;
        //1 注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //2 定义sql
            String sql = "insert into account values(null,'王五',3000)";
            //3 获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:////db3", "root", "root");
            //4 获取执行sql的对象Statment
            stmt = conn.createStatement();
            //5 执行sql
            int count = stmt.executeUpdate(sql);
            //6 处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            stmt.close();
            //避免空指针异常
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
