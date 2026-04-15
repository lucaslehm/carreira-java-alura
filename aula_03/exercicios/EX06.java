package aula_03.exercicios;

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitura.nextInt();
        int numeroOr = numero;

        for (int i = numero; i > 0; i--) {
            if (numero == i) {
                continue;
            } else {
                numero = numero * i;
            }
        }

        System.out.println(numeroOr + "! = " + numero);

        leitura.close();
    }
}
