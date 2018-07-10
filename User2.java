public class User2 {
    int id;
    String name;
    String pwd;
    static String company = "小码聪聪";

    public User2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void login() {
        System.out.println("登录:" + name);
    }
    public static void printCompany() {
        System.out.println(company);
    }

    public static void main(String[] args) {
        User2 u = new User2(101, "lusiwei");
        User2.printCompany();
        User2.company = "重庆数据谷";
        User2.printCompany();
    }
}
