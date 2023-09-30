package repeticao;

import java.util.Arrays;
import java.util.List;

public class Atv005 {
    public static void main(String[] args) {

        List<String> listaCarros = Arrays.asList("fiesta", "onix", "fusca", "saveiro");

        listaCarros.forEach(carro -> System.out.println("O carro atual é: " + carro));
    }
}
