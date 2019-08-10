package br.digitalhouse.Interfaces;

public class Principal {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro("Bull");
        cao.animalSaudavel("virose");
        cao.animalSaudavel("");
        cao.animalSaudavel(null);

        cao.setIdade(10);
        int idadeCao = cao.calculoIdadeAnimal(89);
        System.out.println("Nova idade: " + idadeCao);

    }
}
