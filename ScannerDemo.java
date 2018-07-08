import java.util.Scanner;

/**
 * java.util.Scanner 是 Java5 的新特征，我们可以通过 Scanner 类来获取用户的输入
 * 接下来我们演示一个最简单的数据输入，并通过 Scanner 类的 next() 与 nextLine() 方法获取输入的字符串，
 * 在读取前我们一般需要 使用 hasNext 与 hasNextLine 判断是否还有输入的数据
 */

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有数据输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}
