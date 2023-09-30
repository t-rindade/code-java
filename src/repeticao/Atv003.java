package repeticao;

import java.util.Scanner;

public class Atv003 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = leitor.nextInt();
        } while (numero != 0);
    }
}
