package src.sourceCode.enumeration.lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxed = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxed = " + unboxed);

    }

}
