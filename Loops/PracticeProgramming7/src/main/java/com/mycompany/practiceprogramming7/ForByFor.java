/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiceprogramming7;

/**
 *
 * @author dannylantigua
 */
public class ForByFor {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            if (i == 0 || i == 2) {
                for (int j = 0; j < 3; j++) {
                    if (j == 1) {
                        for (int k = 0; k < 3; k++) {
                            System.out.print("$");
                        }
                    } else {
                        for (int k = 0; k < 3; k++) {
                            System.out.print("*");
                        }
                    }

                    System.out.print("|");
                }
            }

            if (i == 1) {
                for (int j = 0; j < 3; j++) {
                    if (j == 1) {
                        for (int k = 0; k < 3; k++) {
                            System.out.print("#");
                        }
                    } else {
                        for (int k = 0; k < 3; k++) {
                            System.out.print("@");
                        }
                    }

                    System.out.print("|");
                }
            }

            /*for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }
                System.out.print("|");
            }*/
            System.out.println("");
        }
    }
}
