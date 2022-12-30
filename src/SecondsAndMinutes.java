public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int seconds) {
        int minutes = seconds / 60;

        if (seconds >= 0) {
            return getDurationString(minutes, seconds);
        } else {
            return "First Override, Invalid Parameters Provided!";
        }

    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds >= 0 && (seconds % 60) <= 59 && minutes >= 0) {
            return (minutes / 60) + "h " + (minutes % 60) + "m " + seconds % 60 + "s";
        } else {
            return "Second Override Invalid Parameters Provided";
        }
    }
}
