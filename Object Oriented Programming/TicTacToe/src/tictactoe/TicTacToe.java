package tictactoe;

import java.util.*;

public class TicTacToe {

    public static void main(String args[]) {
        char arr[][] = {{'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}};
        boolean vacant = false;
        boolean win;
        boolean full = false;

        display(arr);
        clearArray(arr);
        do {
            do {
                int pos = getUserAttempt(arr);
                vacant = assignToArray(pos, arr, 'X');
                if (vacant == false) {
                    System.out.println("occupied");

                }
            } while (vacant == false);

            display(arr);
            win = CheckForWinner(arr);
            if (win == true) {
                break;
            }
            full = CheckForFull(arr);
            if (full== true){
                System.out.println("Draw");
                break;
            }

            do {
                int pos2 = getAIAttempt(arr);
                vacant = assignToArray(pos2, arr, 'O');
                if (vacant == false) {
                    System.out.println("occupied");
                }
            } while (vacant == false);

            display(arr);
            win = CheckForWinner(arr);
            if (win == true) {
                break;
            }
            full = CheckForFull(arr);
            if (full== true){
                System.out.println("Draw");
                break;
            }
            }while (win == false && full == false);
        }
        

    public static boolean CheckForFull(char[][] a) {
        boolean f = true;
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                if (a[row][col] == ' ') {
                    f = false;

                }

            }
        }
        return f;
        
    }
    public static boolean CheckForWinner(char[][] a) {
        boolean w = false;

        if (a[0][0] == 'X' && a[0][1] == 'X' && a[0][2] == 'X') {
            System.out.println("Player wins");
            w = true;
        } else if (a[1][0] == 'X' && a[1][1] == 'X' && a[1][2] == 'X') {
            System.out.println("Player wins");
            w = true;
        } else if (a[2][0] == 'X' && a[2][1] == 'X' && a[2][2] == 'X') {
            System.out.println("Player wins");
            w = true;
        } else if (a[0][0] == 'X' && a[1][0] == 'X' && a[2][0] == 'X') {
            System.out.println("Player wins");
            w = true;
        } else if (a[0][1] == 'X' && a[1][1] == 'X' && a[2][1] == 'X') {
            System.out.println("Player wins");
            w = true;
        } else if (a[0][2] == 'X' && a[1][2] == 'X' && a[2][2] == 'X') {
            System.out.println("Player wins");
            w = true;
        } else if (a[0][2] == 'X' && a[1][1] == 'X' && a[2][0] == 'X') {
            System.out.println("Player wins");
            w = true;
        } else if (a[0][0] == 'X' && a[1][1] == 'X' && a[2][2] == 'X') {
            System.out.println("Player wins");
            w = true;
        } else if (a[0][0] == 'O' && a[0][1] == 'O' && a[0][2] == 'O') {
            System.out.println("AI wins");
            w = true;
        } else if (a[1][0] == 'O' && a[1][1] == 'O' && a[1][2] == 'O') {
            System.out.println("AI wins");
            w = true;
        } else if (a[2][0] == 'O' && a[2][1] == 'O' && a[2][2] == 'O') {
            System.out.println("AI wins");
            w = true;
        } else if (a[0][0] == 'O' && a[1][0] == 'O' && a[2][0] == 'O') {
            System.out.println("AI wins");
            w = true;
        } else if (a[0][1] == 'O' && a[1][1] == 'O' && a[2][1] == 'O') {
            System.out.println("AI wins");
            w = true;
        } else if (a[0][2] == 'O' && a[1][2] == 'O' && a[2][2] == 'O') {
            System.out.println("AI wins");
            w = true;
        } else if (a[0][2] == 'O' && a[1][1] == 'O' && a[2][0] == 'O') {
            System.out.println("AI wins");
            w = true;
        } else if (a[0][0] == 'O' && a[1][1] == 'O' && a[2][2] == 'O') {
            System.out.println("AI wins");
            w = true;
        }
     return w;
    }

    public static void display(char a[][]) {
        System.out.println("\nTic.Tac.Toe\n");
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                System.out.print("|" + a[row][col] + "|");
            }
            System.out.println();
        }
        System.out.println("_______");
    }

    public static void clearArray(char a[][]) {
        System.out.println("\nTic.Tac.Toe\n");
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 2; col++) {
                a[row][col] = ' ';
            }
        }
    }

    public static int getUserAttempt(char a[][]) {
        Scanner sc = new Scanner(System.in);
        int pos;
        do {
            System.out.print("Enter Position:");
            pos = sc.nextInt();
        } while (pos < 1 || pos > 9);
        return pos;
    }

    public static int getAIAttempt(char a[][]) {

        int pos;
        do {
            pos= (int) Math.round(Math.random() * 9);
            System.out.println("AI's position: " + pos);
        } while (pos < 1 || pos > 9);
        return pos;
    }

    public static boolean assignToArray(int pos, char a[][], char mark) {
        int rowPos = 0;
        int colPos = 0;
        switch (pos) {
            case 1:
                rowPos = 0;
                colPos = 0;
                break;
            case 2:
                rowPos = 0;
                colPos = 1;
                break;
            case 3:
                rowPos = 0;
                colPos = 2;
                break;
            case 4:
                rowPos = 1;
                colPos = 0;
                break;
            case 5:
                rowPos = 1;
                colPos = 1;
                break;
            case 6:
                rowPos = 1;
                colPos = 2;
                break;
            case 7:
                rowPos = 2;
                colPos = 0;
                break;
            case 8:
                rowPos = 2;
                colPos = 1;
                break;
            case 9:
                rowPos = 2;
                colPos = 2;
                break;
        }
        if (a[rowPos][colPos] == ' ') {
            a[rowPos][colPos] = mark;
            return true;
        } else {
            return false;
        }
    }
}

