import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String player1_choice = "Rock";
        String player2_choice = "Scissors";

        // Determine the winner
        String result;
        if (determineWinner(player1_choice, player2_choice)) {
            System.out.println("Player 1 Wins");
        } else {
            System.out.println("Player 2 Wins");
        }
    }

    private static boolean determineWinner(String choice1, String choice2) {
        if (choice1.equals(choice2)) {
            return false; // It's a tie
        } else return (choice1.equals("Rock") && Objects.equals(choice2, "Scissors")) ||
                (choice1.equals("Paper") && Objects.equals(choice2, "Rock")) ||
                (choice1.equals("Scissors") && Objects.equals(choice2, "Paper")); // Player 2 wins
// It's a tie or Player 1 wins
    }
}