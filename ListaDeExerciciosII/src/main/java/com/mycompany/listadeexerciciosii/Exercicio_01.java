// 1. Mostre todos os números ímpares de 1 até 100.

package com.mycompany.listadeexerciciosii;

public class Exercicio_01 {
    
    public static void main(String[] args) {    
        System.out.print("Os números ímpares de 1 até 100 são: ");
        
        for(int i = 0; i<= 100;i++){
            if(i%2 != 0){
                System.out.print(i+" ");
            }
        }
    }
}
