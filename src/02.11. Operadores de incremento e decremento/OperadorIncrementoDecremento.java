public class OperadorIncrementoDecremento {

    public static void main(String[] args) {
        
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

}
