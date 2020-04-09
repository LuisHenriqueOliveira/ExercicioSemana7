import javax.swing.*;

public class TesteAtribuicao{
    public static void main (String[] args){
        String nome = JOptionPane.showInputDialog("Nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        String nomeDiciplina = JOptionPane.showInputDialog("Nome da Diciplina");
        String sPratica = JOptionPane.showInputDialog("Aula Pratica? (sim ou nao)");
        boolean pratica = sPratica.equals("sim") ? true : false;

        Professor professor = new Professor(nome, idade);

        Diciplina diciplina = new Diciplina(nomeDiciplina, pratica);

        Atribuicao atribuicao = new Atribuicao(professor, diciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());
        
        nome = JOptionPane.showInputDialog("Nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        nomeDiciplina = JOptionPane.showInputDialog("Nome da Diciplina");
        sPratica = JOptionPane.showInputDialog("Aula Pratica? (sim ou nao)");
        pratica = sPratica.equals("sim") ? true : false;
        
        professor.setNome(nome);
        professor.setIdade(idade);
        diciplina.setNome(nomeDiciplina);
        diciplina.setPratica(pratica);
        
        JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}