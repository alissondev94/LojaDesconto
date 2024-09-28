import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de compras realizadas pelo cliente no mês: ");
            int numeroCompras = scanner.nextInt();

            System.out.print("Digite o valor total da compra atual: R$ ");
            double valorCompra = scanner.nextDouble();

            Cliente cliente = new ClienteImpl(numeroCompras);
            Compra compra = new Compra(valorCompra);

            double valorFinal = compra.calcularValorFinal(cliente);4
            double percentualDesconto = compra.getPercentualDescontoTotal();

            System.out.printf("Desconto total aplicado: %.2f%%%nValor final com descontos: R$ %.2f%n", percentualDesconto, valorFinal);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
