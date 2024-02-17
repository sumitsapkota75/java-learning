public class Methods {
    
    public static int getAge(String name, int age) {
        System.out.println("My name is "+name+  "Age is: " + age);
        return age;
    }

    // operator overloading
    public static double getAge(double a, double b) {
        return a*b;
    }

    public static void main(String[] args) {
        int age = getAge("sumit", 20);
        System.out.println(age);

        double ageInDouble = getAge(2.1, 1.9);
        System.out.println(ageInDouble);
    }
}
