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
public class Inf_15_alunos {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        
        String[][] alunos  = new String[15][5];
        int n = alunos.length;
        int n2 = alunos[0].length;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o nome do "+(i+1)+"° aluno: ");
            alunos[i][0] = leia.nextLine();
            System.out.println("Insira a nota 1 do aluno "+alunos[i][0]+": ");
            alunos[i][1] = leia.nextLine();
            System.out.println("Insira a nota 2 do aluno "+alunos[i][0]+": ");
            alunos[i][2] = leia.nextLine();
            System.out.println("Insira a nota 3 do aluno "+alunos[i][0]+": ");
            alunos[i][3] = leia.nextLine();
            System.out.println("Insira a media do aluno "+alunos[i][0]+": ");
            alunos[i][4] = leia.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n2; j++) {
                System.out.println(alunos[i][j]);
            }
        }
    }
}
