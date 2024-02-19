public class Polymorphism {
    public static class Animal{
        public void animalSound(){
            System.out.println("This is animal sound from Animal class");
        }
    }
    public static class Dogs extends Animal{
        public void animalSound(){
            System.out.println("This is animal sound from Dog class");
        }
    }
    public static class Cows extends Animal{
        public void animalSound(){
            System.out.println("This is animal sound from Cow class");
        }
    }
    public static class Pigs extends Animal{
        public void animalSound(){
            System.out.println("This is animal sound from Pigs class");
        }
    }

    public static void main(String[] args){
        Animal animal = new Animal();
        Animal cows = new Cows();
        Pigs pigs = new Pigs();
        animal.animalSound();
        cows.animalSound();
        pigs.animalSound();
    }
}
