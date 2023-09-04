import java.util.Scanner;
public class SumTwoNumbers {
    public static void main(String [] args) {
        double primeiroOperando;
        double segundoOperando;
        double resultadoSoma;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro operando"); 
        primeiroOperando = leitor.nextDouble();
        System.out.println("Digite o segundo operando"); 
        segundoOperando = leitor.nextDouble();
        resultadoSoma = primeiroOperando + segundoOperando;
        leitor.close();
        System.out.println("O resultado é: " + resultadoSoma);
    }
}
