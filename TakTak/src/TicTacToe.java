import java.util.Scanner;

public class TicTacToe {

    public static Scanner input = new Scanner(System.in);

    public enum status{WIN,DRAW,CONTINUE};

    public static status gameState = status.CONTINUE;

    public static int BOARDSIZE = 3;

    private static char[][] board = new char[BOARDSIZE][BOARDSIZE];

    public static boolean firstPlayer = false;
    public static boolean gameOver;

    public static void main(String[] args)
    {

        while(gameStatus() == status.CONTINUE)
        {
            firstPlayer = !firstPlayer;
            play();
        }
        if(gameStatus() == status.WIN)
        {
            if(firstPlayer)
                System.out.println("Player X Wins!");
            else
                System.out.println("Player O Wins!");
        }
        else if (gameStatus() == status.DRAW)
            System.out.println("Its a draw :/");


    }

    public static void play()
    {
        int row;
        int column;

        boolean replay = false;

        do{
            if(firstPlayer)
            {
                System.out.println("Player X's Turn");
                System.out.println("Player X's Turn: Enter Row (0,1 or 2): ");
                row = input.nextInt();
                System.out.println("Player X's Turn: Enter Column (0,1 or 2):");
                column = input.nextInt();
            }
            else
            {
                System.out.println("Player O's Turn");
                System.out.println("Player O's Turn: Enter Row (0,1 or 2): ");
                row = input.nextInt();
                System.out.println("Player O's Turn: Enter Column (0,1 or 2):");
                column = input.nextInt();
            }

            if(validMove(row,column))
                replay = false;
            else
                replay = true;

        }while(replay);
    }

    public static int printStatus(int player)
    {


        return (0);
    }

    public static status gameStatus()
    {
        return (gameState);
    }

    public static void printBoard()
    {
        System.out.println("-------------");

        for(int i = 0; i < 3; i++)
        {
            System.out.print("| ");
            for(int z = 0; z < 3; z++)
            {
                System.out.print(board[i][z] + " | ");
            }
        }

        System.out.println();
        System.out.println("-------------");
    }

    public static void printSymbol(int column, char value)
    {

    }

    //This method will check if it's a valid move
    public static boolean validMove(int row,int column)
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

