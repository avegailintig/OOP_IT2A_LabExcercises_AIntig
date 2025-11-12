public class Quiz extends QuizGame {
    private String subject;
    private String difficultyLevel;

    public Quiz(String gameName, int totalQuestions, String subject, String difficultyLevel) {
        super(gameName, totalQuestions);
        this.subject = subject;
        this.difficultyLevel = difficultyLevel;
    }

    public String getSubject() {
        return subject;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    // 🔁 Overriding
    @Override
    public void displayInfo() {
        System.out.println("Quiz Subject: " + subject);
        System.out.println("Difficulty: " + difficultyLevel);
    }
}
