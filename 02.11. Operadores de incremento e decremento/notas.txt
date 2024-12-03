# Operadores de incremento e decremento

Quando uma variável recebe outra que está sendo incrementada, temos dois caminhos, se a variável incrementada/decrementada for:

- **Pós-fixada** (`idade++`): a nova variável recebe o valor da variável "idade", e depois a idade é incrementada.
- **Pré-fixada** (`++idade`): a idade é incrementada e, depois, a nova variável recebe esse valor.

```java
public static void main (String[] args) {
    
  int idade = 22;
    idade++;

    System.out.println("Idade incrementada +1 :" + idade); //Saída: 23

    //Pós decremento
    int novaIdade = idade++;

    System.out.println("Idade incrementada +1 :" + idade); //Saída: 24
    System.out.println("Nova idade pós incrementada +1: " + novaIdade); //Saída: 23

    //Pré decremento
    int novaIdadePreIncrementada = ++idade;

    System.out.println("Nova idade pré incrementada +1: " + novaIdadePreIncrementada); //Saída: 25

}
```

