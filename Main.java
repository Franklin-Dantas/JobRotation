import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("");
        System.out.println("01 - Ao final do processamento, qual será o valor da variável SOMA?");
        System.out.println("02 - Calculo a sequência de Fibonacci.");
        System.out.println("03 - Descubra a lógica e complete o próximo elemento.");
        System.out.println("04 - Qual dos veículos estará mais próximo da cidade de Ribeirão Preto.");
        System.out.println("05 - Inverter os caracteres de um string");
        System.out.println("");
        System.out.println("00 - Encerrar programa");
        System.out.println("");
        System.out.println("     Escolha uma das opções: ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int op, op3;
        do {
            menu();
            op = sc.nextInt();
            sc.nextLine();
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
                    int numero = sc.nextInt();
                    if (numeroFibonacci(numero)) {
                        System.out.println(numero + " pertence à sequência de Fibonacci.");
                    } else {
                        System.out.println(numero + " não pertence à sequência de Fibonacci.");
                    }
                    break;
                case 3:
                    menu3();
                    op3 = sc.nextInt();
                    sc.nextLine();
                    switch (op3) {
                        default:
                            System.out.println("Opção inválida");
                        case 0:
                            System.out.println("Programa encerrado!");
                            break;
                        case 1:
                            int a = 1;
                            for (int i = 0; i < 4; i++) {
                                a += 2;
                            }
                            System.out.println(a); // output: 9
                            break;
                        case 2:
                            int b = 2;
                            for (int i = 0; i < 6; i++) {
                                b *= 2;
                            }
                            System.out.println(b); // output: 128
                            break;
                        case 3:
                            int c = 0;
                            for (int i = 1; i <= 7; i++) {
                                c = i * i;
                            }
                            System.out.println(c); // output: 49
                            break;
                        case 4:
                            int d = 4;
                            for (int i = 0; i < 3; i++) {
                                d = d * d + 20;
                            }
                            System.out.println(d); // output: 100
                            break;
                        case 5:
                            int e = 3;
                            int temp;
                            int ant = 1;
                            for (int i = 0; i < 3; i++) {
                                temp = e;
                                e += ant;
                                ant = temp;
                            }
                            System.out.println(e); // output: 13
                            break;
                        case 6:
                            int f = 19;
                            if (f % 2 == 0) {
                                f += 8;
                            } else {
                                f += 1;
                            }
                            System.out.println(f); // output: 20

                            break;
                    }
                case 4: 
                    System.out.println(veiculoMaisProximo());
                    break;
                case 5:
                    System.out.println("Informe uma palavra que deseja inverter: ");     
                    String palavra = sc.nextLine(); 
                    String palavraInvertida = new StringBuilder(palavra).reverse().toString();
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


    public static String veiculoMaisProximo() {
        int distanciaCidades = 100; // Distância entre Ribeirão Preto e Franca
        int velocidadeCarro = 110; // Velocidade do carro em km/h
        int velocidadeCaminhao = 80; // Velocidade do caminhão em km/h
        
        double distanciaCarro = distanciaCidades / 2; // Distância percorrida pelo carro quando se cruzarem (em km)
        double distanciaCaminhao = distanciaCidades - distanciaCarro; // Distância percorrida pelo caminhão quando se cruzarem (em km)
        double tempoCaminhao = (distanciaCaminhao / velocidadeCaminhao) + (2 * 5.0 / 60.0); // Tempo que o caminhão leva para chegar ao cruzamento, considerando 2 pedágios (em horas)
        double tempoCarro = distanciaCarro / velocidadeCarro; // Tempo que o carro leva para chegar ao cruzamento (em horas)
        
        // Verifica qual veículo estará mais próximo de Ribeirão Preto quando se cruzarem
        if (tempoCaminhao < tempoCarro) {
            return "O caminhão estará mais próximo de Ribeirão Preto quando se cruzarem.";
        } else {
            return "O carro estará mais próximo de Ribeirão Preto quando se cruzarem.";
        }
    }
    

    public static String inverterString(String palavra) {
        StringBuilder palavraInvertida = new StringBuilder(palavra).reverse();
        return palavraInvertida.toString();
    }
    

    public static void menu3() {
        System.out.println("");
        System.out.println("Informe qual dessas senquencias deseja desvendar: ");
        System.out.println("1) 1, 3, 5, 7, ___ ");
        System.out.println("2) 2, 4, 8, 16, 32, 64, ____");
        System.out.println("3) 0, 1, 4, 9, 16, 25, 36, ____");
        System.out.println("4) 4, 16, 36, 64, ____");
        System.out.println("5) 1, 1, 2, 3, 5, 8, ____");
        System.out.println("6) 2,10, 12, 16, 17, 18, 19, ____ ");
        System.out.println("");
        System.out.println("00 - Encerrar programa");
        System.out.println("");
        System.out.println("     Escolha uma das opções: ");
    }
}
