public static void main(String[] args) throws IOException {
        // 创建计算器对象
        Calculate c = new Calculate();
        //获取字节码文件对象
        Class cClass = c.getClass();
        //获取所有方法
        Method [] methods = cClass.getMethods();
        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method:methods){
            //判断方法上是否有check标记
            if(method.isAnnotationPresent(Check.class)){
                try{
                    method.invoke(c);
                } catch (Exception e) {
                    number++;
                    bw.write("xxx方法出异常了");
                    bw.newLine();
                    bw.write("异常名称：");
                    bw.newLine();
                }
            }
        }
        bw.write("本次测试一共出现"+number+"次异常");
        bw.flush();
        bw.close();

    }
}
