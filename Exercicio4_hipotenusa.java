import javax.swing.JOptionPane;

public class Exercicio4_hipotenusa {
    public static void main(String[] args) {
        statusHip();
    }
    static void statusHip(){
        JOptionPane.showMessageDialog(null, "Descobrir valor da hipotenusa de um triângulo");
        Float baseTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da base do triângulo: "));
        Float alturaTriangulo = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da altura do triângulo: "));

        String texto = hipotenusa(baseTriangulo, alturaTriangulo);
        JOptionPane.showMessageDialog(null, texto);
    }
    static String hipotenusa(Float bT, Float aT){
        Float Hipotenusa = (bT * bT) + (aT * aT);

        return "Resultado da hipotenusa é igual a: " + Math.sqrt(Hipotenusa);
    }
}
