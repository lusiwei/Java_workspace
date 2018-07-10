package cn.sxt.oo2;

public class TestObject {
    //    Object obj;
    public static void main(String[] args) {
        TestObject to = new TestObject();
        System.out.println(to.toString());
        Person2 p2 = new Person2("lusiwei",20);
        System.out.println(p2.toString());

    }

    public String toString() {
        return "测试Object对象";

    }

}
class Person2{
    String name;
    int age;
    public String toString() {
        return name+"年龄"+age;
    }

    public Person2(String name, int age) {
        this.name=name;
        this.age=age;
    }
}

