package src.com.wzxdm.demo02e;

public class demo05GenericInterfaceImp2<I> implements GenericInterface<I> {
    @Override
    public void method(I i) {
        System.out.println(i);
    }
}
