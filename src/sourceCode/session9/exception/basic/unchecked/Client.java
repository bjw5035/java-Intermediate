package src.sourceCode.session9.exception.basic.unchecked;

public class Client {

    public void call() {
        throw new MyUncheckedException("ex");
    }

}
