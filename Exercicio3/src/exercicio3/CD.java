
package exercicio3;


public class CD extends Produto{
    private String artista;
    
    public CD(String titulo, double preco) {
        super(titulo, preco);
    }

    @Override
    public double calcularDesconto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
