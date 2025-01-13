package src.예제_소스코드.lang.wrapper;

public class AutoboxingMain2 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
