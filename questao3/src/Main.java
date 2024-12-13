import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        System.out.println("--- Bem-vindo ao Jogo de Dados! ---");

        while (true) {
            System.out.println("\n1. Adicionar jogador");
            System.out.println("2. Jogar");
            System.out.println("3. Exibir ranking");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do jogador: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o valor da aposta (1 a 12): ");
                    int aposta = scanner.nextInt();
                    if (aposta < 1 || aposta > 12) {
                        System.out.println("Aposta inválida! Escolha um número entre 1 e 12.");
                    } else {
                        game.adicionarJogador(nome, aposta);
                    }
                    break;
                case 2:
                    game.jogar();
                    break;
                case 3:
                    game.exibirRanking();
                    break;
                case 4:
                    System.out.println("Encerrando o jogo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
