import com.sun.jdi.IncompatibleThreadStateException;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1756, 3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double paramOne, double paramTwo){

        int intParamOne = (int) (paramOne * 1000);
        int intParamTwo = (int)(paramTwo * 1000);

        if (intParamOne == intParamTwo){
            return true;
        }

        return false;
    }
}
