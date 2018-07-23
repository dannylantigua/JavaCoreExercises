/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming9;

import java.util.Arrays;

/**
 *
 * @author dannylantigua
 */
public class SimpleSort {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};

        int[] wholeNumbers = new int[24];

        // Sorting code should go here!
        int count = 0;
        for(int num : firstHalf){
            wholeNumbers[count] = num;
            count ++;
        }
        
        for(int num : secondHalf){
            wholeNumbers[count] = num;
            count ++;
        }
        
        Arrays.sort(wholeNumbers);
        for(int num : wholeNumbers){
            System.out.print(num+" ");
        }
    }
}
