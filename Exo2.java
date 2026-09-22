/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Exo2;

import java.util.Scanner;

/**
 *
 * @author Royston
 */
public class Exo2 {

    public static void main(String[] args) {
    /*
        Methode permettant de calculer les n premier entier naturelle
    */
        int nb;
        int result;
        int ind;
        //nb=5;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb= sc.nextInt();
        result=0;
        /*
            Initialisation de l'indice et mise en place de la boucle pour calculer les "nb" premier entier naturelle
        */
        ind=1;
        while (ind <=nb){
            result= result + ind ;
            ind += 1;
        }
        
        System.out.println();
        System.out.println("La somme des "+ nb + " entiers est :" +result );
    }
}
