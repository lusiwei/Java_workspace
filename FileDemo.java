import java.io.*;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        File f = new File("6666.txt");
        FileWriter writer = new FileWriter(f);
        writer.append("你好，2018");
        writer.append("\r\n");
        writer.append("今天是2018年7月6日");
        writer.close();
        byte i = 127;
        System.out.println(i + 1
        );


    }
}
