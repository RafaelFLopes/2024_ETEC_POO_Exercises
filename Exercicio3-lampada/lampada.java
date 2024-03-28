import javax.swing.JOptionPane;

public class lampada {
    public static void main(String[] args) {
        mostrarEstado();
    }
    static void mostrarEstado(){
        String estadoLamp = JOptionPane.showInputDialog("DEFINE O ESTADO DA LAMPADA:\nEscrever 'SIM' para ligada.\nEscrever 'NÃO' para desligada.");

        if (estadoLamp.equals("SIM")) {
            JOptionPane.showMessageDialog(null, "ESTADO DA LAMPADA:\nLIGADA.");
        }
        else if (estadoLamp.equals("NÃO")){
            JOptionPane.showMessageDialog(null, "ESTADO DA LAMPADA:\nDESLIGADA.");
        }
        else{
            JOptionPane.showMessageDialog(null, "ERRO:\nErro de sintaxe. Verifique se escreveu com letras maiúscolas e utilizou '~'.");
        }
    }
}
