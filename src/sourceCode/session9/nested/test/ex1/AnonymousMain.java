package src.sourceCode.session9.nested.test.ex1;

public class AnonymousMain {

    public static void main(String[] args) {

        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };

        hello.hello();

    }

}
