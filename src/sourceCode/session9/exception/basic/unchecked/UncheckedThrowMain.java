package src.sourceCode.session9.exception.basic.unchecked;

import src.sourceCode.session9.exception.basic.checked.MyCheckedException;

public class UncheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }

}
