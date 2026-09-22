/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Calculator;

import java.util.Scanner;

/**
 *
 * @author Royston
 */
public class Calculator {

    public static void main(String[] args) {
        int operateur;
        int operande1;
        int operande2;
        int res;
        System.out.println("Please enter the operator:\n" +
                            "1) add                   \n" +
                            "2) substract             \n" +
                            "3) multiply              \n" +
                            "4) divide                \n" +
                            "5) modulo");
    
        Scanner sc = new Scanner(System.in);
        operateur= sc.nextInt();
        
        /*
            On met une condition pour ne pas sortir des limites imposé : operateur doit être 1 et 5
        */
        if (1 <= operateur && operateur <= 5){
            
            System.out.println("\n Please enter the first number: :");
            operande1 = sc.nextInt();
            System.out.println("\n Please enter the second number: :");
            operande2 = sc.nextInt();
        
        /*
            Ici le switch nous permet de faire le bon calcul en fonction du choix de l'utilisateur
        */
            switch (operateur){           
                case 1:
                    res = operande1 + operande2;
                    System.out.println("\n The result is : "+ res);
                    break;
                case 2:
                    res = operande1 - operande2;
                    System.out.println("\n The result is : "+ res);
                    break;
                case 3:
                    res = operande1 * operande2;
                    System.out.println("\n The result is : "+ res);
                    break;
                case 4:
                    res = operande1 / operande2;
                    System.out.println("\n The result is : "+ res);
                    break;
                case 5:
                    res = operande1 % operande2;
                    System.out.println("\n The result is : "+ res);
                    break;
            }
        }
        /*
            Message d'erreur et interruption du programme
        */
        else{
            System.out.println("L'operteur doit etre en 1 et 5");
            System.exit(0);
        }
    }
}
