import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua nome");
        String nome = scanner.next();

        System.out.println("Digite sua sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        // imprimir as informações

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Minha altura é " + altura);
        System.out.println("Minha idade é " + idade);
        

    }
}