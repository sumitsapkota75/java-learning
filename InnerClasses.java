public class InnerClasses {
    public static class OuterClass{
        int x = 10;
    } 
    public static class InnerClass{
        int y = 22;
    }
    public static void main(String[] args){
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = new InnerClass();
        System.out.println(outerClass.x+innerClass.y);
    }
}
