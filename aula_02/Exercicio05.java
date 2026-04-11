package aula_02;

public class Exercicio05 {
    public static void main(String[] args) {
        //Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        String nomeProduto = "Salgadinho de Churrasco Fofura";
        double precoProduto = 2.99;
        int quantidade =  10;
        double totalGasto = (precoProduto * quantidade);

        String texto = """
        Eu comprei %d unidades de %s.
        Cada um custa R$ %.2f.
        Ou seja, eu gastei um total de R$ %.2f
        """.formatted(quantidade, nomeProduto, precoProduto, totalGasto );

        System.out.println(texto);
    }
}
