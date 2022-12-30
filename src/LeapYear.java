public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(1800);
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
           if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0){
               System.out.println(true);
               return true;
           }
        }
        System.out.println(false);
        return false;
    }
}
