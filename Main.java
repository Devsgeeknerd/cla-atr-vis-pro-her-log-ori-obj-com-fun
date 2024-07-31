// Classe base com um atributo protected.
class Pessoa {
  protected String nome;
  protected int idade;

  // Construtor
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Método protected.
  protected void apresentarDados() {
    System.out.println("Nome: " + nome + ", Idade: " + idade);
  }
}

// Subclasse acessando membros protected da classe base.
class Aluno extends Pessoa {
  private String matricula;

  // Construtor
  public Aluno(String nome, int idade, String matricula) {
    super(nome, idade);
    this.matricula = matricula;
  }

  // Chama o método protected da superclasse.
  public void mostrarInfomacoes() {
    apresentarDados();
    System.out.println("Matricula: " + matricula);
  }
}

public class Main {
  public static void main(String[] args) {
    Aluno aluno = new Aluno("Paulo", 20, "98731154");
    aluno.mostrarInfomacoes();
  }
}
