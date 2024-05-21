public class Aeronave {
     String modelo;
     int capacidadePassageiros;
    double custo;
    public Aeronave(String modelo, int capacidadePassageiros) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }
    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
    public double CalcularCustoDeVoo(){
        return custo;
    }
    @Override
    public String toString() {
        return "Aeronave [modelo=" + modelo + ", capacidadePassageiros=" + capacidadePassageiros + "]";
    }
    
}
