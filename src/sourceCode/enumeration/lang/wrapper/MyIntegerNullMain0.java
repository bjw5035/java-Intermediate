package src.sourceCode.enumeration.lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(finalValue(intArr, -1));
        System.out.println(finalValue(intArr, 0));
        System.out.println(finalValue(intArr, 1));
        System.out.println(finalValue(intArr, 100));

    }

    private static int finalValue(int[] intArr, int target) {
        for(int value : intArr) {
            if(value == target) {
                return value;
            }
        }
        return -1;
    }

}
