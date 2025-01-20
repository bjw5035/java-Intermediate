package src.sourceCode.lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {

        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        System.out.println("identity = " + (userV1 == userV2));
        System.out.println("identity = " + (userV1.equals(userV2)));
    }

}
