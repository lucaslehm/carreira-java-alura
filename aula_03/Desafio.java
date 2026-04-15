package aula_03;

import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        // Crie um programa que simula um jogo de adivinhação, que deve gerar um número
        // aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
        // em até 5 tentativas. A cada tentativa, o programa deve informar se o número
        // digitado pelo usuário é maior ou menor do que o número gerado.

        // Dicas:

        // Para gerar um número aleatório em Java: new Random().nextInt(100);
        // Utilize o Scanner para obter os dados do usuário;
        // Utilize uma variável para contar as tentativas;
        // Utilize um loop para controlar as tentativas;
        // Utilize a instrução break; para interromper o loop.

        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int numeroUsuario;
        boolean controle = true;
        int tentativas = 0;


         System.out.println("Tente adivinhar o numero!");
        System.out.println("Você terá 5 chances!");


        while (controle) {

            if (tentativas > 5) {
                System.out.println(String.format("Boa tentativa... Você não conseguiu :(. O número secreto era %d", numeroAleatorio));
                controle = false;
                break;
            }

            System.out.println("Digite sua tentativa (0 a 100):");
            numeroUsuario = leitura.nextInt();

            // Se o numero for maior que 100...
            if (numeroUsuario > 100) {
                System.out.println("Perdeu uma tentativa, bobão! Tente novamente!");
                tentativas++;
            }

            // Se o numero for maior que 0...
            if (numeroUsuario < 0) {
                System.out.println("Perdeu uma tentativa, bobão! Tente novamente!");
                tentativas++;
            }

            // Se o numero for exatamente o mesmo
            if (numeroUsuario == numeroAleatorio) {
                tentativas++;
                System.out.println(String.format("Parabens! Você acertou! O número secreto era %d! Você adivinhou em %d tentativa(s) :D", numeroAleatorio, tentativas));
                controle = false;
            }

            // Se o numero for menor
            if (numeroUsuario < numeroAleatorio) {
                tentativas++;
                System.out.println("Chute mais alto! Tente novamente!");
            }


            // Se o numero for maior
            if (numeroUsuario > numeroAleatorio) {
                tentativas++;
                System.out.println("Chute mais baixo! Tente novamente!");
            }
        }

        leitura.close();
    }
}
