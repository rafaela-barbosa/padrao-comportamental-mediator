public class Pessoa {

    public String fazerPedidoRestaurante(String solicitacao) {
        return AppDelivery.getInstancia().receberAberturaPedidoRestaurante(solicitacao);
    }

    public String cancelarPedidoRestaurante(String solicitacao) {
        return AppDelivery.getInstancia().receberCancelamentoPedidoRestaurante(solicitacao);
    }

}
