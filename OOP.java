public class OOP {
    int x = 10;

    public OOP(){
        System.out.println("This is constructor...");
    }
    public static void main(String[] args) {
        OOP object = new OOP();
        System.out.println(object.x);
    }
}
