package exercicios;
import javax.swing.JOptionPane;
public class Exercicio02 {

	public static void maiorValor(int n1, int n2) {
		if (n1>n2) {
			JOptionPane.showMessageDialog(null,"O primeiro número (" + n1 + ") é o maior");
		} else {
			JOptionPane.showMessageDialog(null,"O segundo número (" + n2 + ") é o maior");
		}
		
	}
	public static void main(String[] args) {
		//Crie um método que receba 2 números e retorne o maior valor.
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		maiorValor (valor1,valor2);


	}

}
