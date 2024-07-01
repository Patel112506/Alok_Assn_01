import java.util.Scanner;

public class Assn_One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;
        String playerAMove, playerBMove;

        while (playAgain) {
            playerAMove = getPlayerMove(in, "Player A");
            playerBMove = getPlayerMove(in, "Player B");

            // Display results
            displayResults(playerAMove, playerBMove);

            // Prompt to play again
            System.out.print("Do you want to play again? (Y/N): ");
            String response = in.nextLine().trim().toUpperCase();
            if (!response.equals("Y")) {
                playAgain = false;
            }
        }
        in.close();
    }

    private static String getPlayerMove(Scanner in, String player) {
        String move = "";
        boolean validMove = false;

        do {
            System.out.print(player + ", enter your move (R, P, S): ");
            move = in.nextLine().trim().toUpperCase();
            if (move.equals("R") || move.equals("P") || move.equals("S")) {
                validMove = true;
            } else {
                System.out.println("Invalid move. Please enter R, P, or S.");
            }
        } while (!validMove);

        return move;
    }

    private static void displayResults(String playerAMove, String playerBMove) {
        if (playerAMove.equals(playerBMove)) {
            System.out.println(playerAMove + " vs " + playerBMove + " it's a Tie!");
        } else if (playerAMove.equals("R")) {
            if (playerBMove.equals("S")) {
                System.out.println("Rock breaks Scissors. Player A wins!");
            } else {
                System.out.println("Paper covers Rock. Player B wins!");
            }
        } else if (playerAMove.equals("P")) {
            if (playerBMove.equals("R")) {
                System.out.println("Paper covers Rock. Player A wins!");
            } else {
                System.out.println("Scissors cuts Paper. Player B wins!");
            }
        } else if (playerAMove.equals("S")) {
            if (playerBMove.equals("P")) {
                System.out.println("Scissors cuts Paper. Player A wins!");
            } else {
                System.out.println("Rock breaks Scissors. Player B wins!");
            }
        }
    }
}
