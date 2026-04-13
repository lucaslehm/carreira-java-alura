package aula_03;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu jogo favorito:");
        // nextLine para receber texto
        String jogoFavorito = leitura.nextLine();
        System.out.println(jogoFavorito);

        System.out.println("De uma nota de 0 a 10");

        // NextInt para pegar inteiros
        int notaJogo = leitura.nextInt();

        // NextDouble para doubles.

        while (notaJogo > 10 || notaJogo < 0) {
            System.out.println("Digite novamente:");
            notaJogo = leitura.nextInt();
        }

        // Ainda nao sei porque, mas em que fechar ele...
        leitura.close();
    }
}
