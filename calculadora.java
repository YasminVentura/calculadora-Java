import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
        Scanner escaneador = new Scanner(System.in);
        do {
            double num1, num2;
            char operador;

            System.out.println("Digite o 1° número: ");
            num1 = escaneador.nextDouble();

            System.out.println("Digite o 2° número: ");
            num2 = escaneador.nextDouble();

            do {
                System.out.println("Digite um operador (+, -, *, /): ");
                operador = escaneador.next().charAt(0);

                if (operador != '+' && operador != '-' && operador != '*' && operador != '/') {
                    System.out.println("ERRO: Operador Inválido! Tente novamente.");
                }
            } while (operador != '+' && operador != '-' && operador != '*' && operador != '/');

            double resultado;

            if (operador == '+') {
                resultado = num1 + num2;
            } else if (operador == '-') {
                resultado = num1 - num2;
            } else if (operador == '*') {
                resultado = num1 * num2;
            } else {
                if (num2==0){
                    do {
                        System.out.println("Não é possível dividir por zero! Digite o 2° numero novamente: ");
                        num2 = escaneador.nextDouble();
                    } while (num2==0);
                }
                resultado = num1 /num2;
            }

            System.out.println("O resultado é " + resultado);

            System.out.println("Deseja continuar calculando? (S/N)");
        }while(escaneador.next().equalsIgnoreCase("S"));
    }
}