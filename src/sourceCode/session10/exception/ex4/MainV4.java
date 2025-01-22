package src.sourceCode.session10.exception.ex4;

import java.util.Scanner;
import src.sourceCode.session10.exception.ex4.exception.ConnectExceptionV4;
import src.sourceCode.session10.exception.ex4.exception.SendExceptionV4;

public class MainV4 {

    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            }catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지 : 문제 발생");
        System.out.println("=== 개발자용 디버깅 메시지 ===");
        e.printStackTrace(System.out);

        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 메시지 : " + sendEx.getMessage());
        } else if (e instanceof ConnectExceptionV4 conEx) {
            System.out.println("[연결 오류] 메시지 : " + conEx.getMessage());
        }
    }
}
