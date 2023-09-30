package repeticao;

import java.util.Scanner;

public class Atv002 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = leitor.nextInt();

            if (senha != 123) {
                System.out.println("Senha incorreta!");
            }
        } while (senha != 123);
        System.out.println("Senha correta!");
    }
}
