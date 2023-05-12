package exercicio2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            Veiculo gol = new Carro(2, "VW", "gol", 2003);
            Veiculo parati = new Carro(2, "VW", "parati", 2003);
            Veiculo santana = new Carro(2, "VW", "santana", 1994);
            Veiculo celta = new Carro(2, "GM", "Celta", 2005);
            Veiculo bros  = new Moto("Honda", "bros 160", 2017);
            Veiculo twister  = new Moto("Honda", "Twister", 2017);
            Veiculo falcon  = new Moto("Honda", "falcon", 2017);
            Veiculo crosser  = new Moto("Yamaha", "crosser", 2017);
            Veiculo tenere  = new Moto("Yamaha", "tenere", 2017);
            Veiculo superTenere  = new Moto("Yamaha", "Super Teneré", 2017);
            
            List<Veiculo> veiculos = Arrays.asList(gol,parati,santana,celta,bros,twister,falcon,crosser,tenere,superTenere);
            
           veiculos.stream().forEach(v ->{
            System.out.println(v.exibirDetalhes());
        });
        
          
    }

}
