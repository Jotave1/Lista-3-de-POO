import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Robo robo = new Robo(0, 0, 1); //robo vai iniciar na posição (0, 0) com passo = 1
        Scanner scanner = new Scanner(System.in);
        Integer op;

        do {
            System.out.println("\t- Controle do Robô -");
            System.out.println("1 - Andar para Frente");
            System.out.println("2 - Andar para Trás");
            System.out.println("3 - Andar para Direita");
            System.out.println("4 - Andar para Esquerda");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    robo.andarFrente();
                    break;
                case 2:
                    robo.andarTras();
                    break;
                case 3:
                    robo.andarDireita();
                    break;
                case 4:
                    robo.andarEsquera();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            robo.mostrarSala();
            robo.mostrarPosicao();
        } while (op!= 0);
    }
}
