package cn.itcast.demo2;

public class DemoDiGui {
    public static void main(String[] args) {
       //  a();
        b(1);//23976
    }

    private static void b(int i ) {
        System.out.println(i);
        if(i==10000){
            return;
        }
b(++i);
    }

    private static void a() {
        System.out.println("a方法");
        a();
    }
}
