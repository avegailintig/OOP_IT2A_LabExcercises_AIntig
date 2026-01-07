public class Leaderboard extends QuizGame {
    private String topPlayer;
    private int highScore;

    public Leaderboard(String gameName, int totalQuestions, String topPlayer, int highScore) {
        super(gameName, totalQuestions);
        this.topPlayer = topPlayer;
        this.highScore = highScore;
    }

    @Override
    public void displayInfo() {
        System.out.println("Leaderboard:");
        System.out.println("Top Player: " + topPlayer);
        System.out.println("High Score: " + highScore);
    }
}
