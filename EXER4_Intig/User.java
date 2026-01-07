public class User extends QuizGame {
    private String username;
    private int score;

    public User(String gameName, int totalQuestions, String username, int score) {
        super(gameName, totalQuestions);
        this.username = username;
        this.score = score;
    }

    // Overriding
    @Override
    public void displayInfo() {
        System.out.println("User Info:");
        System.out.println("Username: " + username);
        System.out.println("Score: " + score);
    }

    // Overloading (Compile-time polymorphism)
    public void displayInfo(String message) {
        System.out.println(message + " " + username + " scored " + score);
    }
}
