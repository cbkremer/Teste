/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apquarta.algoritmos;

import java.util.Scanner;

/**
 *
 * @author 182110075 Desenvolva uma algoritmo, que guarde as informações de 15
 * alunos: nome, nota1, nota2, nota3, media
 */
public class Exec1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int nAlunos, nNotas;

        System.out.println("Informe o número de alunos: ");
        nAlunos = leia.nextInt();
        System.out.println("Informe número de notas: ");
        nNotas = leia.nextInt();
        
        System.out.println(nNotas);
        float[][] notas = new float[nAlunos][nNotas+1];
        String[] nomes = new String[nAlunos];

        System.out.println("---Notas de alunos---");

        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Nome Aluno " + (i + 1) + " :");
            nomes[i] = leia.next();
            System.out.println("--Notas: ");
            for (int j = 0; j < nNotas; j++) {
                System.out.println("Nota " + (j + 1) + " :");
                notas[i][j] = leia.nextFloat();
                notas[i][nNotas] += notas[i][j];
            }
            notas[i][nNotas] = notas[i][nNotas] / nNotas;
        }
        System.out.println("\n---Impressão---\n");
        for (int i = 0; i < nAlunos; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + nomes[i]);
            for (int j = 0; j < nNotas; j++) {
                System.out.println(" - Nota " + (j + 1) + ": " + notas[i][j]);
            }
            System.out.println(" - Média :" + notas[i][nNotas]);
            System.out.println("---");
        }
    }
}
