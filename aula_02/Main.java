package aula_02;
class Main {
    public static void main(String[] args) {
        // O mais indicado é usar a IDE certinha, mas para fins de aprendizado, ovo usa o VSCode memo adkad
        System.out.println("Nome do filme: Interstellar");
        int anoDeLancamento = 2014;
        double avalicao = (8.3 + 7.5 + 6.7) / 3;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avalicação: " + avalicao);
        String sinopse = """
            As reservas da Terra estão chegando ao
            fim e um grupo de astronautas recebe a missão de
            verificar possíveis planetas para receberem a
            população mundial, possibilitando a continuação da
            espécie. Cooper é chamado para liderar o grupo e
            aceita a missão sabendo que pode nunca mais ver
            os filhos. Ao lado de Brand, Jenkins e Doyle, ele
            seguirá em busca de um novo lar.
        """;
        System.out.println(sinopse);
        // Comentarios igual no js
        // String = texto
        // int = inteiro
        // double ou float = real
        // operadores aritimeticos e logicos tambem sao iguais ao do JS

        // Comentários de bloco /* */ <-- sao assim
    }
}