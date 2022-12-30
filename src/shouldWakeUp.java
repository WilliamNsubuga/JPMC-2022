public class shouldWakeUp {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(barking && hourOfDay >= 0) {
            if(hourOfDay < 8){
                System.out.println(true);
                return true;
            } else if (hourOfDay > 22 && hourOfDay < 23){
                System.out.println(true);
                return true;
            }
        }
        System.out.println( false);
        return false;
    }
}

