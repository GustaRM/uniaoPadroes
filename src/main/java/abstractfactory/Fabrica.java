package abstractfactory;

public class Fabrica {

    private Fabrica() {};
    private static Fabrica instance = new Fabrica();
    public static Fabrica getInstance() {
        return instance;
    }

    public static FabricaAbstrata obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("abstractfactory.Fabrica" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (FabricaAbstrata) objeto;
    }
}
