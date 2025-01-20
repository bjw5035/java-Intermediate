package src.sourceCode.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()�� Object Ŭ������ �޼���
        String string = child.toString();
        System.out.println(string);
    }

}
