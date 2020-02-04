import java.util.Scanner;

public class TicTacToe {

    public static Scanner input = new Scanner(System.in);

    public enum status{WIN,DRAW,CONTINUE};



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

        if(firstPlayer)
            board[row][column] = 'X';
        else
            board[row][column] = 'O';

        printBoard();
    }

    public static status gameStatus()
    {
        status gameState = null;

        char c1 = '\u0000';
        for(int i=0;i<3;i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (board[i][j] == c1) {
                    gameState = status.CONTINUE;
                    return (gameState);
                } else if(checkWin(i,j)){
                    gameState = status.WIN;
                    return (gameState);
                }
            }
        }

        gameState = status.DRAW;

        return (gameState);
    }

    public static boolean checkWin(int row,int column)
    {
        char c1 = '\u0000';

        if(board[row][0] == board[row][1] && board[row][0] == board[row][2] && board[row][0] != c1)
            return true;
        if(board[0][column] == board[1][column] && board[0][column] == board[2][column] && board[1][column] != c1)
            return true;
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != c1)
            return true;
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != c1)
            return true;

        return false;
    }

    public static void printBoard()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.print("|");
            for (int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }

    //This method will check if it's a valid move
    public static boolean validMove(int row,int column)
    {
        if(row > 2 || column > 2)
        {
            System.out.println("That is not a valid move!");
            return false;
        }
        char c1 = '\u0000';
        if(board[row][column] == c1)
            return true;
        else
        {
            System.out.println("That is not a valid move!");
            return false;
        }
    }

}

