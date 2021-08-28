package exercicios;
import javax.swing.JOptionPane;
public class Exercicio01 {
	
	public static void delta(int a, int b, int c) {
		int result = (b*b)-(4*a*c) ;
		JOptionPane.showMessageDialog(null,"O valor de Delta é: " + result , "RESULTADO", 1);
	}
	public static void main(String[] args) {
		/* Crie um método que receba três valores, 'a', 'b' e 'c', 
		 * que são os coeficientes de uma equação do segundo grau 
		 * e retorne o valor do delta, que é dado por 'b² - 4ac‘.*/
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
				
		delta(n1,n2,n3);
	}

}
