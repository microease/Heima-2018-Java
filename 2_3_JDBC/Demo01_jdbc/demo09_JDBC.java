package Demo01_jdbc;

import util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/**
 * @program Heima-2018-Java
 * @description:
 * @author: huxiaoyi
 * @create: 2019/09/01 20:58
 */
public class demo09_JDBC {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        //调用方法
        boolean flag = new demo09_JDBC().login(username,password);
        if(flag==true){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
//    public boolean login(String username, String password){
//        if (username == null || password == null) {
//            return false;
//        }
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//        //连接数据库判断是否登录成功
//        // 获取连接
//        try {
//             conn = JDBCUtils.getConnection();
//            //定义sql
//            String sql = "select  * from user where username = '"+username+"' and password = '"+password+"'";
//            //获取执行sql的对象
//             stmt = conn.createStatement();
//            //执行查询
//             rs = stmt.executeQuery(sql);
//            //判断
////            if(rs.next()){
////                return true;
////            }else{
////                return false;
////            }
//            return rs.next();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            JDBCUtils.close(rs,stmt,conn);
//        }
//
//        return false;
//
//    }
    public boolean login(String username, String password){
        if (username == null || password == null) {
            return false;
        }
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        //连接数据库判断是否登录成功
        // 获取连接
        try {
            conn = JDBCUtils.getConnection();
            //定义sql
            String sql = "select  * from user where username = ? and password = ?";
            //获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,username);
            pstmt.setString(2,password);

            //执行查询
            rs = pstmt.executeQuery();
            //判断
//            if(rs.next()){
//                return true;
//            }else{
//                return false;
//            }
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,conn);
        }

        return false;

    }
}
