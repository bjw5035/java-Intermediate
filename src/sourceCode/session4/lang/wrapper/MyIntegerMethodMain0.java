package src.sourceCode.session4.lang.wrapper;

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        int value = 10;
        int t1 = compareTo(value, 5);
        int t2 = compareTo(value, 10);
        int t3 = compareTo(value, 20);
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
    }

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        }else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

}
