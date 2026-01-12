/*
* Crie um programa que simula um jogo de adivinhação, que deve gerar um número
* aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número,
* em até 5 tentativas. A cada tentativa, o programa deve informar se o número
* digitado pelo usuário é maior ou menor do que o número gerado.
*
*/

import java.util.Random;
import java.util.Scanner;

public class Desafio {
    public static void main() {
        // gerar o número aleatoriamente
        Scanner scanner = new Scanner(System.in);
        boolean usuarioAcertou = false;
        int
            valorAleatorio = new Random().nextInt(0,100),
            entradaUsuario;

        System.out.printf("Resposta correta: %d\n", valorAleatorio);

        // ler o valor com um laço for
        for (int i=0; i < 5; i++) {
            System.out.print("Digite seu chute: ");
            entradaUsuario = scanner.nextInt();
            usuarioAcertou = entradaUsuario == valorAleatorio;

            // verificar se é maior, menor ou igual
            if (usuarioAcertou) break;

            System.out.printf("%d é %s que a resposta correta\n", entradaUsuario, entradaUsuario > valorAleatorio ? "maior" : "menor");
        }

        if(usuarioAcertou) {
            System.out.print("Parabéns, você acertou!!!\n");
        } else {
            System.out.printf("A resposta correta era %d\n", valorAleatorio);

        }
    }
}
