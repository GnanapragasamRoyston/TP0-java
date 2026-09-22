/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Exo1;

import java.util.Scanner;

/**
 *
 * @author Royston
 */
public class Exo1 {

    public static void main(String[] args) {
        String prenom;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Bonjour, " + prenom);
    }
}
