import java.util.Scanner;

public class Leitura {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String movie;
        int yearRelease;
        double score;

        System.out.println("Digite seu filme favorito");
        movie = scan.nextLine();

        System.out.println("Qual o ano de lançamento? ");
        yearRelease = scan.nextInt();

        System.out.println("Qual a avaliação? ");
        score = scan.nextDouble();

        System.out.printf("O filme %s foi lançado em %d e possui %.2f de avaliação", movie, yearRelease, score);
    }
}
