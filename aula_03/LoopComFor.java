package aula_03;

import java.util.Scanner;

public class LoopComFor {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double avaliacaoMedia = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite a nota do filme: ");
            nota = leitura.nextDouble();
            
            avaliacaoMedia += nota;
        }

        avaliacaoMedia = avaliacaoMedia / 3;

        System.out.println(avaliacaoMedia);

    leitura.close();
    }
}
