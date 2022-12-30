public class IfThenStatements {
    public static void main(String[] args) {

        CalculateScore(true, 800, 5, 100);
        CalculateScore(true, 10000, 8, 200);

        displayHighScorePosition("Tim", highScorePosition(1500));
        displayHighScorePosition("Tim", highScorePosition(999));
        displayHighScorePosition("Tim", highScorePosition(499));
        displayHighScorePosition("Tim", highScorePosition(99));
        displayHighScorePosition("Tim", highScorePosition(-111));

    }

    public static void CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Final Score: " + finalScore);
        }
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into " + playerPosition + "on the high score list");
    }

    public static int highScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore < 1000 && playerScore >= 500) {
            position = 2;
        } else if (playerScore <= 500 && playerScore >= 100) {
            position = 3;
        }
        return position;

    }

}
