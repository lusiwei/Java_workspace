package cn.sxt.oo2;

public class Human {
    private int age=10;
    String  name;//可以被本包下面的类访问
    protected int height;

    void sayAge() {
        System.out.println(age);
    }
}
