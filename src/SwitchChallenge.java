public class SwitchChallenge {
    public static void main(String[] args) {
        char natoLetters = 'd';
        switch (Character.toUpperCase(natoLetters)){
            case 'A':
                System.out.println("Alpha");
                break;
            case 'B':
                System.out.println("Bravo");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Delta");
                break;
            case 'E':
                System.out.println("Echo");
                break;
            default:
                System.out.println("Could not be found in the Nato alphabet");
        }

        printDayOfThWeek(9);
        printWeekDay(5);
    }

    public static void printDayOfThWeek(int day){
        switch (day){
            case 0 -> System.out.println("Monday");
            case 1 -> System.out.println("Tuesday");
            case 2 -> System.out.println("Wednesday");
            case 3 -> System.out.println("Thursday");
            case 4 -> System.out.println("Friday");
            case 5 -> System.out.println("Saturday");
            case 6 -> System.out.println("Sunday");
            default -> {
                System.out.println("Invalid Day");
            }
        }
    }

    public static void printWeekDay(int day){
        if (day == 0){
            System.out.println("Monday");
        } else if(day == 1){
            System.out.println("Tuesday");
        }else if (day == 2){
            System.out.println("Wednesday");
        }else if(day == 3){
            System.out.println("Thursday");
        } else if(day == 4){
            System.out.println("Friday");
        }else if (day == 5){
            System.out.println("Saturday");
        }else if(day == 6){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Day");
        }
    }
}
