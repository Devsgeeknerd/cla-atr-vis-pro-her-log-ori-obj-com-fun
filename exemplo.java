// Classe base com um atributo "protected."
class Pessoa {
  String _nome;
  int _idade;

  Pessoa(
    this._nome,
    this._idade,
  );

  // Método protected.
  protected void _apresentarDados(){
    print('Nome: $_nome, Idade: $_idade);
  }
}
