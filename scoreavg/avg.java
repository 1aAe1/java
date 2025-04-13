import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numScores = 10;

       
        System.out.println("Enter " + numScores + " scores:");
        for (int i = 0; i < numScores; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            sum += scanner.nextInt();
        }

        
        double average = (double) sum / numScores;
        System.out.println("Average score: " + average);

        
        if (average > 18) {
            System.out.println("Reward: *");
        } else {
            System.out.println("Punishment: -");
        }

        scanner.close();
    }
}
