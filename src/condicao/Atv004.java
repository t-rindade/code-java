package condicao;

import java.util.Objects;
import java.util.Scanner;

public class Atv004 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome de usuário: ");
        String usuario = leitor.nextLine();

        System.out.print("Digite a senha: ");
        String senha = leitor.nextLine();

        if (Objects.equals(usuario, "admin") && senha.equals("senha123")) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Nome de usuário ou senha incorretos");
        }
    }
}
