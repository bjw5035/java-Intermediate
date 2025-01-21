package src.sourceCode.session9.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainv3 {


    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");

    }

    public static void main(String[] args) {

        Process dice = new Process() {
            @Override
            public void run() {
                int random = new Random().nextInt(6) + 1;
                System.out.println(random);
            }
        };

        Process sum = new Process() {

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(i);
                }
            }
        };

    }

}
