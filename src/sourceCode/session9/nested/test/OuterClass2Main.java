package src.sourceCode.session9.nested.test;

import src.sourceCode.session9.nested.test.OuterClass2.InnerClass;

public class OuterClass2Main {

    public static void main(String[] args) {
        OuterClass2 o = new OuterClass2();
        OuterClass2.InnerClass innerClass = o.new InnerClass();
//        InnerClass innerClass = o.new InnerClass();
        innerClass.hello();
    }
}
