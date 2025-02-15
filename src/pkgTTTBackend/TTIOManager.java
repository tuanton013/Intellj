package pkgTTTBackend;

import java.util.Scanner;

public class TTIOManager {
    private TTIOManager(){

    }

    private static Scanner myScanner = new Scanner(System.in);

    public static void cellNotFreeMessage(int row, int col){
        System.out.println("Cell [" + row + "][" + col + "] is not free. Try again.");
    }

    public static void rowColPrompt(){
        System.out.print("Enter row and column numbers (0 2): ");
    }

    public static boolean readQuitInput(){
        System.out.println("Enter 'q' to quit the game or press any single character to conitnue: .");
        String input = myScanner.next();
        return input.equals("q");
    }

    public static void boardCompleteMessage(){
        System.out.println("Board is full. Game over.");
    }

    public static int readIntegerInput(int lowerBound, int upperBound){
        int input;
        while (true){
            input = myScanner.nextInt();
            if(input >= lowerBound && input <= upperBound)
                break;
            else
                System.out.println("Invalid input. Try again.");
        }
        return input;
    }

    public static void printBoard(TTTTTBoard board){
        char[][] boardArray = board.getBoard();
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(boardArray[i][j]+ "  ");
            }
            System.out.println();
        }
    }

    public static void initPrompt(){
        System.out.println("Welcome to Tic Tac Toe!");
    }

    public static void QuitGameMessage(){
        System.out.println("Thank you for playing! Come back to waste more of your time!");
    }

}
