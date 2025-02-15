package pkgTTTBackend;

import java.sql.SQLOutput;

import static pkgTTTBackend.TTIOManager.printBoard;

public class TTTTTBoard {
    private char machine_char = 'M';
    private final int ROW = 3;
    private final int COL = 3;
    private int totalValidentries;
    private char winner_char;
    private char defualt_char = '-';
    private char[][] ttt_board = new char[ROW][COL];
    private char player_char = 'P';



    public TTTTTBoard() {
        totalValidentries = 0;
        winner_char = defualt_char;
        clearBoard();

    }

    public char[][] getBoard() {
        return ttt_board;
    }

    public void testPlay() {
        int [] rows = {0, 1, 2, 1, 0, 0, 1, 1, 2, 2};
        int [] cols = {0, 1, 2, 1, 1, 2, 0, 2, 0, 1};
        int row;
        int col;
        while (totalValidentries < ROW * COL) {
            for(int i = 0; i < 10; i++){
                row = rows[i];
                col = cols[i];
                if (updateBoard(row, col)) {
                    TTIOManager.printBoard(this);
                }else {
                    System.out.println();
                    System.out.println(("Attempt to fill cell [" + row + "][" + col + "] which is already filled."));
                    System.out.println("cell [" + row + "][" + col + "] is not available. Try again.");
                }
            }
        }
    }

    public void clearBoard() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                ttt_board[i][j] = defualt_char;
            }
        }
        totalValidentries = 0;
    }

    private boolean updateBoard(int row, int col){
        if (ttt_board[row][col] == defualt_char) {
            ttt_board[row][col] = player_char;
            totalValidentries++;
            return true;
        }
        return false;
    }

    public void play(){
        TTIOManager.printBoard(this);
        int row;
        int col;
        while (totalValidentries < ROW * COL) {
            TTIOManager.rowColPrompt();
            row = TTIOManager.readIntegerInput(0, ROW - 1);
            col = TTIOManager.readIntegerInput(0, COL - 1);
            if (updateBoard(row, col)) {
                TTIOManager.printBoard(this);
            } else {
                TTIOManager.cellNotFreeMessage(row, col);
            }

            if(totalValidentries == ROW * COL){
                TTIOManager.boardCompleteMessage();
                break;
            }

            if(TTIOManager.readQuitInput()){
                TTIOManager.QuitGameMessage();
                break;
            }
        }

    }
}
