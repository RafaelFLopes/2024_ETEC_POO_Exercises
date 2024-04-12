import javax.swing.JOptionPane;

public class Exercicio2_maiorMenor {
    public static void main(String[] args) {
        diferenca(); // Chamada ao método diferenca() para calcular a diferença entre os números
    }
    
    static void diferenca(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o PRIMEIRO número: ")); // Solicita ao usuário que insira o primeiro número
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o SEGUNDO número: ")); // Solicita ao usuário que insira o segundo número

        int resultado; // Variável para armazenar a diferença entre os números

        if (n1 > n2) { // Verifica se o primeiro número é maior que o segundo
            resultado = n1 - n2;
            JOptionPane.showMessageDialog(null, "A diferença é de "+ resultado +" números");
        }
        else if (n1 < n2) { // Verifica se o segundo número é maior que o primeiro
            resultado = n2 - n1;
            JOptionPane.showMessageDialog(null, "A diferença é de "+ resultado +" números");
        }
        else { // Se os números forem iguais exibe esta mensagem
            JOptionPane.showMessageDialog(null, "Os dois números são iguais");
        }
    }
}
