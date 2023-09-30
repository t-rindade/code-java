package condicao;

import java.util.Calendar;
import java.util.Scanner;

public class Atv005 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = leitor.nextInt();

        Calendar calendario = Calendar.getInstance();

        int idade = calendario.get(Calendar.YEAR) - anoNascimento;

        if (idade >= 18) {
            System.out.println("> " + idade + "/18");
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("> " + idade + "/18");
            System.out.println("Você é menor de idade!");
        }

    }
}
