package aula_05.screenmatch;

public class Filme {

    // Variaveis Privadas
    // elas sao protegidas

    String nome;
    String sinopse;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    // coloque a palavra private antes da declaracao de um atributo
    // eu nao posso nem ler e nem escrever esse
    private double avaliacao;
    private int totalAvaliacao;

    // criando metodos

    void exibeFichaTecnica() {
        String fichaTecnica = """
                Nome do filme: %s
                Ano de lancamento: %d
                Duração: %d minutos
                Avalicação: %.1f
                Total de avaliações: %d
                Sinopse: %s
                """.formatted(nome, anoDeLancamento, duracaoEmMinutos, avaliacao, totalAvaliacao, sinopse);

        System.out.println(fichaTecnica);
    }

    double realizaMedia() {
        return avaliacao / totalAvaliacao;
    }

    void avaliar(double nota) {
        avaliacao += nota;
        totalAvaliacao++;
        avaliacao = realizaMedia();
    }

}
