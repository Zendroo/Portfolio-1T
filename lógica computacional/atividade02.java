package projeto_rato;

import javax.swing.JOptionPane;

public class Projeto_rato {


    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Seu nome de Rato:");
        JOptionPane.showMessageDialog(null, "Bem-vindo ao esgoto "+nome);
        String idade = JOptionPane.showInputDialog("Digite sua idade " +nome);
        JOptionPane.showMessageDialog(null, "Você pode entra " +nome);
        String Jeru = JOptionPane.showInputDialog("Sente-se para comer");
        JOptionPane.showMessageDialog(null,"Graças a Deus pai!");
        String rp = JOptionPane.showInputDialog("Você quer tomar algo?")
        if(rp.equals("Sim")){
            JOptionPane.showMessageDialog(null, "Vamos então");
        }
        if(rp.equals("Não")){
            JOptionPane.showMessageDialog(null, "Tudo bem meu caro");
            }
        }
    }
