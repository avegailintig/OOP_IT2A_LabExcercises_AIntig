public class MathQuiz extends Quiz {
    private int timeLimit;

    public MathQuiz(String gameName, int totalQuestions, String subject, String difficultyLevel, int timeLimit) {
        super(gameName, totalQuestions, subject, difficultyLevel);
        this.timeLimit = timeLimit;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    // 🔁 Overriding displayInfo()
    @Override
    public void displayInfo() {
        System.out.println("Math Quiz Details:");
        System.out.println("Subject: " + getSubject());
        System.out.println("Difficulty: " + getDifficultyLevel());
        System.out.println("Time Limit: " + timeLimit + " seconds");
    }
}