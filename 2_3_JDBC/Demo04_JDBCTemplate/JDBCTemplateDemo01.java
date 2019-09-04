package Demo04_JDBCTemplate;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @program Heima-2018-Java
 * @description: 入门
 * @author: huxiaoyi
 * @create: 2019/09/04 23:45
 */
public class JDBCTemplateDemo01 {
    public static void main(String[] args) {
        //导入JAR包
        //创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate();
        //调用方法
        String sql = "update account set balance = 5000 where id = ?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
}
