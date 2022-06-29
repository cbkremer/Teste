/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data2206;

import java.util.Scanner;

/**
 *
 * @author 182110075
 */
public class Lista_5_nomes_inversa {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        String[] nomes = new String[5];
        int n = nomes.length;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o "+(i+1)+"° nome: ");
            nomes[i] = leia.nextLine();
        }
        
        for (int i = n-1; i >= 0; i--) {
            System.out.println("Nome "+(i+1)+": "+nomes[i]);
        }
    }
}
