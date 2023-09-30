package condicao;

import java.util.Scanner;

public class Atv002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é positivo ou negativo: ");
        int numero = leitor.nextInt();

        if (numero > 0) {
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("neutro");
        }
    }
}
