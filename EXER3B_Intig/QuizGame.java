public class QuizGame {
    private String gameName;
    private int totalQuestions;

    public QuizGame(String gameName, int totalQuestions) {
        this.gameName = gameName;
        this.totalQuestions = totalQuestions;
    }

    public String getGameName() {
        return gameName;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    // 👇 Polymorphism (Overridden by subclasses)
    public void displayInfo() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Total Questions: " + totalQuestions);
    }
}