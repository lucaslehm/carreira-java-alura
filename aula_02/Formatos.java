package aula_02;

public class Formatos {
    public static void main(String[] args) {
        String nome = "Lucas";
        int idade = 23;
        String jogoFavorito = "Valorant";

        System.out.println(String.format("%s tem %d anos e seu jogo favorito é %s", nome, idade, jogoFavorito));
    }
}