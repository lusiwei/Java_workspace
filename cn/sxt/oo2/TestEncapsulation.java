package cn.sxt.oo2;

public class TestEncapsulation {
    public static void main(String[] args) {
        Human h=new Human();
//        h.age=13;
        h.name = "lusiwei";
        Person4Encapsulation p4 = new Person4Encapsulation();
        p4.setAge(-12);
        p4.getAge();
    }
}

class Boy extends Human {
    void sayHello() {
//        System.out.println(age); //子类无法使用父类的私有属性和方法

    }
}