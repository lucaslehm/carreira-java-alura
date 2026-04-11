package aula_02;

public class Exercicio06 {
    public static void main(String[] args) {
        // Declare uma variável do tipo double valorEmDolares. Atribua um valor em
        // dólares a essa variável. Considere que o valor de 1 dólar é equivalente a
        // 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o
        // resultado formatado.

        double valorDolar = 4.94;

        double meuDinheiro = 4234.97;

        double meuDinheiroEmDolar = meuDinheiro / valorDolar;

        String texto = """
                Vou viajar para os Estados Unidos essa semana.
                Separei R$ %.2f para essa viagem.
                Ou seja, chegando lá eu terei U$D %.2f para gastar.
                """.formatted(meuDinheiro, meuDinheiroEmDolar);

        System.out.println(texto);
    }

}
