package src.sourceCode.session8.nested.test.ex1;

public class OuterClass3 {

    public void myMethod() {

        class LocalClass {

            public void Hello() {
                System.out.println("Hello LocalClass");
            }
        }

        LocalClass local = new LocalClass();
        local.Hello();

    }

}
