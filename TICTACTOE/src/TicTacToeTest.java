import java.util.Scanner;

public class TicTacToeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TicTacToe TcTc = new TicTacToe();
        TcTc.FillGrid();
        TcTc.SHOWGrid();
        for(int i=1;i<9;i++){
            TcTc.PlayerXMove();
            TcTc.PlayerOMove();
        }
    }
}
