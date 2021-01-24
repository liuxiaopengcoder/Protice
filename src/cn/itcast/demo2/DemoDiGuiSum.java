package cn.itcast.demo2;

public class DemoDiGuiSum {
    public static void main(String[] args) {
     int s = sum(4);
        System.out.println(s);
    }

    public static int sum(int n ){
        if(n==1){
            return 1;
        }
        return n * sum(n-1);
    }
}
