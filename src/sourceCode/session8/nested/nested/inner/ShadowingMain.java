package src.sourceCode.session8.nested.nested.inner;

public class ShadowingMain {

    public int value = 1;

    class inner {
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain shadowingMain = new ShadowingMain();
        inner inner = shadowingMain.new inner();
        inner.go();
    }



}
