package src.sourceCode.session9.nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainv2 {

    public static void Dice() {

        System.out.println("프로그램 시작");

        int i = new Random().nextInt();
        System.out.println(i);

        System.out.println("프로그램 종료");
    }

    public static void Sum() {
        System.out.println("프로그램 시작");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

    }

}
