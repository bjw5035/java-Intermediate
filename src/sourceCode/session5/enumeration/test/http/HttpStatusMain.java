package src.sourceCode.session5.enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter HTTP status code: ");
        int status = scanner.nextInt();

        HttpStatus httpStatus = HttpStatus.findByCode(status);
        if (httpStatus == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println(httpStatus.getCode() + " " + httpStatus.getMessage());
            System.out.println("isSuccess = " + httpStatus.isSuccess());
        }
    }

}
