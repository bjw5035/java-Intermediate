package src.sourceCode.session3.lang.string.builder;

public class StringBuilderMain1_2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String st = sb.append("A").append("B").append("C").append("D").toString();
        System.out.println("st = " + st);

        sb.insert(4, "java");
        System.out.println("insert = " + sb);
    }

}
