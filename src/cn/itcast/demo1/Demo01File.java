package cn.itcast.demo1;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
       // show02("c：\\","a.txt");
        show03();
    }

    private static void show03() {

    }

    private static void show02(String parent, String child) {
        File f = new File(parent,child);
        System.out.println(f);
    }

    private static void show01() {
        File f1 = new File("C:\\Users\\86159\\IdeaProjects\\Day_File\\src\\cn\\itcast\\demo1");
        System.out.println(f1);
        File f2 = new File("b.txt");
    }
}
