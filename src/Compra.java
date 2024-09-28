public class Compra {
    private double valorTotal;
    private static final double DESCONTO_FREQUENTE = 0.07;
    private static final double DESCONTO_COMPRA_ALTA = 0.10;
    private double percentualDescontoTotal = 0.0;

    public Compra(double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException("O valor da compra não pode ser negativo.");
        }
        this.valorTotal = valorTotal;
    }

    public double calcularValorFinal(Cliente cliente) {
        double valorFinal = valorTotal;

        if (cliente.isFrequente()) {
            percentualDescontoTotal += DESCONTO_FREQUENTE;
            valorFinal -= valorTotal * DESCONTO_FREQUENTE;
        }

        if (valorTotal > 500) {
            percentualDescontoTotal += DESCONTO_COMPRA_ALTA;
            valorFinal -= valorTotal * DESCONTO_COMPRA_ALTA;
        }

        return valorFinal;
    }

    public double getPercentualDescontoTotal() {
        return percentualDescontoTotal * 100;
    }
}
