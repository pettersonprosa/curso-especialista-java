package br.com.algamilhas;

public class Principal {

    public static void main(String[] args) {

        Participante participante1 = new Participante("João");

        //Deixou de funcionar:
        //Participante participante2 = new Participante("Carla", 12);

        //Deixou de funcionar:
        //Participante participanete3 = new Participante(null, 99);

        participante1.creditarPontos(15);

    }
}
