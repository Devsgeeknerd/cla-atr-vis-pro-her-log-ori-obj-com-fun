<!-- Título -->
# O Atributo de Visibilidade `Protected`

***Conteúdo da Aula:***

A aula "O Atributo de Visibilidade `Protected`" aprofunda o conceito de encapsulamento na programação orientada a objetos (POO), com ênfase no modificador de visibilidade protected.

Esse modificador, essencial para controlar o acesso a membros de uma classe, é fundamental na criação de hierarquias de herança seguras e eficientes.

Durante a aula, será discutido o uso adequado do protected, comparando-o com outros modificadores de visibilidade, como public e private, e demonstrando sua aplicação prática em projetos de software.

Em algumas situações, é necessário encapsular um atributo ou método para evitar que ele seja acessado diretamente por outros objetos, mas permitindo sua visibilidade em superclasses e subclasses.

Considere o seguinte:

* Não podemos tornar esse atributo ou método público, pois ele ficaria acessível a qualquer objeto da aplicação.
* Também não podemos torná-lo privado, já que isso restringiria o acesso exclusivamente à superclasse.
* Precisamos, portanto, de uma solução intermediária entre public e private.

Nesses casos específicos, utilizamos o modificador de visibilidade **protected**.

Membros protegidos são atributos ou métodos que só podem ser acessados dentro das superclasses e suas respectivas subclasses.

## Objetivos de Aprendizagem

* **Entender o Conceito de Visibilidade em POO:**

  * Compreender a importância do encapsulamento e do controle de acesso aos membros de uma classe;
  * Aprender a diferença entre os modificadores de visibilidade public, private e protected.

* **Compreender o Uso do Modificador Protected:**

  * Definir o modificador protected e seu papel na herança;
  * Entender quando e por que usar protected em comparação com public e private.

* **Implementar o Modificador Protected em Código:**

  * Aprender a aplicar protected em atributos e métodos;
  * Praticar a criação de classes que utilizam protected para proteger membros de classes base.

* **Analisar Cenários Práticos:**

  * Estudar casos onde protected é a escolha ideal para encapsulamento;
  * Avaliar as implicações de usar protected em hierarquias de classes.

## Conteúdo Programático

* **Introdução ao Encapsulamento e Visibilidade:**

  * Revisão do conceito de encapsulamento na POO;
  * Explicação dos modificadores de visibilidade (public, private, protected).

* **Definição e Funcionamento do Protected:**

  * Definição do modificador protected:
    * Como ele difere de `public` e `private`;
    * Regras de acesso:
      * Membros protected são acessíveis dentro da classe onde foram definidos e em suas subclasses, mas não fora dessas classes.
  * Exemplos básicos para ilustrar o conceito.

* **Comparação Entre `Protected`, `Public` e `Private`:**

  * Public:
    * Acesso livre a partir de qualquer lugar.
  * Private:
    * Acesso restrito à classe em que o membro foi definido.
  * Protected:
    * Acesso restrito à classe e suas subclasses.
  * Discussão sobre vantagens e desvantagens de cada modificador.

* **Aplicando Protected em Hierarquias de Herança:**

  * Como protected facilita o design de classes que precisam compartilhar dados ou métodos entre classes base e derivadas.
  * Prática:
    * Criar classes com membros protected e usá-los em subclasses.

* **Cenários e Boas Práticas:**

  * Quando é apropriado usar protected:
    * Proteger atributos que devem ser acessíveis a subclasses, mas não externamente;
    * Compartilhar métodos utilitários entre uma classe base e suas subclasses;
    * Discussão sobre potenciais armadilhas, como violar o princípio de encapsulamento se protected for mal utilizado.

* **Exemplos Práticos e Exercícios:**

  * Exemplo 1:
    * Hierarquia de classes com protected para atributos compartilhados.
  * Exemplo 2:
    * Uso de métodos protected para permitir que subclasses executem operações específicas sem expor a implementação interna.

1. [Exemplo Prático](Main.java)

<!-- Informações -->
## &#8505; Informações

![Visitors](https://api.visitorbadge.io/api/visitors?path=Devsgeeknerd%2Fcla-atr-vis-pro-her-log-ori-obj-com-fun&label=Visitantes&labelColor=%23700070&labelStyle=none&countColor=%23000fff&style=plastic&color=%23ffffff "Total de Visitantes")
&nbsp;
![Followers](https://img.shields.io/github/followers/Devsgeeknerd?style=p&label=Seguidores&labelColor=800080&color=000fff "Total de Seguidores")
&nbsp;
![Watchers](https://img.shields.io/github/watchers/Devsgeeknerd/cla-atr-vis-pro-her-log-ori-obj-com-fun?style=p&label=Observadores&labelColor=800080&color=000fff "Total de Observadores")
&nbsp;
![Stars](https://img.shields.io/github/stars/Devsgeeknerd/cla-atr-vis-pro-her-log-ori-obj-com-fun?style=p&label=Estrelas&labelColor=800080&color=000fff "Total de Estrelas")
&nbsp;
![Forks](https://img.shields.io/github/forks/Devsgeeknerd/cla-atr-vis-pro-her-log-ori-obj-com-fun?style=p&label=Bifurcações&labelColor=800080&color=000fff "Total de Bifurcações")
&nbsp;
![Repo Size](https://img.shields.io/github/repo-size/Devsgeeknerd/cla-atr-vis-pro-her-log-ori-obj-com-fun?style=p&label=Tamanho&labelColor=800080&color=000fff "Tamanho do Repositório")
&nbsp;
![License](https://img.shields.io/github/license/Devsgeeknerd/cla-atr-vis-pro-her-log-ori-obj-com-fun?style=p&label=Licença&labelColor=800080&color=000fff "Licença do Repositório")
