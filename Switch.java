public class Switch {
    public static void main(String[] args){
        int day = 1;
        String dayOfWeek;
        switch(day) {
            case 1:
                dayOfWeek = "Sun";
                System.out.println(dayOfWeek);
                break;
            case 2:
                dayOfWeek = "Mon";
                System.out.println(dayOfWeek);
                break;
            case 3:
                dayOfWeek = "Tue";
                System.out.println(dayOfWeek);
                break;
            default:
                System.out.println("Out of the bound");
        }
    }
}
