package br.digitalhouse.CadastroCliente;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoas {
    private List<Pessoa> pessoas = new ArrayList<>();

    public void CadastraPessoa(Pessoa pess){
        pessoas.add(pess);
    }

    public void imprimeCadastro(){
        for (int i=0;i < pessoas.size();i++){
            System.out.println(pessoas.get(i).toString());
        }
    }

}
