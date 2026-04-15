package aula_03.exercicios;

import java.util.Scanner;

public class EX05 {
    public static void main(String[] args) {
        // Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();

        if ((numero % 2) == 0 ) {
            System.out.println(numero + " é PAR!");
        } else {
            System.out.println(numero + " é IMPAR!");
        }

        leitura.close();
    }
}
