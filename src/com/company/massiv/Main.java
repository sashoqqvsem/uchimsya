package com.company.massiv;

import com.company.getsetHomework.Robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] integer = new int[10];
        for(int i = integer.length;i>0;i--){
            integer[i-1]=integer.length-i;
        }
        Arrays.sort(integer);
        for(int i = 0;i<integer.length;i++){
            System.out.println(integer[i]);
        }
        int[][]array=new int[10][10];
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                array[i][j]=j+1;
            }
        }
        for(int i = 0;i<array.length;i++){
            for(int j = 0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


    }
}
