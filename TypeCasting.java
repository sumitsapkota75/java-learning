public class TypeCasting {
    public static void main(String[] args){
        int price = 3;
        System.out.println("Price:" + price);
        price++;
        System.out.println("Price with ++ operator:" + price);
        double priceInDouble = price;
        System.out.println("priceInDouble:" + priceInDouble);

        double salary = 123.50;
        System.out.println("Salary in double" + salary);
        
        int salaryInInt = (int) salary;
        
        System.out.println("Salary in int" + salaryInInt);


    }
}
