package condicao;

import java.util.Scanner;

public class Atv001 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float primeiraNota = leitor.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float segundaNota = leitor.nextFloat();

        float media = (primeiraNota + segundaNota) / 2;

        if (media >= 6) {
            System.out.println("Meus parabéns!");
            System.out.println("> " + media);
        } else {
            System.out.println("Você não passou. Estude um pouco mais!");
            System.out.println("> " + media);
        }

    }
}
