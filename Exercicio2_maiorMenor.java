import javax.swing.JOptionPane;

public class Exercicio2_maiorMenor {
    public static void main(String[] args) {
        diferenca();
    }
    
    static void diferenca(){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o PRIMEIRO número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o SEGUNDO número: "));

        int resultado;

        if (n1 > n2) {
            resultado = n1 - n2;
            JOptionPane.showMessageDialog(null, "A diferença é de "+ resultado +" números");
        }
        else if (n1 < n2) {
            resultado = n1 - n2;
            JOptionPane.showMessageDialog(null, "A diferença é de "+ resultado +" números");
        }
        else {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais");
        }
    }
}
