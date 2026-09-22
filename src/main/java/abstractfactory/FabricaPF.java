package abstractfactory;

public class FabricaPF implements FabricaAbstrata {

    @Override
    public Contrato createContrato() {
        return new ContratoPF();
    }

    @Override
    public Procuracao createProcuracao() {return new ProcuracaoPF();}
}
