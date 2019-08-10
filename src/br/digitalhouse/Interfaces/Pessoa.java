package br.digitalhouse.Interfaces;

public class Pessoa extends Animal implements Saudavel, Brincavel{

    public Pessoa(String raca) {
        super(raca);
    }

    @Override
    public void seDivertir() {

    }

    @Override
    public boolean animalSaudavel(String diagnostico) {
        return false;
    }

    @Override
    public int calculoIdadeAnimal(int idade) {
        return 0;
    }
}
