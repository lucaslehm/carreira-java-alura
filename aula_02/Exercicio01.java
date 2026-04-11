package aula_02;

public class Exercicio01 {
    public static void main(String[] args) {
        int temperatura = 22;

        double temperaturaEmF = (double) ((temperatura * 1.8) + 32);

        System.out.println(String.format("Em santo andré, está fazendo %d ºC. Em ºF, seriam %.2f ºF.", temperatura,
                temperaturaEmF));
    }
}
