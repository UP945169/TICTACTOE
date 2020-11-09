import java.util.Scanner;

public class TicTacToe {

    Scanner input = new Scanner(System.in);
    int NUMROW = 3;
    int NUMCOLUMN = 3;

    PlayerMove[][] GRID = new PlayerMove[NUMROW][NUMCOLUMN];

    public enum PlayerMove{
        X,O,EMPTY;
    }

    public void PlayerXMove(){
        System.out.println("What X coordinate do you want?");
        int ROW = input.nextInt();
        System.out.println("What Y coordinate do you want?");
        int COLUMN = input.nextInt();
        if(GRID[ROW][COLUMN] == PlayerMove.EMPTY){
            GRID[ROW][COLUMN] = PlayerMove.X;
        }
        else{
            System.out.println("Please try again");
            PlayerXMove();
        }
        SHOWGrid();
    }

    public void PlayerOMove(){
        System.out.println("Please Switch to player 2");

        System.out.println("What X coordinate do you want?");
        int ROW = input.nextInt();
        System.out.println("What Y coordinate do you want?");
        int COLUMN = input.nextInt();
        GRID[ROW][COLUMN] = PlayerMove.O;
        if(GRID[ROW][COLUMN] == PlayerMove.EMPTY){
            GRID[ROW][COLUMN] = PlayerMove.O;
        }
        else {
            System.out.println("Please try again");
            PlayerOMove();
        }
        SHOWGrid();
    }

    public void SHOWGrid(){
        for(int row=0;row<GRID.length;row++){
            for(int column=0;column<GRID[row].length;column++){
                System.out.printf("%6s ", GRID[row][column]);
            }
            System.out.println();
        }
    }

    public void FillGrid(){
        for(int row=0;row<GRID.length;row++){
            for(int column=0;column<GRID[row].length;column++){
                GRID[row][column] = PlayerMove.EMPTY;
            }
        }
    }
}
