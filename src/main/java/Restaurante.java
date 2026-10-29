public class Restaurante implements Setor{

    private static Restaurante instancia = new Restaurante();
    private Restaurante() {}
    public static Restaurante getInstancia() {
        return instancia;
    }

    public String receberAberturaPedido(String solicitacao) {
        return "Restaurante preparando: " + solicitacao;
    }

    public String receberCancelamentoPedido(String solicitacao) {
        return "Restaurante cancelou o pedido: " + solicitacao;
    }

}
