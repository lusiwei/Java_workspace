package cn.sxt.oo2;

public class TestPolym {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);
        Animal d = new Dog(); //自动向上转型
        animalCry(d);
        Cat c = new Cat();
        animalCry(new Cat());
        Dog d2 = (Dog) d;  //强制向下转型
        d2.seeDog();
//        Dog d3 = (Dog) c;
//        d3.seeDog();
        String str;
    }

    static void animalCry(Animal a) {
        a.shout();
    }
}

class Animal {
    public void  shout() {
        System.out.println("叫了一声");
        Animal a = new Animal();
    }
}

class Dog extends Animal {
    public void shout() {
        System.out.println("汪汪汪");
    }

    public void seeDog() {
        System.out.println("看门");
    }
}

class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵");
    }
}

