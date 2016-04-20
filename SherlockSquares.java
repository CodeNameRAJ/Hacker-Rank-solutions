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
public class SherlockSquares {
    public int isSquare(int x) {
        int a=0,b=0,cnt=0;
        for(long i=a; i<=b ; i++) {
            for(int j=1;j<(b/2);j++) {
                if(j*j == i){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++) {
            int in = sc.nextInt();
        }
    }
    
}
