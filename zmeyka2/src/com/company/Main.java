package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        int n;
        int m;
        System.out.println("Enter size of matrix");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        System.out.println("["+ n + "]" + "["+ m + "]");

        int[][] array = new int[n][m];
        int k = 1;

        boolean up = true;
        boolean right = false;
        boolean down = false;
        boolean left = false;

        int indexOfColumn = 0;
        int indexOfRows = 0;

        int amountSteps = (array.length * 2) -1;

        int modernColumn = 0;
        int modernRows = 0;

        for (int b = 0; b < amountSteps; b++) {

            if(up){
                for (int i = indexOfColumn; i < m; i++) {
                    if(array[indexOfRows][i] == 0){
                        array[indexOfRows][i] = k;
                        k++;
                        modernColumn = i;
                    }else {
                        break;
                    }
                }
                indexOfColumn = modernColumn;
                indexOfRows++;
                up = false;
                right = true;

            }else if(right){
                for (int j = indexOfRows; j < n ; j++) {
                    if(array[j][indexOfColumn] == 0){
                        array[j][indexOfColumn] = k;
                        k++;
                        modernRows = j;
                    }else {
                        break;
                    }
                }
                indexOfRows = modernRows;
                indexOfColumn--;
                right = false;
                down = true;

            }else if(down){
                for (int i = indexOfColumn; i > -1 ; i--) {
                    if(array[indexOfRows][i] == 0){
                        array[indexOfRows][i] = k;
                        k++;
                        modernColumn = i;
                    }else {
                        break;
                    }
                }
                indexOfColumn = modernColumn;
                indexOfRows--;
                down = false;
                left = true;

            }else if(left){
                for (int j = indexOfRows; j < n ; j--) {
                    if(array[j][indexOfColumn] == 0){
                        array[j][indexOfColumn] = k;
                        k++;
                        modernRows = j;
                    }else {
                        break;
                    }
                }
                indexOfRows = modernRows;
                indexOfColumn++;
                left = false;
                up = true;
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }





}
