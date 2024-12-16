Você trabalha em uma startup de programa de milhas que está começando a desenvolver seu sistema agora, para concorrer com a Smiles, Livelo, etc.

A primeira classe para começar codificar já foi modelada em um diagrama de classes por um colega sênior da empresa, que pediu para você implementar em código Java.

``` mermaid
classDiagram
    class Participante {
        + String nome
        + int saldoDePontos
        + Participante(String nome)
        + Participante(String nome, int saldoDePontosInicial)
    }
```

Transforme esse diagrama em código, usando o que você aprendeu nas últimas aulas desse módulo, para criar os construtores, validar os argumentos, etc.

Depois, crie uma classe `Principal` para testar a instanciação de objetos do tipo `Participante`.
