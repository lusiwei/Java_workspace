public class SxtStu {
    //    属性fields
    int id;
    String sname;
    int age;

    Computer comp;

    void study() {
        System.out.println("我在认真学习" + comp.brand);
    }

    void play() {
        System.out.println("我在打篮球");

    }

    //构造方法，用于创造这个类的对象,无参的构造方法可以由系统自动创建
    SxtStu() {

    }

    //    程序执行的入口
    public static void main(String[] args) {
        SxtStu stu = new SxtStu();// 创建一个对象
        stu.play();
        stu.sname = "lusiwei";
        stu.age = 18;

        Computer c1 = new Computer();
        c1.brand = "dell";

        stu.comp = c1;
        stu.study();

    }
}

class Computer {
    String brand;
}
