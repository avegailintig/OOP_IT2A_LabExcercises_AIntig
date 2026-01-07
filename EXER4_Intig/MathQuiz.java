public class MathQuiz extends Quiz {
    private int timeLimit;

    public MathQuiz(String gameName, int totalQuestions, String subject, String difficultyLevel, int timeLimit) {
        super(gameName, totalQuestions, subject, difficultyLevel);
        this.timeLimit = timeLimit;
    }

    // Runtime Polymorphism
    @Override
    public void displayInfo() {
        System.out.println("Math Quiz Details:");
        System.out.println("Subject: " + subject);
        System.out.println("Difficulty: " + difficultyLevel);
        System.out.println("Time Limit: " + timeLimit + " seconds");
    }
}
