/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GraphTheory;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 1019044
 */
public class BFS1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int i=0;i<testcases;i++) {
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        //create Nodes
        final Node[] nodes = new Node[N];
        for(short k=0;k<N;k++) {
            nodes[k] = new Node(k);   
        }
        
        //Add edges
        for(int j =0;j<M;j++) {
            int n1 = sc.nextInt()-1;
            int n2 = sc.nextInt()-1;
            nodes[n1].edges.add(new Edge((short)6, nodes[n2]));
            nodes[n2].edges.add(new Edge((short)6, nodes[n1]));
            }
        }
            
    }
    
    public static class Node {
        public final short id;
        public final List<Edge> edges;
        public Node(final short id) {
            this.id =id;
            this.edges = new LinkedList<Edge>();
            
        }
    }
    
    public static class Edge {
        public final short weight;
        public final Node node;
        public Edge(final short weight, final Node node) {
            this.weight = weight;
            this.node = node;
            
        }
        
    }
    
}
