package exercicio01;

public abstract class Funcionario {

    private String nome;
    private int idade;
    private double salario;

    public abstract double calcularBonusSalario();

    public Funcionario() {

    }

    public Funcionario(String nome, int idade, double salário) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salário;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salário) {
        this.salario = salário;
    }

   
    public String exibirDetalhes() {
        return "Funcionario{" + "nome=" + nome + ", idade=" + idade + "\n" + (salario+calcularBonusSalario())+'}';
    }

}
