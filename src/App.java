
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio do circulo");
        double raio = entrada.nextDouble();

        double pi = 3.14;
        double r = raio * raio; 
        double A = pi * r;
        
        
        System.out.println("O resultado da area foi de:" + A);

        entrada.close();


    }
}
