package src.sourceCode.session7.nested.nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class inner {
        private int innerInstanceValue = 1;

        public void print() {
            System.out.println(innerInstanceValue);
            System.out.println(outInstanceValue);
            System.out.println(outClassValue);
        }

    }

}
