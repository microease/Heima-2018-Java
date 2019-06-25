package src.com.wzxdm.demo01Throwable;

public class Fu {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04() throws Exception{}




}
class Zi extends Fu{
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws ArrayIndexOutOfBoundsException{}
    public void show03() {}
    public void show04() {
        try {
            throw new Exception("编译器异常");
        }catch (Exception e){
            System.out.println(e);
        }

    }

}
