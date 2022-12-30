public class TeenNumberChecker {
    public static void main(String[] args) {

    }
    public static boolean hasTeen(int ageChildOne, int ageChildTwo, int ageChildThree){
        if ((ageChildOne >= 13 && ageChildOne <= 19) || (ageChildTwo >= 13 && ageChildTwo <= 19) || (ageChildThree >= 13 && ageChildThree <= 19)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int childAge){
        if (childAge >= 13 && childAge <= 19){
            return true;
        }
        return false;
    }

}
