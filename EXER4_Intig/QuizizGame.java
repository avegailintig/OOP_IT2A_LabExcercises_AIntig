public class QuizizGame {
    protected String subject;
    protected String difficultyLevel;

    public Quiz(String gameName, int totalQuestions, String subject, String difficultyLevel) {
        super(gameName, totalQuestions);
        this.subject = subject;
        this.difficultyLevel = difficultyLevel;
    }

    // Overridden method
    @Override
    public void displayInfo() {
        System.out.println("Quiz Subject: " + subject);
        System.out.println("Difficulty Level: " + difficultyLevel);
    }
}
