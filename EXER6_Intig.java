import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ArithmeticGame extends JFrame {
    private JLabel leftLabel, rightLabel, opLabel, correctLabel, incorrectLabel, commentLabel;
    private JTextField answerField;
    private JRadioButton addBtn, subBtn, mulBtn, divBtn, modBtn, level1, level2, level3;
    private int correct = 0, incorrect = 0, left, right;
    private char op = '+';
    private final Random rand = new Random();

    public ArithmeticGame() {
        setTitle("Arithmetic Game");
        setSize(950, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(230, 240, 255));

        // === TITLE ===
        JLabel title = new JLabel("Practice Your Arithmetic!", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 30));
        title.setForeground(new Color(40, 70, 140));
        add(title, BorderLayout.NORTH);

        // === RIGHT PANEL: SCORE ===
        JPanel scorePanel = new JPanel(new GridLayout(2, 2, 5, 5));
        scorePanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(100, 130, 190), 2), "SCORE"));
        scorePanel.setBackground(Color.WHITE);
        scorePanel.setPreferredSize(new Dimension(180, 200));

        JLabel correctText = new JLabel("CORRECT", SwingConstants.CENTER);
        JLabel incorrectText = new JLabel("INCORRECT", SwingConstants.CENTER);
        correctText.setFont(new Font("SansSerif", Font.BOLD, 16));
        incorrectText.setFont(new Font("SansSerif", Font.BOLD, 16));
        correctText.setForeground(new Color(60, 180, 75));
        incorrectText.setForeground(new Color(200, 60, 60));

        correctLabel = new JLabel("0", SwingConstants.CENTER);
        incorrectLabel = new JLabel("0", SwingConstants.CENTER);
        correctLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        incorrectLabel.setFont(new Font("SansSerif", Font.BOLD, 18));

        scorePanel.add(correctText);
        scorePanel.add(incorrectText);
        scorePanel.add(correctLabel);
        scorePanel.add(incorrectLabel);
        add(scorePanel, BorderLayout.EAST);

        // === CENTER PANEL ===
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(230, 240, 255));

        // Arithmetic problem
        JPanel problemPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 20));
        problemPanel.setBackground(new Color(230, 240, 255));

        leftLabel = makeBoxLabel("56");
        opLabel = makeBoxLabel("+");
        rightLabel = makeBoxLabel("46");
        JLabel eq = makeLabel("=");
        eq.setFont(new Font("SansSerif", Font.BOLD, 36));
        eq.setForeground(new Color(40, 70, 140));

        answerField = new JTextField(6);
        answerField.setFont(new Font("SansSerif", Font.BOLD, 30));
        answerField.setHorizontalAlignment(JTextField.CENTER);
        answerField.setBorder(BorderFactory.createLineBorder(new Color(100, 130, 190), 3));

        problemPanel.add(leftLabel);
        problemPanel.add(opLabel);
        problemPanel.add(rightLabel);
        problemPanel.add(eq);
        problemPanel.add(answerField);
        centerPanel.add(problemPanel);

        // === COMMENT BOX ===
        JPanel commentBox = new JPanel(new BorderLayout());
        commentBox.setBackground(new Color(230, 240, 255));
        commentBox.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(100, 130, 190), 2), "COMMENT"));
        commentLabel = new JLabel(" ", SwingConstants.CENTER);
        commentLabel.setFont(new Font("SansSerif", Font.BOLD, 18)); // Bigger text
        commentLabel.setForeground(new Color(80, 80, 80));
        commentBox.add(commentLabel, BorderLayout.CENTER);
        commentBox.setPreferredSize(new Dimension(400, 55)); // Small but visible
        centerPanel.add(commentBox);

        // === OPERATION + LEVEL BELOW COMMENT ===
        JPanel lowerOptions = new JPanel(new GridLayout(1, 2, 10, 10));
        lowerOptions.setBackground(new Color(230, 240, 255));

        JPanel opPanel = makeRadioPanel("OPERATIONS", new String[]{
                "ADDITION", "+", "SUBTRACTION", "-", "MULTIPLICATION", "*", "DIVISION", "/", "MODULO", "%"
        }, e -> generateProblem());

        JPanel lvlPanel = makeRadioPanel("LEVELS", new String[]{
                "LEVEL 1", "1", "LEVEL 2", "2", "LEVEL 3", "3"
        }, e -> generateProblem());

        lowerOptions.add(opPanel);
        lowerOptions.add(lvlPanel);
        centerPanel.add(lowerOptions);

        // === BUTTONS ===
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBackground(new Color(230, 240, 255));
        JButton submit = makeButton("SUBMIT", new Color(70, 130, 180));