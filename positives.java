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
public class positives {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zeros=0,positives=0,negatives=0, cnt =0;
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            cnt+=1;
        }
        for(int j=0;j<n;j++){
            if (arr[j] == 0) {
                zeros+=1;
            }
            else if (arr[j] > 0) {
                positives+=1;
            }
            else if( arr[j] < 0) {
                negatives+=1;
            }
        }
        if(zeros != 0)
        System.out.println((double)zeros/cnt);
        else
            System.out.println("0");
        if(positives != 0)
        System.out.println((double)positives/cnt);
        else
            System.out.println("0");
        if(negatives!=0)
        System.out.println((double)negatives/cnt);
        else
            System.out.println("0");
    }
    
}
