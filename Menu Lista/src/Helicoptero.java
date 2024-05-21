public class Helicoptero extends Aeronave{
    boolean resgate;

    public Helicoptero(String modelo, int capacidadePassageiros, boolean resgate) {
        super(modelo, capacidadePassageiros);
        this.resgate = resgate;
    }

    public boolean isResgate() {
        return resgate;
    }

    public void setResgate(boolean resgate) {
        this.resgate = resgate;
    }
    
    public double CalcularCustoDeVoo(){
        if (resgate == false) {
            return 2000 + (15 * getCapacidadePassageiros());
        } else {
            return 2000 + (15 * getCapacidadePassageiros()) + 1000; 
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Helicoptero [resgate=" + resgate + "]";
    }
    
}
