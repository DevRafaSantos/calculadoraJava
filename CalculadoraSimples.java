package secao12_calculadoraSimples;

/*
 * Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração
 * 
 * 1 - Pedir dois números para o usuário (double)
 * 2 - Apresentar uma tabela/texto para escolher a operação
 * 3 - Resgatar a operação que o usuário selecionou
 * 4 - Realizar o calculo
 * 5 - Exibir o resultado
 * 6 - Se a operação escolhida for inválida, exibir mensagem de erro.
 * 
 */
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {

        // Chamando a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Resgatando o primeiro número do usuário
        System.out.println("Digite o primeiro número: ");
        double primeiroDigito = scanner.nextDouble();

        // Resgatando o segundo número do usuário
        System.out.println("Digite o segundo número: ");
        double segundoDigito = scanner.nextDouble();

        // Resgatando a operação
        System.out.println("Escolha a operação:");
        System.out.println("1) Adição (+)");
        System.out.println("2) Multiplicacao (*)");
        System.out.println("3) Divisão (/)");
        System.out.println("4) Subtracao (-)");
        int operador = scanner.nextInt();

        double resultado = 0;

        // Realizando o cálculo
        switch (operador) {
            case 1:
                resultado = adicao(primeiroDigito, segundoDigito);
                break;
            case 2:
                resultado = multiplicação(primeiroDigito, segundoDigito);
                break;
            case 3:
                if(segundoDigito != 0) {

                    resultado = divisao(primeiroDigito, segundoDigito);

                } else {

                    System.out.println("Não é possível dividir por zero!");
                    scanner.close();
                    return;

                }
            case 4:
                resultado = subtracao(primeiroDigito, segundoDigito);
                break;

            default:
                System.out.println("Operação inválida!");
                scanner.close();
                return;
        }

        // Exibição do resultado
        System.out.println("O Resultado da operação é: " + resultado);

        // Fechando o Scanner
        scanner.close();
    
        
    }

    // Funcoes para calculos
    public static double adicao(double a, double b) {
        return a + b;

    }

    public static double multiplicação(double a, double b) {
        return a * b;

    }

    public static double divisao(double a, double b) {
        return a / b;

    }

    public static double subtracao(double a, double b) {
        return a - b;

    }


}