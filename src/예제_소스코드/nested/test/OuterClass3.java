package src.예제_소스코드.nested.test;

public class OuterClass3 {
    public void myMethod() {

        class LocalClass {
            public void hello() {
                System.out.println("LocalClass.hello");
            }
        }

        LocalClass local = new LocalClass();
        local.hello();
    }
}
