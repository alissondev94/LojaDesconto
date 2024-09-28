public class ClienteImpl implements Cliente {
    private int numeroComprasNoMes;

    public ClienteImpl(int numeroComprasNoMes) {
        if (numeroComprasNoMes < 0) {
            throw new IllegalArgumentException("O número de compras não pode ser negativo.");
        }
        this.numeroComprasNoMes = numeroComprasNoMes;
    }

    @Override
    public boolean isFrequente() {
        return numeroComprasNoMes > 3;
    }
}
