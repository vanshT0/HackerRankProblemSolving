import java.util.Scanner;
import java.util.*;

public class array2d {
    public static Scanner scn = new Scanner(System.in);

    public static void display(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void wakanda(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {

                    System.out.println(arr[j][i] );
                }
            }

            else {
                for (int j = n - 1; j >= 0; j--) {

                    System.out.println(arr[j][i] );
                }
            }
            

        }
    }

    public static void spiral(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;
      
        int total = n * m;
        int count = 0;


        int sRow = 0;
        int eRow = n - 1;
        int sCol = 0;
        int eCol = m - 1;

        while(count < total){
            for(int i = sRow, j = sCol; i < eRow && count < total; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            sCol++;

            for(int i = eRow, j = eCol; i > sRow && count < total; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            eCol--;

            for(int j = sCol, i = sRow; j < eCol && count < total; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            sRow++;

            for(int j = eCol, i = eRow; j > sCol && count < total; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            eRow--;

        }
    }

    public static void main(String[] args) {

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        spiral(arr);

    }
}
