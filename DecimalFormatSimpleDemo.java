import javax.jws.soap.SOAPBinding;
import java.text.DecimalFormat;

public class DecimalFormatSimpleDemo {
    //    使用实例化对象设置格式化模式
    static public void SimpleFormat(String pattern, double value) {
//        实例化DecimalFormat 对象
        DecimalFormat myFormat = new DecimalFormat(pattern);
        String output= myFormat.format(value);
        System.out.println(value+""+pattern+""+output);
    }
    static public void UseApplyPatternMethodFormat(String pattern,double value){
        DecimalFormat myFormat=new DecimalFormat();
        myFormat.applyPattern(pattern);
        System.out.println(value+""+pattern+""+myFormat.format(value));
    }

    public static void main(String[] args) {
        SimpleFormat("###,###,###",123456.789);
        SimpleFormat("00000000.###kg",123456.789);
//        按照格式化模板格式化数字,不存在的为以0显示
        SimpleFormat("000000.000",123.78);
//        调用静态方法UseApplyPatternMethodFormat()
        UseApplyPatternMethodFormat("#.###%",0.789);
//        将小数点后格式化两位
        UseApplyPatternMethodFormat("###.###",123456.789);
//        将小数转换成千分数模式
        UseApplyPatternMethodFormat("0.00\u2030",0.789);

    }
}
