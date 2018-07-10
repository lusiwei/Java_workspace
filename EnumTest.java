//public class EnumTest {
//    //一、枚举类型第一种用法常量
//    public enum Color {
//        RED, GREEN, BLANK, YELLOW
//    }
//    public enum Colors {
//        RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);
//        // 成员变量
//        private String name;
//        private int index;
//        // 构造方法
//        Colors(String name, int index) {
//            this.name = name;
//            this.index = index;
//        }
//        // get set 方法
//        public String getName() {
//            return name;
//        }
//        public void setName(String name) {
//            this.name = name;
//        }
//        public int getIndex() {
//            return index;
//        }
//        public void setIndex(int index) {
//            this.index = index;
//        }
//    }
//    public static void main(String args[]){
//        //比较是否相等
//        if(Color.RED.equals(Color.YELLOW)){
//            System.out.println("色彩相等");
//        }else {
//            System.out.println("色彩不等");
//        }
//        //枚举类型的第二种用法
//        TrafficLight trafficLight = new TrafficLight();
//        trafficLight.change();
//        //类型的第三种用法
//        Colors.RED.setName("SAS");
//        Colors.RED.setIndex(1);
//        Colors.GREEN.getName();
//        Colors.GREEN.getIndex();
//        //Colors.valueOf("RSS",1);
//
//    }
//
//}