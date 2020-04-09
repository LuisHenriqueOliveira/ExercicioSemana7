public class Diciplina
{
   //atributos
   private String nome;
   private boolean pratica;
   //construtor
   public Diciplina(String nome, boolean pratica)
   {
      this.nome = nome;
      this.pratica = pratica;
   }
   //Metodo de acesso
   public String getNome()
   {
      return nome;
   }
   public boolean getPratica()
   {
      return pratica;
   }
   //Metodo modificadores
   public void setNome(String nome)
   {
      this.nome = nome;
   }
   public void setPratica(boolean pratica)
   {
      this.pratica = pratica;
   }
   //Metodo getDados
   public String getDados()
   {  
      return "Diciplina: " +nome + "\nAula Pratica: " + pratica;
   }
}