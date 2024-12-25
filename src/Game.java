import java.util.Scanner;

public class Game {
    private int score;
    private int targetScore;
    private Dice dice1, dice2;

    Game(){
        dice1 = new Dice();
        dice2 = new Dice();
        score = 0;
        targetScore = 0;
    }

    public void rollTwoDice(){
        dice1.roll();
        dice2.roll();
    }

    public void displayResults(){
        System.out.println("Dice 1: " + dice1.getValue());
        System.out.println("Dice 2: " + dice2.getValue());
        System.out.println("Current Score: " + score);
        System.out.println("Target Score: " + targetScore);

    }

    public void recalculateScore(){
        score += dice1.getValue() + dice2.getValue();
    }

    private void checkWin(){
        if (score == targetScore){
            System.out.println("Congrats! You Won!");
        } else if (score > targetScore) {
            System.out.println("Sorry, you lost :(");

        }
    }

    public void startGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Dice Game!");
        System.out.println("Enter the target score to win: ");
        targetScore = scanner.nextInt();
        scanner.nextLine();

        while(score < targetScore){
            System.out.println("Press 'r' to roll the dices, 's' to stop: ");
            String answer = scanner.nextLine();

            if(answer.equals("r")){
                rollTwoDice();
                recalculateScore();
                displayResults();
                checkWin();

            }
            else if (answer.equals("s")){
                System.out.println("You stopped.");
                displayResults();
                break;
            }
        }
        scanner.close();
    }
}
