public class IfElse {
    public static void main(String[] args) {
        int i = 5, j = 6, k = 2;

        // normal ifElse Condition
        if (i > j && i > k) {
            System.out.println("Maximum value is i");
        } else if (j > i && j > k) {
            System.out.println("Maximum value is j");
        } else {
            System.out.println("Maximum value is k");
        }

        // shorthand If-else
        int age = 10;
        String result = age > 20 ? "adult" : "Child";
        System.out.println(result);
    }
}
