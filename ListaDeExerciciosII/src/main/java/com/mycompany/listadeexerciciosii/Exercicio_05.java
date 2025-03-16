/*
5. Faça um programa que imprima na tela a soma dos valores entre 0 e
100.
*/

package com.mycompany.listadeexerciciosii;

public class Exercicio_05 {
  
    public static void main(String[] args) {
        
        int result = 0;
        
        for(int i = 0; i<=100; i++){
            result += i;
        }
        
        System.out.println(result);
    }
}
