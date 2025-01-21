package src.sourceCode.session8.nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        // 지역변수는 스택 영역(프레임)이 종료되는 순간 함께 제거된다.
        int localVar = 1;

        class LocalPrinter implements Printer {

            // 멤버변수
            final int value = 0;

            @Override
            public void print() {
                System.out.println(value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println(localVar);
                System.out.println(paramVar);
                System.out.println(outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuterV3 = new LocalOuterV4();
        Printer process = localOuterV3.process(2);
        process.print();

        System.out.println("필드 확인");
        Field[] declaredField = process.getClass().getDeclaredFields();
        for (Field field : declaredField) {
            System.out.println(field.getName());
        }
    }

}
