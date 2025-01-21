package src.sourceCode.session4.lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {

        String str = "100";

        // String -> Integer
        Integer integer1 = Integer.valueOf(str);
        System.out.println(integer1);

        // Integer -> int
        int intValue = integer1;
        System.out.println(intValue);

        // int -> Integer
        Integer integer2 = intValue;
        System.out.println(integer2);
    }

}
