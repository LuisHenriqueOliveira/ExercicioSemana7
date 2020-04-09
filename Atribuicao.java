public class Atribuicao
{
   //Atibutos
   private Professor professor;
   private Diciplina diciplina;
   //construtor
   public Atribuicao(Professor professor, Diciplina diciplina){
      this.professor = professor;
      this.diciplina = diciplina;
   }
   //metodo de acesso
   public Professor getProfessor(){
      return professor;
   }
   public Diciplina getDiciplina(){
      return diciplina;
   }
   //metodo modificador
   public void setProfessor(Professor professor){
      this.professor = professor;
   }
   public void setDiciplina(Diciplina diciplina){
      this.diciplina = diciplina;
   }
   //metodo getDados
   public String getDados(){
      return professor.getDados() + "\n" + diciplina.getDados();
   }
}