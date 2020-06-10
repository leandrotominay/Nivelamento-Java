import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159 */




        Locale.setDefault(Locale.US);
        double pi = 3.14159;
        double raio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();
        double area = pi * (raio * raio);
        System.out.printf(" A Area do raio deste circulo é igual a: %.4f", area);





    }
}
