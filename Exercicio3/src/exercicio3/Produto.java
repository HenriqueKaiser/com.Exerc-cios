
package exercicio3;

public abstract class Produto {
    private String titulo;
    private double preco;

    
    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }
    public abstract double calcularDesconto();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

  
      public String exibirDetalhes() {
        return "Produto{" + "titulo=" + titulo + ", preco=" + calcularDesconto()+ '}';
    }
    
            
}
