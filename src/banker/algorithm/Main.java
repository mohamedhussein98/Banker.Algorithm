/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banker.algorithm;

import java.util.Scanner;

/**
 *
 * @author yehia
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the number of processes "
                + " and the number of resources types");
        
        int numProcesses = sc.nextInt();
        int numResourcesTypes = sc.nextInt();
        
        BankerAlgorithm ba = new BankerAlgorithm(numProcesses, 
                numResourcesTypes);
        String result = ba.execute();
        
        System.out.println();
        
        System.out.println(result);
    }
   
}
