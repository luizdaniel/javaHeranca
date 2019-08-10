package br.digitalhouse.herancaClasseAbstrata;

public class Principal {
    public static void main(String[] args) {
        Crianca bebe = new Crianca("Maria", "F");
        System.out.println(bebe.getNome());

        bebe.estudar(true);
        bebe.respirar("Julia");

//        Pessoa pesA = new Pessoa("Ana", "F");
//        pesA.estudar(false);
//        pesA.cadastroPessoa("Joao");
//        pesA.cadastroPessoa("AAA", "bbb");
//        pesA.cadastroPessoa("Joao", "", "k");

    }
}
