package br.digitalhouse.CadastroCliente;

import java.util.ArrayList;
import java.util.List;

public class TestaCadastro {
    public static void main(String[] args) {
        Data novaData = new Data(10, 8,2020);
        Cliente novoCliente = new Cliente("Maria", novaData, 102);
        novoCliente.imprimeDados();

        Funcionario novoFunc = new Funcionario("Jess", novaData, 2345);
        novoFunc.calculaImposto();
        //novoFunc.imprimeDados();

        Gerente novoGerente = new Gerente("Ana", novaData,123, "TI");
        novoGerente.calculaImposto();
        novoGerente.imprimeDados();

        CadastroPessoas novoCad = new CadastroPessoas();
        novoCad.CadastraPessoa(novoCliente);
        novoCad.CadastraPessoa(novoFunc);
        novoCad.CadastraPessoa(novoGerente);
        novoCad.imprimeCadastro();

        List<Imposto> impostos = new ArrayList<>();
        impostos.add(novoFunc);

    }
}
