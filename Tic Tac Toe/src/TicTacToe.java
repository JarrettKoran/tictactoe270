public class TicTacToe {

    public static void main(String[] args)
    {
        public enum status{WIN, DRAW, CONTINUE};

        public boolean

        //This will be the game board, a 2D array with 3 rows, and 3 columns
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '}, {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'}, {' ', '|', ' ', '|', ' '}};

       for(char[] row: gameBoard) {
           for(char c : row){
               System.out.print(c);
           }
           System.out.println();
    }

    }

}
