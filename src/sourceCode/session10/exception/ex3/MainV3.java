package src.sourceCode.session10.exception.ex3;

import java.util.Scanner;
import src.sourceCode.session10.exception.ex2.NetworkClientExceptionV2;

public class MainV3 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
