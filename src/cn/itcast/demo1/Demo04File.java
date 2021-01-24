package cn.itcast.demo1;

import java.io.File;

public class Demo04File {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        File f1 = new File("C:\\Users\\86159\\IdeaProjects\\Day_File\\src\\cn\\itcast\\aa");
        boolean d = f1.delete();
        System.out.println(d);
    }

    private static void show01() {
        File f1 = new File("C:\\Users\\86159\\IdeaProjects\\Day_File\\src\\cn\\itcast\\aa");
        boolean m = f1.mkdir();
        System.out.println(m);
    }
}
