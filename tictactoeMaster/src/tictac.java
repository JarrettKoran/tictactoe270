import java.util.Scanner;


public class TicTacToe {

    Scanner input = new Scanner(System.in);

    public enum status{WIN,DRAW,CONTINUE};

    public static int BOARDSIZE = 3;

    private char[][] board = new char[BOARDSIZE][BOARDSIZE];

    public boolean firstPlayer = false;
    public boolean gameOver;

    public static void main(String[] args)
    {

        board = {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '};

        while(gamesStatus() == CONTINUE)
        {
            firstPlayer = !firstPlayer;
            play();
        }
        if(gamesStatus() == WIN)
        {
            if(firstPlayer)
                System.out.println("Player X Wins!");
            else
                System.out.println("Player O Wins!");
        }
        else if (gamesStatus() == DRAW)
            System.out.println("Its a draw :/");


    }


}

    public void play()
    {
        int row;
        int column;



        do{
            if(firstPlayer)
            {
                System.out.println("Player X's Turn");
                System.out.println("Player X's Turn: Enter Row (0,1 or 2): ");
                row = input.nextInt();
                System.out.println("Player X's Turn: Enter Column (0,1 or 2):")
                column = input.nextInt();
            }
            else
            {
                System.out.println("Player O's Turn");
                System.out.println("Player O's Turn: Enter Row (0,1 or 2): ");
                row = input.nextInt();
                System.out.println("Player O's Turn: Enter Column (0,1 or 2):")
                column = input.nextInt();
            }

        }while(!validMove(row, column));
    }

    public boolean printStatus(int player)
    {



    }

    /*
                public status gameStatus()
                {
                  status gameStat;



                  return gameStat;
                }
    */
    public void printBoard()
    {
        System.out.println("-------------");

        for(int i = 0; i < 3; i++)
        {
            System.out.println("| ");
            for(int z = 0; j < 3; z++)
            {
                System.out.println(board[i][j] + " | ");
            }
        }

        System.out.println();
        System.out.println("-------------");
    }

    public void printSymbol(int column, char value)
    {

    }

    //This method will check if it's a valid move
    public boolean validMove(int row,int column)
    {
        if(board[row][column] == ' ')
            return true;
        else
        {
            System.out.println("That is not a valid move!");
            return false;
        }
    }

}
