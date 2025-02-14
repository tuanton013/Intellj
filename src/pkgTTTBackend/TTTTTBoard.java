package pkgTTTBackend;

public class TTTTTBoard {
    private char machine_char = 'M';
    private final int ROW = 3;
    private final int COL = 3;
    private int totalValidentries;
    private char winner_char;
    private char defualt_char = ' ';
    private char[][] ttt_board = new char[ROW][COL];
    private char player_char = 'P';

    public char[][] getBoard() {
        return ttt_board;
    }

    public void testPlay() {

    }

    public void clearBoard() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                ttt_board[i][j] = defualt_char;
            }
        }
    }

}
