/*
4. Faça um programa onde o usuário digita um valor, e exiba na tela todos
os valores entre 0 e o valor digitado.
*/

package com.mycompany.listadeexerciciosii;

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int valFinal, i=0;
    
        System.out.println("Digite um valor limite");
            valFinal = sc.nextInt();
            
        while (i < valFinal){
            System.out.println(i + " ");
            i++;
        }
    }

    
}