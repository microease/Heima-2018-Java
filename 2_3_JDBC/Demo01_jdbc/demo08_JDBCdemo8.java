package Demo01_jdbc;

import Demo02_domain.Emp;
import util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class demo08_JDBCdemo8 {
    public static void main(String[] args) {
        List<Emp> list = new demo08_JDBCdemo8().findAll();
        System.out.println(list);
    }
    public List<Emp> findAll() {
        //1 注册驱动
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            // 获取连接
//            conn = DriverManager.getConnection("jdbc:mysql////db3", "root", "root");
            conn = JDBCUtils.getConnection();
            //定义sal
            String sql = "select * from emp";
            // 获取执行sql的对象
            stmt = conn.createStatement();
            // 执行sql
            rs = stmt.executeQuery(sql);
            //遍历结果集，封装对象，装载集合
            Emp emp = null;
            List<Emp> list = new ArrayList<Emp>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bouns = rs.getDouble("bouns");
                int dept_id = rs.getInt("dept_id");
                //创建emp对象
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBouns(bouns);
                emp.setDept_id(dept_id);
                //装载集合
                list.add(emp);
            }}
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            if (rs != null) {
//                try {
//                    rs.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }}
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
            JDBCUtils.close(rs,stmt,conn);
        }
        return null;
    }
}
