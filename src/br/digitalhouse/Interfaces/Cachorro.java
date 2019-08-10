package br.digitalhouse.Interfaces;

public class Cachorro extends Animal implements Saudavel{

    public Cachorro(String raca){
        super(raca);
    }

    @Override
    public boolean animalSaudavel(String diagnostico) {

        if (diagnostico != null && diagnostico != ""){
            System.out.println("O cachorro tá: " + diagnostico);
            return true;
        }else{
            System.out.println("O cachorro tá sem diagnostico ");
            return false;
        }

    }

    @Override
    public int calculoIdadeAnimal(int idade) {
        System.out.println("Soma de idade: " + getIdade());
        return idade;
    }

    @Override
    public void seDivertir() {
        System.out.println("O cão tá se divertindo.");
    }
}
