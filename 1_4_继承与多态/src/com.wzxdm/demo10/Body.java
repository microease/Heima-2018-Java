package src.com.wzxdm.demo10;

public class Body {
    public class Heart{
        public void beat(){
            System.out.println("心脏跳动");
        }
    }
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类的方法");
        Heart heart = new Heart();
        heart.beat();
    }
}
