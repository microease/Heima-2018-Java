public class Demo17HundreSum {
    public static void main(String[] args){
        //求1-100之间的偶数和。
        int res = 0;
        for(int i=0;i<=100;i++){
                if(i%2==0){
                    res+=i;
                }
        }
        System.out.println(res);
    }
}
