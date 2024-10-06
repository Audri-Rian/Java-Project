public class Moto extends Veiculos {
    private boolean temBau;

    public Moto() {
        super();
    }

    public Moto(String placa, String modelo, String marca, int anoFabricacao, double valorDiaria, boolean temBau) {
        super(placa, modelo, marca, anoFabricacao, valorDiaria);
        this.temBau = temBau;
    }

    public boolean isTemBau() {
        return temBau;
    }

    public void setTemBau(boolean temBau) {
        this.temBau = temBau;
    }
}
