package exercicio01;
public class Main {

    public static void main(String[] args) {
        Funcionario Paulo = new Administrativo("Escritório", "Nome", 40, 2400);
        Funcionario Elaine = new Professor("Química", "Elaine", 32, 2000);
        
        System.out.println(Paulo.exibirDetalhes());
        System.out.println(Elaine.exibirDetalhes());
    }
    
}
