public class EnglishQuiz extends Quiz {
    private int numberOfWords;

    public EnglishQuiz(String gameName, int totalQuestions, String subject, String difficultyLevel, int numberOfWords) {
        super(gameName, totalQuestions, subject, difficultyLevel);
        this.numberOfWords = numberOfWords;
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    // 🔁 Overriding
    @Override
    public void displayInfo() {
        System.out.println("English Quiz Details:");
        System.out.println("Subject: " + getSubject());
        System.out.println("Difficulty: " + getDifficultyLevel());
        System.out.println("Number of Words: " + numberOfWords);
    }
}