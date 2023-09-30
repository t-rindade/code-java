package repeticao;

public class Atv001 {
    public static void main(String[] args) {

        String[] listaProfessores = {"Alana", "Thiago", "Samanta", "Alexia", "Odirlei"};

        for (int i = 0; i < listaProfessores.length; i++) {
            System.out.println("O índice atual é: " + i);

            if (i == 0) {
                System.out.println("O número de índice do professor " + listaProfessores[i] + " é zero");
            } else if (i % 2 == 0) {
                System.out.println("O número de índice do professor " + listaProfessores[i] + " é par");
            } else {
                System.out.println("O número de índice do professor " + listaProfessores[i] + " é impar");

            }
        }
    }
}