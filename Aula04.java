import java.util.Scanner;

public class Aula04 {
    public static void main(String[] args) {
        // O desafio da aula toda é criar um sistema de "banco" a pessoa pode consultar
        // saldo, receber valor, transferir ou sair.

        Scanner leitura = new Scanner(System.in);

        // Iniciando sistema.

        System.out.println("Bem vindo(a) ao LucasBank");
        System.out.println("Percebemos que você ainda não possuí uma conta, vamos começar?");

        // Pega dados iniciais
        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("Muito prazer, " + nome + "! Agora digite seu sobrenome: ");
        String sobrenome = leitura.nextLine();

        System.out.println(String.format("Certo, %s. Agora, escolha o seu tipo de conta", nome));
        System.out.println("""
                [1] para "Corrente"
                [2] para "Poupança"
                """);

        int tipoDeConta = leitura.nextInt();

        while (tipoDeConta > 2 || tipoDeConta < 1) {
            System.out.println("Desculpe, não entendi, pode digitar novamente?");
            System.out.println("""
                    [1] para "Corrente"
                    [2] para "Poupança"
                    """);

            tipoDeConta = leitura.nextInt();
        }

        String tipoDeContaTexto;

        if (tipoDeConta == 1) {
            tipoDeContaTexto = "Corrente";
        }

        tipoDeContaTexto = "Poupança";

        System.out.println("Obrigado! Por fim, qual será o deposito inicial da sua conta, " + nome + "?");

        double saldo = leitura.nextDouble();

        if (saldo > 0) {
            System.out.println("Obrigado por fazer seu primeiro deposito! Agora, vamos confirmar seus dados:");
        } else {

            while (saldo < 0) {
                System.out.println(nome
                        + ", Você não pode iniciar uma conta com saldo negativo. Deseja iniciar sem saldo? ( saldo: R$0,00 ) ?");
                System.out.println("""
                        [1] Não, quero depositar um valor inicial!
                        [2] Sim, iniciar sem saldo.
                        """);

                int seletorSaldoIncial = leitura.nextInt();

                while (seletorSaldoIncial > 2 || seletorSaldoIncial < 1) {
                    System.out.println("Desculpe, não entendi, pode digitar novamente?");
                    System.out.println("""
                                [1] Não, quero depositar um valor inicial!
                                [2] Sim, iniciar sem saldo.
                            """);

                    seletorSaldoIncial = leitura.nextInt();
                }

                if (seletorSaldoIncial == 1) {
                    System.out.println("Digite o valor do deposito incial:");
                    saldo = leitura.nextDouble();

                    if (saldo < 0) {
                        System.out.println(
                                "Parece que você quer começar com o saldo zerado. Definindo seu saldo para R$0,00...");

                        saldo = 0.0;
                    }
                } else {
                    System.out.println("Ok, vamos dessa forma entao. Definindo seu saldo para R$0,00...");
                    saldo = 0.0;
                    System.out.println("Agora, vamos confirmar seus dados: ");
                }

            }

        }

        String confirmaDados = """
                Nome Completo: %s %s
                Tipo de Conta: %s
                Saldo Inicial: R$%.2f

                Confere?:
                [1] Sim
                [2] Não
                """.formatted(nome, sobrenome, tipoDeContaTexto, saldo);

        System.out.println(confirmaDados);

        int conferenciaDeDados = leitura.nextInt();

        while (conferenciaDeDados > 2 || conferenciaDeDados < 1) {
            System.out.println("""
                    Dsculpe, não entedi, pode digitar novamente?:
                    Os dados estão corretos?
                    [1] Sim
                    [2] Não
                    """);
            conferenciaDeDados = leitura.nextInt();
        }

        if (conferenciaDeDados == 1) {
            System.out.println("Perfeito!" + nome + " Bem vindo ao LucasBank!");
        } else {

            boolean controleEdicaoDados = true;

            while (controleEdicaoDados) {
                // Presume 2
                // Confirmar qual dado está errado
                // Corrigir dado
                // Perguntar se está tudo certo
                // Seguir.

                confirmaDados = """
                        Qual dado você deseja editar:

                        [1] Nome: %s
                        [2] Sobrenome: %s
                        [3] Tipo de conta: %s
                        [4] Saldo inicial: R$%.2f
                        [5] Está certinho mesmo, vou seguir!

                        """.formatted(nome, sobrenome, tipoDeContaTexto, saldo);

                System.out.println(confirmaDados);

                int editaDados = leitura.nextInt();

                while (editaDados > 5 || editaDados < 1) {
                    System.out.println("""
                            Desculpe, não entendi. Qual dado você deseja editar:

                            [1] Nome: %s
                            [2] Sobrenome: %s
                            [3] Tipo de conta: %s
                            [4] Saldo inicial: R$%.2f
                            [5] Está certinho mesmo, vou seguir!
                                    """.formatted(nome, sobrenome, tipoDeContaTexto, saldo));

                    editaDados = leitura.nextInt();
                }

                switch (editaDados) {
                    case 1:
                        // Editar nome
                        boolean controleEditaNome = true;
                        while (controleEditaNome) {
                            System.out.println("Beleza, me conta, qual seu nome? ");
                            leitura.nextLine();
                            nome = leitura.nextLine(); //

                            // NOTA:
                            // Sempre que for usar nextLine(); apos usar nextInt();, temos que obrigatoriamente usar scanner.nextLine(); pois o nextInt(); nao consome "enter" igual o nextLine

                            System.out.println("Seu nome é " + nome + "?");
                            System.out.println("""
                                    [1] Sim
                                    [2] Não
                                    """);
                            int inputEditaNome = leitura.nextInt();
                            while (inputEditaNome > 2 || inputEditaNome < 1) {
                                System.out.println("""
                                    Não entendi. O nome %s está correto?
                                        [1] Sim
                                        [2] Não
                                        """.formatted(nome));
                                inputEditaNome = leitura.nextInt();
                            }

                            if (inputEditaNome == 1) {
                                System.out.println("Nome editado! Voltando ao menu anterior...");
                                controleEditaNome = false;
                            } 
                        }

                        break;
                    case 2:
                        // editar sobrenome
                        boolean controleEditaSobrenome = true;
                        while (controleEditaSobrenome) {
                            System.out.println("Beleza, me conta, qual seu sobrenome? ");
                            leitura.nextLine();
                            sobrenome = leitura.nextLine();

                            System.out.println("Seu sobrenome é " + sobrenome + "?");
                            System.out.println("""
                                    [1] Sim
                                    [2] Não
                                    """);
                            int inputEditaSobrenome = leitura.nextInt();
                            while (inputEditaSobrenome > 2 || inputEditaSobrenome < 1) {
                                System.out.println("""
                                    Não entendi. O sobrenome %s está correto?
                                        [1] Sim
                                        [2] Não
                                        """.formatted(nome));
                                inputEditaSobrenome = leitura.nextInt();
                            }

                            if (inputEditaSobrenome == 1) {
                                System.out.println("Sobrenome editado! Voltando ao menu anterior...");
                                controleEditaSobrenome = false;
                            } 
                        }
                        break;
                    case 3:
                        // editar tipo de conta
                        System.out.println("Editando tipo de conta...");
                        break;
                    case 4:
                        // editar saldo
                        System.out.println("Editando saldo...");
                        break;
                    case 5:
                        // sair da edicao;
                        System.out.println("sair da edicao...");
                        controleEdicaoDados = false;
                        break;
                }
            }
        }

        System.out.println("Iniciar conta! ========== ( flag ) ");

        // Comecar conta

        leitura.close();
    }
}
