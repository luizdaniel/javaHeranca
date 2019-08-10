package br.digitalhouse.herancaClasseAbstrata;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Crianca extends Pessoa {

    public Crianca(String nome, String sexo) {
        super(nome, sexo);
    }

    @Override
    public void respirar(String nome) {
        System.out.println("Respirando " + nome);
    }

    @Override
    public boolean estudar(boolean status) {
        if(status){
            System.out.println("A criança tá estudando!");
            return true;
        }else {
            System.out.println("A criança NÃO tá estudando!");
            return false;
        }
    }

}
