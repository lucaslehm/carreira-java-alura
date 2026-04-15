package aula_03.exercicios;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        // Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d X %d = %d", numero, i , (numero * i)));
        }

        leitura.close();
    }
}
