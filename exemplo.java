// Classe base com um atributo protected.
class Pessoa {
  protected String nome;
  protected int idade;

  // Construtor
  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  // Método protected.
  protected void _apresentarDados(){
    System.out.println("Nome: " + nome + ", Idade: " + idade);
  }
}
