public class QuizGame {
    protected String gameName;
    protected int totalQuestions;

    public QuizGame(String gameName, int totalQuestions) {
        this.gameName = gameName;
        this.totalQuestions = totalQuestions;
    }

    // Polymorphic method
    public void displayInfo() {
        System.out.println("Game Name: " + gameName);
        System.out.println("Total Questions: " + totalQuestions);
    }
}
