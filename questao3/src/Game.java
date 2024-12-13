import java.util.*;
import java.io.*;

class Game {
    private List<Player> jogadores;
    private Dado dado1;
    private Dado dado2;

    public Game() {
        jogadores = new ArrayList<>();
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public void adicionarJogador(String nome, int aposta) {
        for (Player jogador : jogadores) {
            if (jogador.getAposta() == aposta) {
                System.out.println("Aposta duplicada! Escolha outro número.");
                return;
            }
        }
        if (jogadores.size() < 11) {
            jogadores.add(new Player(nome, aposta));
        } else {
            System.out.println("Limite de jogadores atingido!");
        }
    }

    public void jogar() {
        int somaDados = dado1.lancar() + dado2.lancar();
        System.out.println("Soma dos dados: " + somaDados);

        boolean vencedorEncontrado = false;
        for (Player jogador : jogadores) {
            if (jogador.getAposta() == somaDados) {
                System.out.println("Jogador " + jogador.getNome() + " venceu!");
                jogador.incrementarVitoria();
                salvarVitoria(jogador);
                vencedorEncontrado = true;
                break;
            }
        }

        if (!vencedorEncontrado) {
            System.out.println("A máquina venceu!");
        }
    }

    public void exibirRanking() {
        System.out.println("\n--- Ranking TOP 5 ---");
        jogadores.sort((a, b) -> b.getVitorias() - a.getVitorias());

        for (int i = 0; i < Math.min(5, jogadores.size()); i++) {
            Player jogador = jogadores.get(i);
            System.out.println((i + 1) + ". " + jogador.getNome() + " - Vitórias: " + jogador.getVitorias());
        }
    }

    private void salvarVitoria(Player jogador) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ranking.txt", true))) {
            writer.write(jogador.getNome() + ", Vitórias: " + jogador.getVitorias() + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o ranking: " + e.getMessage());
        }
    }
}