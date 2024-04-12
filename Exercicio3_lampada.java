import javax.swing.JOptionPane;

public class Exercicio3_lampada {
    public static void main(String[] args) {
        mostrarEstado();  // Chama o método para exibir o resultado
    }
    static void mostrarEstado(){
        String estadoLamp = JOptionPane.showInputDialog("DEFINE O ESTADO DA LAMPADA:\nEscrever 'SIM' para ligada.\nEscrever 'NÃO' para desligada."); // Solicita ao usuário que defina o estado da lâmpada

        // Verifica o estado da lâmpada e exibe uma mensagem correspondente
        if (estadoLamp.equals("SIM")) {
            JOptionPane.showMessageDialog(null, "ESTADO DA LAMPADA:\nLIGADA.");
        }
        else if (estadoLamp.equals("NÃO")){
            JOptionPane.showMessageDialog(null, "ESTADO DA LAMPADA:\nDESLIGADA.");
        }
        else{ // Verifica o estado da lâmpada e exibe uma mensagem correspondente
            JOptionPane.showMessageDialog(null, "ERRO:\nErro de sintaxe. Verifique se escreveu com letras maiúscolas e utilizou '~'.");
        }
    }
}