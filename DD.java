public class DD {
    int i = 47;

    public void call() {
        System.out.println("调用call()方法");
        for (i = 0; i < 3; i++) {
            System.out.print(i + "");
            if (i == 2) {
                System.out.print("\n");
            }
        }
    }

    public DD() {}

    public static void main(String[] args) {
        DD t1 = new DD();
        DD t2 = new DD();
        t2.i = 60;
        System.out.println("第一个实例变量调用变量i的结果" + t1.i);
        t1.call();
        System.out.println("第一个实例变量调用变量i的结果" + t1.i);
        System.out.println("第二个实例变量调用变量i的结果" + t2.i);
        t2.call();
    }

}

