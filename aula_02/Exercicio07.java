package aula_02;

public class Exercicio07 {
    public static void main(String[] args) {
        // Declare uma variável do tipo double precoOriginal. Atribua um valor em reais
        // a essa variável, representando o preço original de um produto. Em seguida,
        // declare uma variável do tipo double percentualDesconto e atribua um valor
        // percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor
        // do desconto em reais, aplique-o ao preço original e imprima o novo preço com
        // desconto.

        String nomeDoProduto = "PlayStation 5 Pro";
        double valorOriginal = 4999.90;
        int percentualDesconto = 15;
        double valorComDesconto = valorOriginal * (1 - percentualDesconto / 100.0);

        String texto = """
                Mãe, passei na lojinha do seu Zé, e ele está vendendo
                um %s por R$ %.2f. Ele que custava R$ %.2f
                Ou seja, o Play está com %d por cento de desconto! Vamos comprar?
                """.formatted(nomeDoProduto, valorComDesconto, valorOriginal, percentualDesconto);

        System.out.println(texto);
    }
}
