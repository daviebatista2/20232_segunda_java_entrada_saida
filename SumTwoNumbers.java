import javax.swing.JOptionPane;

public class SumTwoNumbers {
    public static void main(String [] args) {
        double primeiroOperando;
        double segundoOperando;
        double resultadoSoma;

        primeiroOperando = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro operando"));
        segundoOperando = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo operando"));
        resultadoSoma = primeiroOperando + segundoOperando;
        JOptionPane.showMessageDialog(null, "O resultado é " + resultadoSoma);
    }
}