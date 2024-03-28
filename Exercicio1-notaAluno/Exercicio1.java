import javax.swing.JOptionPane;

public class Exercicio1{
    public static void main(String[] args) {
        lerNota();
    }

    static void lerNota(){
        String aluno = JOptionPane.showInputDialog("Insira o nome do aluno");
        Float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a PRIMEIRA nota do aluno " + aluno));
        Float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a SEGUNDA nota do aluno " + aluno));

        String texto = calcularMedia(nota1, nota2, aluno); 

        JOptionPane.showMessageDialog(null, texto);
    }

    static String calcularMedia(Float n1, Float n2, String al){
        Float resultado = (n1 + n2)/2;
        if (resultado >= 7){
            return "ALUNO: " + al + "\nNOTA FINAL: " + resultado + "\nSITUAÇÃO: APROVADO";
        }
        else{
            return "ALUNO: " + al + "\nNOTA FINAL: " + resultado + "\nSITUAÇÃO: REPROVADO";
        }
    }
}