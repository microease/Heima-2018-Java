package Demo04_JDBCTemplate;

import com.alibaba.druid.util.DruidWebUtils;
import com.alibaba.druid.util.JdbcUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import util.JDBCUtils;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @program Heima-2018-Java
 * @description: DML
 * @author: huxiaoyi
 * @create: 2019/09/04 23:57
 */
public class JDBCTemplateDemo02 {
    /*需求：修改1号数据的salary为10000
     * 删除刚才添加的记录
     * 查询id为1的记录，将其封装为map集合
     * 查询所有的记录 将其封装为list
     * 查询所有记录，将其封装为Emp对象的list集合
     * 查询总记录数
     *  */
    //Junit单元测试，可以让方法独立执行
    //添加1条记录
    @Test
    public void test1() {
        //获取JDBCTemplate对象
        try {
            JdbcTemplate template = new JdbcTemplate((DataSource) JDBCUtils.getConnection());
            //定义sql
            String sql = "update emp set salary = 10000 where id = 1001";
            //执行sql
            int count = template.update(sql);
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
