package cn.sxt.oo2;

/**
 * 测试重写
 *
 * @author lusiwei
 */

public class TestOverride {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.run();
        h.whoIspsg();
    }
}

class Vehicle {
    public void run() {
        System.out.println("跑");
    }

    public void stop() {
        System.out.println("停！！");
    }

    public Person whoIspsg() {
        return new Person();
    }

}

class Horse extends Vehicle {
    public void run() {
        System.out.println("四蹄翻飞");

    }

    public Student whoIspsg() {
        System.out.println("大家好");
        return new Student();
    }


}

