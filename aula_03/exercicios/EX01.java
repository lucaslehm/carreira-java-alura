package aula_03.exercicios;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        // Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero, positivo ou negativo!");
        int numero = leitura.nextInt();

        if (numero < 0) {
            System.out.println("Numero negativo!");
        } else {
            System.out.println("Numero positivo!");
        }

        leitura.close();
    }
}
