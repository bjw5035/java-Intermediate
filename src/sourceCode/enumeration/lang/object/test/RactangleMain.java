package src.sourceCode.enumeration.lang.object.test;

public class RactangleMain {

    public static void main(String[] args) {

        ExRectangle rect1 = new ExRectangle(100, 20);
        ExRectangle rect2 = new ExRectangle(100, 20);
        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
    }

}
