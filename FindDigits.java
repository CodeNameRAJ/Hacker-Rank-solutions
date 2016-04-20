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
public class FindDigits {
    public int calculate(int n) {
        int i = 0, cnt=0, temp=n;
        int[] arr = new int[100];
        int length = Integer.toString(n).length();
        while (length != 0) {
        arr[i] = temp%10;
        if(arr[i]!= 0 && n%arr[i] == 0) {
          cnt++;  
        }
        temp /= 10;
        i++;
        length--;
        }
        if(cnt == 0)
            return -1;
        else
            return cnt;
        
    }
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    FindDigits fd = new FindDigits();
    int t = in.nextInt();
    int[] out = new int[100];

    if(t>=1 && t<=15) {
    for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();
        out[a0] = fd.calculate(n);
    }
    }
    for(int out0=0; out0<t; out0++) {
        System.out.println(out[out0]);
    }
    
    
}
    
}
