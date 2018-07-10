package cn.sxt.oo2;

import java.util.Objects;

public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;

        User u1 = new User(1000, "lusiwei", "123456");
        User u2 = new User(1000, "lsw", "123456");
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));


    }
}

class User {
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
