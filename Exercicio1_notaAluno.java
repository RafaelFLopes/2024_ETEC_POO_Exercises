import javax.swing.JOptionPane;

public class Exercicio1_notaAluno{
    public static void main(String[] args) {
        lerNota();
    }

    static void lerNota(){
        String aluno = JOptionPane.showInputDialog("Digite o nome do aluno"); // Solicita ao usuário que digite o nome do aluno

        Float nota = 0F; // Inicializa a variável nota do tipo Float com zero

        for (int i = 0; i < 2; i++) { // Loop for para solicitar ao usuário que insira as notas do aluno
            Float numero = Float.parseFloat(JOptionPane.showInputDialog("Digite a " + (i + 1) + "º nota do aluno: " + aluno));
            nota += numero; // Adiciona a nota à variável nota
        }

        String texto = calcularMedia(nota, aluno); // Chama o método calcularMedia() passando a nota e o nome do aluno como argumentos e armazena o resultado em uma string

        JOptionPane.showMessageDialog(null, texto); // Exibe o resultado da média e a situação do aluno
    }

    static String calcularMedia(Float not, String al){
        Float resultado = not / 2; // Calcula a média do aluno
        if (resultado >= 7){ // Verifica se o aluno está aprovado ou reprovado
            return "ALUNO: " + al + "\nNOTA FINAL: " + resultado + "\nSITUAÇÃO: APROVADO";
        }
        else{
            return "ALUNO: " + al + "\nNOTA FINAL: " + resultado + "\nSITUAÇÃO: REPROVADO";
        }
    }
}