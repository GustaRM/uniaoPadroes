package abstractfactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ClienteTest {

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("ContratoPF", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = new FabricaPF();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("ProcuracaoPF", cliente.emitirProcuracao());
    }

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("ContratoPJ", cliente.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = new FabricaPJ();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("ProcuracaoPJ", cliente.emitirProcuracao());
    }

    @Test
    public void deveRetornarNomeEscola() {
        Fabrica.getInstance().setNomeEscola("Escola 1");
        assertEquals("Escola 1", Parametros.getInstance().getNomeEscola());
    }

    @Test
    public void deveRetornarUsuarioLogado() {
        Parametros.getInstance().setUsuarioLogado("Usuario 1");
        assertEquals("Usuario 1", Parametros.getInstance().getUsuarioLogado());
    }


}
