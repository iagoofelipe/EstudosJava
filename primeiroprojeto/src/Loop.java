import java.util.Scanner;

public class Loop {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual a avaliação? ");
            nota = scan.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.printf("Média de avaliações %.2f\n", mediaAvaliacao/3);
    }
}
