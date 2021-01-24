package cn.itcast.demo1;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
     File f1 = new File("C:\\Users\\86159\\IdeaProjects\\Day_File\\src\\cn\\itcast");
        System.out.println(f1.isDirectory());
    }

    private static void show01() {
        File f1 = new File("C:\\Users\\86159\\IdeaProjects\\Day_File\\src\\cn\\itcast");
        System.out.println(f1.exists());
    }

}
