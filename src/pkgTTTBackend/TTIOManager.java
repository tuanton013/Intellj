package pkgTTTBackend;

import java.util.Scanner;

public class TTIOManager {
    private TTIOManager(){

    }

    private Scanner myScanner = new Scanner(System.in);

    public void cellNotFreeMessage(int row, int col){
        System.out.println("Cell [" + row + "][" + col + "] is not free. Try again.");
    }

    public void rowColPrompt(){
        System.out.print("Enter row and column numbers (0 2): ");
    }

    public boolean readQuitInput(){
        System.out.print("Do you want to quit? Enter q: ");
        String input = myScanner.next();
        return input.equals("q");
    }

    public void boardCompleteMessage(){
        System.out.println("Board is full. Game over.");
    }

    public int readIntegerInput(int lowerBound, int upperBound){
        int input;
        while (true) {
            input = myScanner.nextInt();
            if (input >= lowerBound && input <= upperBound) {
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
        return input;
    }

    public static void printBoard(TTTTTBoard board){
        char[][] boardArray = board.getBoard();
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(boardArray[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static void initPrompt(){
        System.out.println("Welcome to Tic Tac Toe!");
    }

    public void QuitGameMessage(){
        System.out.println("Thank you for playing! Come back to waste more of your time!");
    }

}
