/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spoj;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 1019044
 */
public class Panagrams {
    public static void main(String[] args) {
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        in = in.trim();
        String out = in.toLowerCase().replace(" ", "");
        char[] chars = out.toCharArray();
        final Set set = new HashSet();
        
        for(char c:chars) {
            set.add(c);
        }
        if(set.size()==26) {
            System.out.println("pangram");
        }
        else
            System.out.println("not pangram");
    }
}
