/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spoj;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author 1019044
 */
public class BIGinteger {
    
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger x = new BigInteger("0");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            BigInteger y = new BigInteger (Integer.toString(arr[arr_i]));
            x = x.add(y);
        }
        System.out.println(x);
        }
}
