package cn.sxt.oo2;

public class TestExtends {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "lusiwei";
        stu.height = 179;
        stu.rest();
        Student stu2 = new Student("lsw", 6, "qqqq");
        System.out.println(stu2 instanceof Student);
        System.out.println(stu2 instanceof Person);
        System.out.println(stu2 instanceof Object);
        System.out.println(new Person() instanceof Student);
    }
}

class Person {
    String name;
    int height;
    public void rest() {
        System.out.println("休息一会");
    }
}

class Student extends Person {
    String major;

    public void study() {
        System.out.println("学习两小时");
    }

    public Student(String name, int height, String major) {
        this.name=name;
        this.height=height;
        this.major=major;
    }
    public Student() {

    }
}

