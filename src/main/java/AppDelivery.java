public class AppDelivery {

    private static AppDelivery instancia = new AppDelivery();
    private AppDelivery() {}
    public static AppDelivery getInstancia() {
        return instancia;
    }

    public String receberAberturaPedidoRestaurante(String solicitacao) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Restaurante.getInstancia().receberAberturaPedido(solicitacao);
    }

    public String receberCancelamentoPedidoRestaurante(String solicitacao) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Restaurante.getInstancia().receberCancelamentoPedido(solicitacao);
    }

}
