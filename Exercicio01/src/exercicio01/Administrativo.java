package exercicio01;

public class Administrativo extends Funcionario {

    public String setor;

    public Administrativo(String setor, String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.setor = setor;
    }

    Administrativo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public double calcularBonusSalario() {
        return super.getSalario();

    }

    @Override
    public String exibirDetalhes() {
        return "Administrativo \n" + super.exibirDetalhes() + "setor=" + setor + '}';

    }
}
