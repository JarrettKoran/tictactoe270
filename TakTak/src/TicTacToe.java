import java.util.Scanner; //java library for input

public class TicTacToe {

    public static Scanner input = new Scanner(System.in); //variable to use java input library

    public enum status{WIN,DRAW,CONTINUE}; //enumeration for gamestates

    public static int BOARDSIZE = 3;

    private static char[][] board = new char[BOARDSIZE][BOARDSIZE];

    public static boolean firstPlayer = false; //bool to determine turn if firstplayer == false then its second player's turn

    public static void main(String[] args)
    {
        while(gameStatus() == status.CONTINUE) //if the board isn't full and no one has won then continue playing
        {
            firstPlayer = !firstPlayer;
            play();
        }

        if(gameStatus() == status.WIN) //if a player has gotten 3 in a row end the game as a win
        {
            if(firstPlayer)
                System.out.println("Player 1 Wins!");
            else
                System.out.println("Player 2 Wins!");
        }
        else if (gameStatus() == status.DRAW) //if all possible spots are full and no one won end the game as a draw
            System.out.println("Its a draw :/");
    }
    public static void play()
    {
        int row;
        int column;
        boolean replay = false;

        do{
            if(firstPlayer) //if it is the first players turn add and X
            {
                System.out.println("Player X's Turn");
                System.out.println("Player X's Turn: Enter Row (0,1 or 2): ");
                row = input.nextInt(); //user input row val
                System.out.println("Player X's Turn: Enter Column (0,1 or 2):");
                column = input.nextInt(); //user input column val
            }
            else //if it is the first players turn add and O
            {
                System.out.println("Player O's Turn");
                System.out.println("Player O's Turn: Enter Row (0,1 or 2): ");
                row = input.nextInt(); //user input row val
                System.out.println("Player O's Turn: Enter Column (0,1 or 2):");
                column = input.nextInt(); //user input column val
            }

            if(validMove(row,column)) //check to see if the player made a valid move
                replay = false;
            else
                replay = true;
        }while(replay); //if the player makes an illegal move, make them replay

        if(firstPlayer)
            board[row][column] = 'X'; //fill position with P1 char 'X'
        else
            board[row][column] = 'O'; //fill position with P2 char 'O'
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
                if (board[i][j] == c1) { //if all spots are not full it is not a draw
                    gameState = status.CONTINUE;
                    return (gameState);
                } else if(checkWin(i,j)){ //calls function to see if the game has been won
                    gameState = status.WIN;
                    return (gameState);
                }
            }
        }
        gameState = status.DRAW; //if all spots are full then it is a draw
        return (gameState);
    }
    public static boolean checkWin(int row,int column)
    {
        char c1 = '\u0000';

        if(board[row][0] == board[row][1] && board[row][0] == board[row][2] && board[row][0] != c1) //Checks if current row is all same chars
            return true;
        if(board[0][column] == board[1][column] && board[0][column] == board[2][column] && board[1][column] != c1) //Checks if current column is all same chars
            return true;
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] != c1) //Checks if left diagonal is all same chars
            return true;
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] != c1) //Checks if right diagonal is all same chars
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

    public static boolean validMove(int row,int column)
    {
        if(row > 2 || column > 2) //Makes sure user doesn't choose a value too large for the array
        {
            System.out.println("That is not a valid move!");
            return false;
        }
        char c1 = '\u0000';
        if(board[row][column] == c1) //Makes sure the user picks an empty spot
            return true;
        else
        {
            System.out.println("That is not a valid move!");
            return false;
        }
    }
}

