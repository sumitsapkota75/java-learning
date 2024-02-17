public class Strings {
    public static void main(String[] args){
        String greetings = "Hello from the other side";
        String audience = "hello";
        System.out.println(greetings);
        // prints the length of the string
        System.out.println("String length:" + greetings.length());
        // convert string to uppercase
        System.out.println("String in uppercase:" + greetings.toUpperCase());
        // concatenate
        System.out.println("Concatenated:" + greetings.concat(" "+audience));
        // replace
        System.out.println("Replace \\l\" with \'x\' " + greetings.replace("l", "x"));

        // index of
        System.out.println("Index of " + greetings.indexOf("from"));
    }
}
