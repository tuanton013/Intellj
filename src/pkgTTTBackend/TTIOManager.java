package pkgTTTBackend;

import java.util.Scanner;

public class TTIOManager {
    private TTIOManager(){

    }

    private Scanner myScanner = new Scanner(System.in);

    public void cellNotFreeMessage(int row, int col){
        System.out.println("Cell [" + row + "][" + col + "] is not free. Try again.");
    }
}
