public class Principal {
    public static void main(String[] args) {
        Cachorro primeiroCachorro = new Cachorro();
        primeiroCachorro.nome = "Titico";
        primeiroCachorro.raca = "Buldogue";
        primeiroCachorro.sexo = "M";
        primeiroCachorro.idade = 5;

        Cachorro segundoCachorro = new Cachorro();
        segundoCachorro.nome = "Spike";
        segundoCachorro.raca = "Pastor Alemão";
        segundoCachorro.sexo = "M";
        segundoCachorro.idade = 7;

        System.out.println("Nome do primeiro cachorro: " + primeiroCachorro.nome);
        System.out.println("Raca do primeiro cachorro: " + primeiroCachorro.raca);
        System.out.println("Sexo do primeiro cachorro: " + primeiroCachorro.sexo);
        System.out.println("Idade do primeiro cachorro: " + primeiroCachorro.idade);

        System.out.println("==========================================");

        System.out.println("Nome do segundo cachorro: " + segundoCachorro.nome);
        System.out.println("Raca do segundo cachorro: " + segundoCachorro.raca);
        System.out.println("Sexo do segundo cachorro: " + segundoCachorro.sexo);
        System.out.println("Idade do segundo cachorro: " + segundoCachorro.idade);
    }
}