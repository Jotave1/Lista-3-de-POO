import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Double PRECO_UNITARIO = 100.0;
    private static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer op;

        do {
            System.out.println("\n\tMenu:");
            System.out.println("1. Fazer pedido");
            System.out.println("2. Confirmar entrega");
            System.out.println("3. Ver pedidos confirmados");
            System.out.println("4. Ver pedidos entregues");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    fazerPedido(scanner);
                    break;
                case 2:
                    confirmarEntrega(scanner);
                    break;
                case 3:
                    verPedidos("Confirmado");
                    break;
                case 4:
                    verPedidos("Entregue");
                    break;
                case 5:
                System.out.println("Saindo");
                    break;
                default:
                System.out.println("Opção inválida!");
            }
        } while (op != 5);
        scanner.close();
    }
    
    private static void fazerPedido(Scanner scanner) {
        System.out.print("Digite o endereço de entrega: ");
        String endereco = scanner.nextLine();
        
        Pedido pedido = new Pedido(endereco);

        System.out.println("Pedido feito, hora da compra: " + pedido.getHoraCompra());
        System.out.println("Confirme o endereco ou altere (pressione Enter para manter): ");
        String novoEndereco = scanner.nextLine();
        if (!novoEndereco.isEmpty()) {
            pedido.setEndereco(novoEndereco);
        }

        System.out.println("Digite a quantidade de botijões que deseja: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        pedido.setQuantBotijoes(quantidade);

        pedido.setHoraEntrega(pedido.getHoraCompra().plus(6, ChronoUnit.HOURS));
        pedido.calcularTotal(PRECO_UNITARIO);
        pedido.setStatus("Confirmado");
        pedido.setCogidoConfirmacao("CONF" + pedido.getId());

        pedidos.add(pedido);
        System.out.println("Pedido confirmado, total a ser pago: R$" + pedido.getTotalCompra());
        System.out.println("Hora de entrega: " + pedido.getHoraEntrega());
        System.out.println("Codigo de confirmação: " + pedido.getCodigoConfirmacao());
    }

    private static void confirmarEntrega(Scanner scanner) {
        System.out.print("Digite o codigo de confirmação: ");
        String codigo = scanner.nextLine();

        for (Pedido pedido : pedidos) {
            if (pedido.getCodigoConfirmacao().equals(codigo)){
                pedido.setStatus("Entregue");
                System.out.println("Entrega confirmada para o pedido ID: " + pedido.getId());
                return;
            }
        }
        System.out.println("Pedido não localizado!");
    }

    private static void verPedidos(String status) {
        System.out.println("\nPedidos com status: " + status);
        for (Pedido pedido : pedidos) {
            if (pedido.getStatus().equals(status)) {
                System.out.println("Id: " + pedido.getId() + " | Endereço: " + pedido.getEndereco() + " | Total: R$: " + pedido.getTotalCompra());
            }
        }
    }
}