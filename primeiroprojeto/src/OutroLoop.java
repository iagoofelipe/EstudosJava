import java.util.Scanner;

public class OutroLoop {
    static void main() {
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (true) {
            System.out.println("Digite sua avaliação ou -1 para encerrar ");
            nota = scan.nextDouble();

            if(nota == -1) break;

            mediaAvaliacao += nota;
            totalDeNotas++;
        }

        System.out.printf("Média de avaliações: %.2f\nSoma de Notas: %f\nNúmero de Notas: %d\n", totalDeNotas == 0? 0 : mediaAvaliacao/totalDeNotas, mediaAvaliacao, totalDeNotas);
    }
}
