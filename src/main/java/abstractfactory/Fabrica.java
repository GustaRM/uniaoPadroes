package abstractfactory;

public class Fabrica {

    private Fabrica() {};
    private static Fabrica instance = new Fabrica();
    public static Fabrica getInstance() {
        return instance;
    }

    public FabricaAbstrata obterFabrica(String fabrica) {
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(fabrica);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fabrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fabrica inválida");
        }
        return (FabricaAbstrata) objeto;
    }
}