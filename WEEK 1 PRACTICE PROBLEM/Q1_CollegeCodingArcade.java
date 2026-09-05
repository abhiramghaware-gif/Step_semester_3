import java.util.Random;
import java.util.Scanner;

public class Q1_CollegeCodingArcade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] options = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        
        int wins = 0, losses = 0, draws = 0;
        int rounds = 5;
        
        System.out.println("Starting 5 rounds of Rock-Paper-Scissors!");
        for (int i = 1; i <= rounds; i++) {
            System.out.print("Round " + i + " - Enter Rock, Paper, or Scissors: ");
            String playerMove = scanner.nextLine();
            String computerMove = options[random.nextInt(3)];
            
            String result = playRound(playerMove, computerMove);
            System.out.println("Round " + i + " Player: " + playerMove + ", Computer: " + computerMove + " | " + result);
            
            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
        }
        
        double winPercentage = ((double) wins / rounds) * 100;
        System.out.printf("Final Summary (after %d rounds) | Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%\n", 
                          rounds, wins, losses, draws, winPercentage);
        scanner.close();
    }

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) return "Draw";
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equalsIgnoreCase("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equalsIgnoreCase("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }
}