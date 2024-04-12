import javax.swing.JOptionPane;

public class Exercicio4_hipotenusa {
    public static void main(String[] args) {
        statusHip(); // Chama o método para calcular a hipotenusa e exibir o resultado
    }
    static void statusHip(){  // Método para solicitar os valores da base e altura e exibir a hipotenusa
        JOptionPane.showMessageDialog(null, "Descobrir valor da hipotenusa de um triângulo"); // Exibe uma mensagem para o usuário
        Float baseTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da base do triângulo: ")); // Solicita ao usuário que insira o valor da base do triângulo
        Float alturaTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da altura do triângulo: ")); // Solicita ao usuário que insira o valor da altura do triângulo

        String texto = hipotenusa(baseTriangulo, alturaTriangulo); // Chama o método para calcular a hipotenusa e armazena o resultado em uma string
        JOptionPane.showMessageDialog(null, texto); // Exibe o resultado da hipotenusa
    }
    static String hipotenusa(Float bT, Float aT){ // Método para calcular a hipotenusa
        Float Hipotenusa = (bT * bT) + (aT * aT); // Calcula a hipotenusa utilizando o teorema de Pitágoras

        return "Resultado da hipotenusa é igual a: " + Math.sqrt(Hipotenusa); // Retorna uma string com o resultado da hipotenusa
    }
}
