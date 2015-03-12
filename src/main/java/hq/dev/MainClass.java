package hq.dev;

/**
 * Created by hanqing on 2015/3/12.
 */
public class MainClass {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        ClassA a = new ClassA();
        System.out.println(String.format("%d", a.plus(1, 2)));
    }
}
