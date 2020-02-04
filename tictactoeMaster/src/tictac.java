public class tictac {

    public enum status{WIN,DRAW,CONTINUE};

    public boolean firstPlayer;
    public boolean gameOver;

    public static void main(String[] args)
    {
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        for(char[] row: gameBoard) {
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
    }

    public void play()
    {
        if(firstPlayer)
        {
            System.out.println("Player X's Turn");
            System.out.println("Player X's Turn: Enter Row (0,1 or 2): ");

        }
    }

    public boolean printStatus(int player)
    {

    }

    public status gameStatus()
    {

    }

    public void printSymbol(int column, char value)
    {


            return c;
    }

    public boolean validMove(int row,int column)
    {

    }
}

