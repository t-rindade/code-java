package condicao;

import java.util.Scanner;

public class Atv003 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = leitor.nextInt();

        String dia = null;

        switch (numero) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda-feira";
                break;
            case 3:
                dia = "terça-feira";
                break;
            case 4:
                dia = "quarta-feira";
                break;
            case 5:
                dia = "quinta-feira";
                break;
            case 6:
                dia = "sexta-feira";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                System.out.println("Digito inválido. Digite um número de 1 a 7");
                break;
        }
        System.out.println("O número " + numero + " corresponde a " + dia + ".");
    }
}
