
package exercicio2;
public class Moto extends Veiculo{
    private boolean possuiParidaEletrica;

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        this.possuiParidaEletrica = possuiParidaEletrica;
    }

    public double VelocidadeMaxima() {
        return 180.0;
    }
    
    
}
