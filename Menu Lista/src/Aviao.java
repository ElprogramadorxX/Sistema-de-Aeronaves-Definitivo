public class Aviao extends Aeronave{
    int CapacidadeCarga;

    public Aviao(String modelo, int capacidadePassageiros, int capacidadeCarga) {
        super(modelo, capacidadePassageiros);
        CapacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return CapacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        CapacidadeCarga = capacidadeCarga;
    }
    
    public double CalcularCustoDeVoo(){
        return 500 + (10 * getCapacidadePassageiros()) + (5 * getCapacidadeCarga());
    }

    @Override
    public String toString() {
        return super.toString()+"Aviao [CapacidadeCarga=" + CapacidadeCarga + "]";
    }
    
}
