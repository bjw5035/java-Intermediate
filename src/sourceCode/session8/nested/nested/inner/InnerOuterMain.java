package src.sourceCode.session8.nested.nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.inner inner = outer.new inner();
        inner.print();

        System.out.println(inner.getClass());

    }

}
