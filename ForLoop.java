public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j < 2; j++) {
                System.out.println("i: " + i + " j: " + j);
            }
        }

        String[] myList = {"sumit", "saroj", "sam"};
        for (String i: myList){
            System.out.println(i);
        }
    }
}
