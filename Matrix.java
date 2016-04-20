/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spoj;

import java.util.Scanner;

/**
 *
 * @author 1019044
 */
public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int diag1=0 ,diag2=0;
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        for(int a_i=0; a_i < n; a_i++)
           {
                diag1+=a[a_i][a_i];
            }

        int i=0;   
        for(int j=n-1;j >=0;j--) 
           {
               diag2+=a[i][j];
               i++;
            }
           
           System.out.println (Math.abs(diag1-diag2));
    }
    
}
