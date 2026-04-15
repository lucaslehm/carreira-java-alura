package aula_03.exercicios;

import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        // Peça ao usuário para inserir dois números inteiros. Compare os números e
        // imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior
        // ou o segundo é maior.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = leitura.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println(numero1 + " e " + numero2 + "São iguai!");
        }

        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior que " + numero2);
        }

        if (numero1 < numero2) {
            System.out.println(numero1 + " é menor que " + numero2);
        }

        leitura.close();
    }
}
