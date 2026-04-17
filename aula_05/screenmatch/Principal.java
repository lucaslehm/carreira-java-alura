package aula_05.screenmatch;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "Interstellar";
        meuFilme.anoDeLancamento = 2014;
        meuFilme.sinopse = "Melhor filme de todos os tempos";
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.exibeFichaTecnica();

        meuFilme.avaliar(10);
        meuFilme.avaliar(6);
        meuFilme.avaliar(8);

        meuFilme.exibeFichaTecnica();
    }
}
