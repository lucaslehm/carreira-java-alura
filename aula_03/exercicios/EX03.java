package aula_03.exercicios;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int controle = 9;

        String onBoarding = """
        AreaCalculator!
        [1] Calcular área do quadrado
        [2] Calcular area do circulo
        [0] Sair
        """;

        while (controle != 0) {
            System.out.println(onBoarding);
            controle = leitura.nextInt();

            if (controle == 1) {
                System.out.println("Insira a medida em M de qualquer um dos lados do quadrado: ");
                double lado = leitura.nextDouble();
                
                double areaDoQuadrado = lado * lado;

                System.out.println(String.format("A área deste quadrado é %.2fM²", areaDoQuadrado));

                System.out.println("Obrigado!");
            }

            if (controle == 2) {
                System.out.println("Qual é o valor do raio em M?: ");
                double raio = leitura.nextDouble();
                
                double areaDoCirculo= 3.14 * ( raio * raio);

                System.out.println(String.format("A área deste circulo é %.2fM²", areaDoCirculo));

                System.out.println("Obrigado!");
            }

            System.out.println("Obrigado! Até logo :D");
        }

        

        leitura.close();
    }
}
