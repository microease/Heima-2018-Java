package src.com.wzxdm.Demo01JunitTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.com.wzxdm.Demo01Junit.Calculate;

public class CalculateTest {
    public static void main(String[] args) {
//        Calculate c = new Calculate();
//        int res = c.add(1, 2);
//        System.out.println(res);
//        int res2 = c.sub(1, 2);
//        System.out.println(res2);
    }
    @Before
    public void init(){
        System.out.println("init");
    }

    @After
    public void close(){
        System.out.println("close");
    }
    @Test
    public void testAdd(){
        System.out.println("我被执行了");
        Calculate c = new Calculate();
        int res = c.add(1, 2);
        Assert.assertEquals(3,res);
        System.out.println(res);
    }

}
