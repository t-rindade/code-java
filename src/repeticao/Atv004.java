package repeticao;

public class Atv004 {
    public static void main(String[] args) {
        int salario = 1000;

        while (salario < 5000) {
            salario += 100;

            System.out.println("O salário ainda é R$" + salario);
        }
        System.out.println("O salário final é R$" + salario);
    }
}