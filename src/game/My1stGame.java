package game;

import java.util.Scanner;

public class My1stGame {
    public static void main(String[] args) {
        //Setting up the board
        char[][] board = new char[3][3];

        for (int row = 0 ; row < 3;row++){

            for (int colm =0 ; colm < 3  ; colm++){
                board[row][colm] =' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver){
            printBoard(board);
            System.out.println("Player " +player+ " enter :"); //To print players turn
            int row = scanner.nextInt(); // for saving the index entered by the played in the displayed board in row
            int colm = scanner.nextInt(); //// for saving the index entered by the played in the displayed board in column
            System.out.println(); // for creating the space between the boards
            if (board[row][colm] == ' ')
            {
             board[row][colm] = player;
             gameOver = haveWon(player, board); // function call for haveWon which is stored in gameOver
             if (gameOver)
             {
                 System.out.println("Player " +player+ " have won the game :");
             }
             else
             {
                 if (player == 'X')
                 {
                     player = 'O';
                 }
                 else
                     player = 'X';
             }



            }
            else  {
                System.out.println("Invalid move try again!!!");
            }

        }
        printBoard(board);

    }

    public static boolean haveWon(char player, char[][] board) {
        for (int row=0 ; row < 3 ; row++)  // for checking row wise winner
        {
            if (board[row][0] ==player && board[row][1] == player && board[row][2]==player){
                return true;
            }
        }

        for(int colm = 0 ; colm < 3 ; colm++)  //for checking column wise winner
        {
            if (board[0][colm]==player && board[1][colm]==player && board[2][colm]==player){
                return true;
            }
        }

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player){ // for checking diagonally winner
            return true;
        }
        if(board[1][2] == player && board[1][1] == player && board[2][2] == player){ // for checking diagonally winner
            return true;
        }



        return false;

    }

    public static void printBoard(char[][] board) { //function for printing the board
        for (int row = 0 ; row < 3; row++)
        {
            for (int colm = 0 ; colm < 3; colm++)
            {
                System.out.print(board[row][colm] +" | ");
            }
            System.out.println();
        }


    }
    }

