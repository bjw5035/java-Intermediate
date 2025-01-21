package src.sourceCode.session9.nested.test;

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
