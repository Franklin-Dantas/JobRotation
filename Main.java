import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
public class Main {

    public static void menu() {
        System.out.println("");
        System.out.println("01 - Ao final do processamento, qual será o valor da variável SOMA?");
        System.out.println("02 - Calculo a sequência de Fibonacci.");
        System.out.println("03 - Vetor que guarda o valor de faturamento diário de uma distribuidora.");
        System.out.println("04 - Calculo do percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.");
        System.out.println("05 - Inverter os caracteres de um string");
        System.out.println("");
        System.out.println("00 - Encerrar programa");
        System.out.println("");
        System.out.println("     Escolha uma das opções: ");
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int op;
        do {
            menu();
            op = in.nextInt();
            in.nextLine();
            switch (op) {
                default:
                    System.out.println("Opção inválida");
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                case 1:
                    System.out.println("Alternativa 1: ");
                    int resultado = calculoSoma(13);
                    System.out.println("A soma é: " + resultado);
                    break;
                case 2:
                    System.out.print("Informe um número inteiro positivo: ");
                    int numero = in.nextInt();
                    if (numeroFibonacci(numero)) {
                        System.out.println(numero + " pertence à sequência de Fibonacci.");
                    } else {
                        System.out.println(numero + " não pertence à sequência de Fibonacci.");
                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
        } while (op != 0);
    }

    public static int calculoSoma(int limite) {
        int soma = 0, k = 0;

        while (k < limite) {
            k = k + 1;
            soma = soma + k;
        }
        return soma;
    }

    public static boolean numeroFibonacci(int numero) {
        int fibonacciAnterior = 0;
        int fibonacciAtual = 1;
        while (fibonacciAtual < numero) {
            int fibonacciProximo = fibonacciAnterior + fibonacciAtual;
            fibonacciAnterior = fibonacciAtual;
            fibonacciAtual = fibonacciProximo;
        }
        return fibonacciAtual == numero;
    }



}
