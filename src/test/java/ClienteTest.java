
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {


    @Test
    void deveFazerPedidoRestaurante() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>Restaurante preparando: Pizza",
                cliente.fazerPedidoRestaurante("Pizza"));
    }

    @Test
    void deveCancelarPedidoRestaurante() {
        Cliente cliente = new Cliente();
        assertEquals("A Ouvidoria agradece seu contato.\nO Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>Restaurante cancelou o pedido: Pizza",
                cliente.cancelarPedidoRestaurante("Pizza"));
    }

}
