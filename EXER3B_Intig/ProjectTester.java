public class ProjectTester {
    public static void main(String[] args) {

        // 🔹 Upcasting (Polymorphism)
        QuizGame player1 = new User("Educational Quiz Game", 10, "Jessa", 85);
        QuizGame math = new MathQuiz("Educational Quiz Game", 10, "Math", "Medium", 30);
        QuizGame english = new EnglishQuiz("Educational Quiz Game", 10, "English", "Easy", 20);
        QuizGame leaderboard = new Leaderboard("Educational Quiz Game", 10, "Jessa", 100);

        // 🔹 Dynamic Method Dispatch (Runtime Polymorphism)
        QuizGame[] quizGames = {player1, math, english, leaderboard};

        for (QuizGame q : quizGames) {
            System.out.println("\n==============================");
            q.displayInfo(); // Automatically calls the correct subclass method
        }

        // 🔹 Method Overloading Example
        System.out.println("\n==============================");
        User user2 = new User("Educational Quiz Game", 10, "Mark", 95);
        user2.displayInfo("🎉 Congratulations!");
    }
}