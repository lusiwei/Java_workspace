public class Test {
    public static void main(String[] args) {
        char a = '\u5362';
        System.out.println(a);
        System.out.println(max(0));
        System.out.println(max(0,2));
        System.out.println(max(0,2,4));
        System.out.println(max(0,2,4,5));
        System.out.println(factorial(100));
    }
//可变长度的参数
    public static int max(int min, int... a) {
        int max=min;
        for (int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }

//    递归函数
    public static long factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
