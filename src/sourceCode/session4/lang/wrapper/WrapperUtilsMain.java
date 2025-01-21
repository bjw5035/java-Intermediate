package src.sourceCode.session4.lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10); // 숫자, 래퍼 객체 변환
        Integer i2 = Integer.valueOf("10"); // 문자열, 래퍼 객체 변환
        int i3 = Integer.parseInt("10"); // 문자열 전영, 기본형 변환

        //비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareresult = " + compareResult);

        // 산술 연산
        System.out.println("sum = " + Integer.sum(10, 20));
        System.out.println("sum = " + Integer.min(10, 20));
        System.out.println("sum = " + Integer.max(10, 20));
    }

}
