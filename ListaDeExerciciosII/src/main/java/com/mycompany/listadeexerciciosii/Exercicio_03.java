/*
3. Escreva um programa que pergunta um número ao usuário, e mostra
sua tabuada completa (de 1 até 10).
*/
package com.mycompany.listadeexerciciosii;

import java.util.Scanner;

public class Exercicio_03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_in;
        
        System.out.println("Digite um número de 1 a 10: ");
            num_in = sc.nextInt();
            
        tabuada(num_in);
    }
    
    public static void tabuada(int num_in){
        System.out.println("Tabuada: ");
        for(int i = 0; i<=10; i++){
            System.out.println(num_in + " x " + i + " = " + num_in*i);
        }
    }
    
    
    
    
    
}
